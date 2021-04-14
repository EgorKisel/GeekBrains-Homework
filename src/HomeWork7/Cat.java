package HomeWork7;

public class Cat {
    public String name;
    public int appetite;
    public boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
       satiety = plate.decreaseFood(appetite);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satiety=" + satiety +
                '}';
    }

    public String getName() {
        return name;
    }
}