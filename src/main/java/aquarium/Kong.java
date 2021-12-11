package aquarium;

public class Kong extends Fish{

    boolean shorttermmemoryloss = true;

    public Kong(String name, int weight, String color) {
        super(name, weight, color);
        this.hasMemoryLoss=false;

    }


    @Override
    public void feed(){
        weight +=2;
    }

    @Override
    public boolean hasMemoryLoss() {
        return hasMemoryLoss;
    }

}
