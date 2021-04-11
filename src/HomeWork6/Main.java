package HomeWork6;

public class Main {
    public static void main(String[] args) {
        Animals Cat = new Animals();
        Cat cat = new Cat("Барсик", 200, false);

        cat.catInfo();

        Animals Dog = new Animals();
        Dog dog = new Dog("Бим", 500, 10);

        dog.dogInfo();

    }


}
