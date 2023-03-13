package AbstractClassTask;

import java.util.Scanner;

public class DriverClass {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Click\n"+"1 for Circle : \n"+"2 for Rectangle : ");
        int n = sc.nextInt();

        if (n==1)
        {
            System.out.println("Enter the radius of Circle : ");
            double r = sc.nextDouble();
            Circle circle = new Circle(r);
            circle.area();
            circle.perimeter();
        }
        else if (n==2)
        {
            System.out.println("Enter the length and width of Rectangle : ");
            double l = sc.nextDouble();
            double w = sc.nextDouble();
            Rectangle rectangle = new Rectangle(l,w);
            rectangle.area();
            rectangle.perimeter();

        }
        else
        {
            System.out.println("Invalid input!.");
        }

    }
}
