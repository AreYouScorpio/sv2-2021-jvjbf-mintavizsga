package owlcounter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class OwlCounter {
    private static List<String> owls;


    public List<String> readFromFile(Path path) {
        try {
            owls = Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }
        return owls;
    }

    public int getNumberOfOwls(String county) {
        for (String line : owls) {
            if (line.contains(county)) return Integer.parseInt((line.substring(line.indexOf('=') + 1)).trim());
            else throw new IllegalArgumentException("No such county in Hungary!");
        }
        return 0;
    }

    public int getNumberOfAllOwls() {
        int sum = 0;
        for (String line : owls) {
            sum += Integer.parseInt((line.substring(line.indexOf('=') + 1)).trim());
        }
        return sum;
    }

    ;

}
