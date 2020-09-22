public interface Shape {
    double square();
}

class Triangle implements Shape{
    double a,b,c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double square() {
        return Math.sqrt(p()*(p()-a)*(p()-b)*(p() - c));
    }

    private double p() {
        return (a+b+c)/2;
    }
}

class Rectangle implements Shape {
    double a,b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double square() {
        return a*b;
    }
}

class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double square() {
        return 3.14*radius*radius;
    }
}