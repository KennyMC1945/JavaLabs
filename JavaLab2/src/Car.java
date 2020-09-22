public abstract class Car {
    String model;
    String carClass;
    double weight;
    Engine engine;

    public Car(String model, String carClass, double weight, Engine engine) {
        this.model = model;
        this.carClass = carClass;
        this.weight = weight;
        this.engine = engine;
    }

    abstract void start();
    abstract void stop();
    void turnRight(){
        System.out.println("Поворот направо");
    }
    void turnLeft() {
        System.out.println("Поворот налево");
    }

    void printInfo() {
        System.out.println("Модель: "+model);
        System.out.println("Класс: " + carClass);
        System.out.println("Вес: " + weight);
        System.out.println("Мощность двигателя: " + engine.power);
        System.out.println("Производитель двигателя: " + engine.manufacturer);
    }
}

class Lorry extends Car{
    public Lorry(String model, String carClass, double weight, Engine engine) {
        super(model, carClass, weight, engine);
    }

    @Override
    void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    void stop() {
        System.out.println("Грузовик остановился");
    }



}

class SportCar extends Car {
    @Override
    void start() {
        System.out.println("Sportcar поехал");
    }

    public SportCar(String model, String carClass, double weight, Engine engine) {
        super(model, carClass, weight, engine);
    }

    @Override
    void stop() {
        System.out.println("Sportcar остановился");
    }
}