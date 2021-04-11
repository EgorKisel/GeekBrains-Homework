package HomeWork6;

public class Dog extends Animals {
    protected int sweem;
    public Dog(String name, int run, int sweem) {
        this.name = name;
        this.run = run;
        this.sweem = sweem;
    }
    public void dogInfo() {
        System.out.println("DogName: " + name + " /может пробежать: " + run+ " метров" + " /может проплыть:" + sweem + " метров");
    }
}