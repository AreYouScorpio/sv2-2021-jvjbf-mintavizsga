package filemanipulation;

import jdk.internal.icu.lang.UCharacterDirection;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductFileManager {

    public static List<Product> getProducts() {
        return Products;
    }

    private static List<Product> Products = new ArrayList<>();
    private static List<String> lines = new ArrayList<>();
    private static List<String> writeLines = new ArrayList<>();


    public List<String> readProductsFromFile(Path path) {
        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                String s[] = line.split(";");
                Products.add(new Product(s[0], s[1], Integer.parseInt(s[2])));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can't read file!", ioe);
        }
        return lines;
    }

    public void writePriceOverToFile(Path path, int price){
        try{
for (Product line : Products){
    if (line.getPrice()>price) {
        writeLines.add(line.getID()+";"+line.getName()+";"+line.getPrice());
    }
    Files.write(Paths.get(path.toString()), writeLines);
}} catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }

    }

    }








