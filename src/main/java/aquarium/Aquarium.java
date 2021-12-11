package aquarium;

import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Aquarium {

    static final int CAPACITY = 20;
    private List<Fish> aquarium = new ArrayList<>();


    public Aquarium() {

    }

    public void addFish(Fish fish) {
        if (CAPACITY>aquarium.size()*5){
            aquarium.add(fish);}
        else throw new IllegalStateException("Can not add fish because there is no more space.");

    }

    public void removeFish(int max) {
        for (int i = 0; i < aquarium.size(); i++) {
            if (aquarium.get(i).getWeight() > max) {
                aquarium.remove(i);
            }
        }
    }

    public void feed(){
        for (int i=0; i<aquarium.size(); i++){
        aquarium.get(i).feed();}
    }

    public List<String> getStatus() {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < aquarium.size(); i++) {
            result.add(aquarium.get(i).getStatus());

        }
        return result;
    }

    public int getNumberOfFishWithMemoryLoss() {
        int sum=0;
        for (int i = 0; i < aquarium.size(); i++) {
            if (aquarium.get(i).hasMemoryLoss()) sum++;
        }
        return sum;
    }

    public boolean isThereFishWithGivenColor(String a){
        boolean exist=false;
        for (int i = 0; i < aquarium.size(); i++) {
            if (aquarium.get(i).getColor().equals(a)) exist=true;
        }
        return exist;
    }
    public Fish getSmallestFish() {
        int min=10000;
        Fish fish = aquarium.get(0);
        for (int i = 0; i < aquarium.size(); i++) {
            if (aquarium.get(i).getWeight()<min) {
                min = aquarium.get(i).getWeight();
                fish = aquarium.get(i);
            };
            }
        return fish;
    }

}
