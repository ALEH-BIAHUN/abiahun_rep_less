public class Phone {
    int number;
    String model;
    int weight;

    Phone(int num, String mod, int wei){
        number = num;
        model = mod;
        weight = wei;
    }

    Phone(int num, String mod){
        number = num;
        model = mod;
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
