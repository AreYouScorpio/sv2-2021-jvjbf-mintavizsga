package aquarium;

public class Clownfish extends Fish {

    private boolean hasMemoryLoss;

    public Clownfish(String name, int weight, String color) {
        super(name, weight, color);
        this.hasMemoryLoss=false;
    }







    @Override
    public void feed(){
        weight++;
    }

    @Override
    public boolean hasMemoryLoss() {
        return hasMemoryLoss;
    }



}


