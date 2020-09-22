package task3;

public class Lab2_3 {
    public static void main(String[] args) {
        System.out.println("Задача 3. Наследование");
        Student[] students = new Student[4];
        students[0] = new Student("Pavel", "Astanov", "A21",4.5);
        students[1] = new Student("Alex", "Krilov", "B21",5);
        students[2] = new Aspirant("Ivan", "Stepanov", "A11",4.2);
        students[3] = new Aspirant("Pavel", "Verandin", "B23",5);
        for(Student s: students){
            // Срабатывает метод из соответствующего класса
            System.out.println("Стипендия  " + s.firstName+ " " + s.lastName+" равна " + s.getScholarship());
        }
    }
}
