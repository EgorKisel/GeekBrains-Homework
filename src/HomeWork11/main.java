package HomeWork11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class main {
    public static void main(String[] args) {
        FruitBox<Apple> appleFruitBox1 = new FruitBox<>(5, new Apple(), new Apple(), new Apple());
        new Apple[] {new Apple(), new Apple(), new Apple()}
        FruitBox<Apple> appleFruitBox2 = new FruitBox<>(2);
        FruitBox<Fruit> multiFruitBox = new FruitBox<>(2);

        System.out.println(appleFruitBox1.getWeight());
        appleFruitBox1.transferFruitsToAnotherBox(appleFruitBox2);
        System.out.println(appleFruitBox1.getWeight());
        System.out.println(appleFruitBox2.getWeight());

    }

    public static <T>List <T> arrayToList (T[] array) {return new ArrayList<>(Arrays.asList(array)); }
    public static void swapArrayElementsObj (Object[] arr, int i1, int i2){
        Object element = arr [i2];
        arr [i2] = arr [i1];
        arr [i1] = element;
    }
    public static <T> void swapArrayElements (T [] arr, int i1, int i2){
        T element = arr [i2];
        arr [i2] = arr [i1];
        arr [i1] = element;
    }
}
