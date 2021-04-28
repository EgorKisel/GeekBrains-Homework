package HomeWork11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FruitBox <T extends Fruit & SpecificFruit>{

    private final List <T> container;
    private int capacity;

    public FruitBox (int capacity, T... fruits){
        this.container = new ArrayList<>(Arrays.asList(fruits));
        this.capacity = capacity;
    }
    public float getWeight(){
        float commonWeight = 0.0f;
        for (T fruit: container) {
            commonWeight += fruit.getWeight();
        }
        return commonWeight;
    }

}
