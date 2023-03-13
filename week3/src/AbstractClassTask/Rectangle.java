package AbstractClassTask;

public class Rectangle extends Shape{
	 double length;
	    double width;

	    Rectangle(double x, double y){
	        this.length = x;
	        this.width = y;
	    }

	    @Override
	    void perimeter() {
	        double perimeter = 2*(length+width);
	        System.out.println("Rectangle's perimeter is : " + perimeter);
	    }

	    @Override
	    void area() {
	        double area = length*width;
	        System.out.println("Rectangle's area is : " + area);
	    }
}
