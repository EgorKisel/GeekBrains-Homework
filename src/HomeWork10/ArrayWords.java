package HomeWork10;
import java.util.*;

public class ArrayWords {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "Lada", "Nissan", "Mercedes", "BMW", "Audi", "Toyota", "Volkswagen",
                "Opel", "Range Rover", "Jaguar", "Toyota", "Volkswagen",
                "BMW", "Audi", "Toyota", "Subaru", "Subaru", "Tesla",
                "Audi", "Toyota", "Subaru", "Toyota", "Lada", "Jaguar"
        );

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Массив автомобилей");
        System.out.println(words.toString());
        System.out.println("Уникальные автомобильные марки");
        System.out.println(unique.toString());
        System.out.println("Частота встречаемости каждой марки в массиве автомобилей");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }


    }

}
