package HomeWork6;

public class Cat extends Animals {
    protected boolean sweem;
    public Cat(String name, int run, boolean sweem) {
        this.name = name;
        this.run = run;
        this.sweem = sweem;
    }
    public void catInfo() {
        System.out.println("CatName: " + name + " /может пробежать: " + run+ " метров" + " /кот не умеет плавать " + sweem);
    }

}
