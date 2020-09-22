public class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public int getScholarship(){
        return (averageMark == 5)?100:80;
    }
}

class Aspirant extends Student {
    int hoursOfScienceWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, int hoursOfScienceWork) {
        super(firstName, lastName, group, averageMark);
        this.hoursOfScienceWork = hoursOfScienceWork;
    }

    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    @Override
    public int getScholarship() {
        return (averageMark == 5)?200:180;
    }
}
