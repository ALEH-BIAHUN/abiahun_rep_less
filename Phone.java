public class Phone {
    int number;
    String model;
    int weight;

    void receiveCall(String name) {              //создали метод receiveCall
        System.out.println("Звонит " + name);
    }
    int getNumber() {                           //создали метод getNumber (возвращает телефон)
        return number;
    }
}
