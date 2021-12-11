package aquarium;

public class Tang extends Fish{

    private boolean hasMemoryLoss;


    public Tang(String name, int weight, String color) {
        super(name, weight, color);
        this.hasMemoryLoss=true;
    }

    @Override
    public void feed(){
        weight++;
    }

    @Override
    public boolean hasMemoryLoss() {
        return hasMemoryLoss;
    }

    @Override
    public String getStatus() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append(", weight: ").append(this.weight).append(", color: ").append(this.color).append(", short-term memory loss: ").append(this.hasMemoryLoss);
        return sb.toString();
    }
}
