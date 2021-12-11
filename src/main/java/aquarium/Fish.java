package aquarium;

public abstract class Fish {
    String name;
    int weight;
    String color;
    boolean hasMemoryLoss;


    public Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        //this.hasMemoryLoss = hasMemoryLoss;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }


    public boolean hasMemoryLoss() {
        return hasMemoryLoss;
    }


    public String getStatus() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append(", weight: ").append(this.weight).append(", color: ").append(this.color).append(", short-term memory loss: ").append(this.hasMemoryLoss);
        return sb.toString();
    }

    public void feed() {
        weight++;
    }



}


