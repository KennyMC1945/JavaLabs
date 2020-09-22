public class Animal {
    String food;
    String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise(){
        System.out.println("Животное орет");
    }
    public void eat() {
        System.out.println("Животное ест " + food );
    }

    public void sleep() {
        System.out.println("Животное уснуло в " + location);
    }
}

class Dog extends Animal {
    int walkingHours; // Количество прогулочных часов

    public Dog(String food, String location, int walkingHours) {
        super(food, location);
        this.walkingHours = walkingHours;
    }

    public Dog(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Собака лает");
    }
    @Override
    public void eat() {
        System.out.println("Собака ест " + food);
    }
    @Override
    public void sleep() {
        System.out.println("Собака спит "+ location);
    }
}

class Cat extends Animal {
    int mouseCount; // Кол-во пойманных мышей

    public Cat(String food, String location, int mouseCount) {
        super(food, location);
        this.mouseCount = mouseCount;
    }

    public Cat(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise(){
        System.out.println("Кошка мяукает");
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест "  + food);
    }

    @Override
    public void sleep() {
        System.out.println("Кошка спит");
    }

}

class Horse extends Animal {
    int maxSpeed;

    public Horse(String food, String location, int maxSpeed) {
        super(food, location);
        this.maxSpeed = maxSpeed;
    }

    public Horse(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошадь ржет");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест "+ food);
    }

    @Override
    public void sleep() {
        System.out.println("Лошадь спит стоя");
    }
}