package HomeWork7;

public class main {
    public static void main(String[] args) {
        Cat[] allCats = new Cat[4];
        allCats[0] = new Cat("Марсель", 5);
        allCats[1] = new Cat("Барсик", 30);
        allCats[2] = new Cat("Мурзик", 10);
        allCats[3] = new Cat("Всапогах", 45);

        Plate plate = new Plate(100);
        for (int i = 0; i < allCats.length; i++) {
            allCats[i].eat(plate);
            System.out.println(allCats[i]);
        }

        plate.decreaseFood(15);
        plate.info();
        plate.addFood(50);
        plate.info();
    }
}