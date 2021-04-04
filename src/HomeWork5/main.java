package HomeWork5;

public class main {

    public static void main(String[] args) {
        Worker [] yrLoc = new Worker[5];// yrLoc - Уральские локомотивы
        yrLoc[0] = new Worker ("Кисель Егор", "мастер", "kisel1989@mail.ru","89652519673",1300000,31);
        yrLoc[1] = new Worker("Шевенин Алексей", "слесарь", "shevenin@mail.ru", "89687983454",50000,35);
        yrLoc[2] = new Worker("Уваров Алексей", "слесарь-электрик", "yvarov@mail.ru", "89617928485",60000,43);
        yrLoc[3] = new Worker("Петров Дмитрий", "инженер", "petrov@mail.ru", "89117412343",70000,42);
        yrLoc[4] = new Worker("Филиппов Владимир", "слесарь", "filippov@mail.ru", "86109234872",70000,56);
        for (Worker worker: yrLoc)
            if (worker.getAge ()>40)
                System.out.println(worker);
    }




}
