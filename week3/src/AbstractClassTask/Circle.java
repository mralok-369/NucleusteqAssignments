package AbstractClassTask;

public class Circle extends Shape {
	double radius;

    Circle(double x) {
        this.radius = x;
    }

    @Override
    void perimeter() {
        double perimeter = (Math.PI*radius*2);
        System.out.println("Circle's perimeter is : " + perimeter);
    }

    @Override
    void area() {
        double area = (Math.PI*radius*radius);
        System.out.println("Circle's area is : " + area);
    }
}
