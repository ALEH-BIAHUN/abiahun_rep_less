public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone(); //создали первый объект (класс - Phone)
        Phone phone2 = new Phone(); //создали второй объект (класс - Phone)

        phone1.number = 4578956;
        phone1.model = "Sumsung";
        phone1.weight = 134;

        phone2.number = 457890000;
        phone2.model = "Apple";
        phone2.weight = 106;

        System.out.println("Номер первого телефона - " + phone1.getNumber());
        System.out.println("Модель первого телефона - " + phone1.model);
        System.out.println("Вес первого телефона - " + phone1.weight);
        System.out.println();

        System.out.println("Номер второго телефона - " + phone2.getNumber());
        System.out.println("Модель второго телефона - " + phone2.model);
        System.out.println("Вес второго телефона - " + phone2.weight);
        System.out.println();

        phone1.receiveCall("мама");  //вызываем метод receiveCall для объекта phone1
        phone2.receiveCall("папа");  //вызываем метод receiveCall для объекта phone2
        phone2.receiveCall("подружка", 5555555);  //вызываем метод receiveCall (перегруженный) для объекта phone2
    }
}