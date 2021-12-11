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
        this.hasMemoryLoss = false;
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
        sb.append(name).append(", weight: ").append(weight).append(", color: ").append(color).append(", short-term memory loss: ").append(hasMemoryLoss);
        return sb.toString();
    }

    public void feed() {
        weight++;
    }



}


