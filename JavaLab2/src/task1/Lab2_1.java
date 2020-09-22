package task1;

public class Lab2_1 {
    public static void main(String[] args) {
        System.out.println("Задача 1. Класс Phone");
        Phone[] phones = new Phone[3];
        // Первый телефон
        phones[0] = new Phone();
        phones[0].number = "+79561235122";
        phones[0].model = "Samsung";
        phones[0].weight = 65;
        // Второй телефон
        phones[1] = new Phone("+79859210534","Alcatel");
        phones[1].weight = 45;
        // Третий телефон
        phones[2] = new Phone("+796390219345","Nokia", 52);
        for (Phone p: phones) {
            System.out.println(p.number + ": "+ p.model+" весом в "+ p.weight + " г.");

        }
        phones[0].receiveCall("task3.Student");
        phones[0].receiveCall("task3.Student", "+79859605213");
        phones[0].sendMessage("+796390123456","+79035123545");
    }

}


