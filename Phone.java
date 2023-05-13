public class Phone {
    int number;
    String model;
    int weight;


    Phone(int number, String model, int weight){ // Вызов из конструктора с тремя параметрами конструктор с двумя.
        this(number, model);
        this.weight = weight;
    }

    Phone(int number, String model){
        this.number = number;
        this.model = model;
    }

    Phone(){
    }

    void receiveCall(String name) {              //создали метод receiveCall
        System.out.println("Звонит " + name);
    } //добавили в класс Phone метод receiveCall

    int getNumber() {                           //создали метод getNumber (возвращает телефон)
        return number;
    }   //добавили в класс Phone метод getNumber, который возвращает number
}
