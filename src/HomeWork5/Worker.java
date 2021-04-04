package HomeWork5;

public class Worker {
    private String Person;
    private String Post;
    private String Email;
    private String phone;
    private int Wages;
    private int age;


    public Worker (String Person, String Post, String Email, String phone, int Wages, int age) {
       this.Person = Person;
       this.Post = Post;
       this.Email = Email;
       this.phone = phone;
       this.Wages = Wages;
       this.age = age;
    }

    public int getAge() {
        return age;
    }


    public String toString () {
        return(Person + "\n"
                + Post + "\n"
                + Email + "\n"
                + phone + "\n"
                + Wages + "\n"
                + age);
    }

}
