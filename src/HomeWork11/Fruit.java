package HomeWork11;

public abstract class Fruit implements SpecificFruit {
    private final float weight;

    public Fruit (float weight){
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }
}
