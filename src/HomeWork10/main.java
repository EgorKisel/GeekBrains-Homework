package HomeWork10;

public class main {
    public static void main(String[] args){
        System.out.println("Телефонная книга");
        Phonebook phonebook = new Phonebook();
        System.out.println("-----------------");

        System.out.println("Добавляем данные в справочник");
        phonebook.add("Шевенин", "524903");
        phonebook.add("Уваров", "553146");
        phonebook.add("Петров", "580123");
        phonebook.add("Петров", "584142");
        phonebook.add("Фролов", "640842");
        phonebook.add("Фролов", "664231");
        phonebook.add("Кольцов", "505547");
        phonebook.add("Абрамкин", "514562");
        phonebook.add("Иванов", "594822");
        phonebook.add("Сидоров", "573441");
        phonebook.add("Кривцов", "506671");
        phonebook.add("Сафронюк", "515684");
        System.out.println("-----------------");

        System.out.println("Получаем номера");
        System.out.println("Иванов");
        System.out.println(phonebook.get("Иванов"));
        System.out.println("Петров");
        System.out.println(phonebook.get("Петров"));
        System.out.println("Сидоров");
        System.out.println(phonebook.get("Сидоров"));
        System.out.println("Фролов");
        System.out.println(phonebook.get("Фролов"));
        System.out.println("-----------------");

        System.out.println("Случай отсутствия записи");
        System.out.println("Королёв");
        System.out.println(phonebook.get("Королёв"));
        System.out.println("-----------------");

        System.out.println("Пробуем записать существующий номер");
        phonebook.add("Иванов", "594822");
        System.out.println("Иванов");
        System.out.println(phonebook.get("Иванов"));
    }
}
