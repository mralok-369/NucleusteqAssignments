package week2;

import java.util.Scanner;

public class simpleAndCompoundInterest {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Principal Amount : ");
        double p = sc.nextDouble();
        System.out.println("Enter Rate : ");
        double r = sc.nextDouble();
        System.out.println("Enter Time : ");
        double t = sc.nextDouble();

        System.out.println("Enter 1 to calculate Simple Interest : ");
        System.out.println("Enter 2 to calculate Compound Interest : ");
        int n = sc.nextInt();

        if (n==1){
            double i = simpleInterest(p,r,t);
            System.out.println("Simple Interest is : " + i);
        } else if (n==2) {
            double c = compoundInterest(p,r,t);
            System.out.println("Compound Interest is : " + c);
        }


    }

    // method to calculate simple interest
    static double simpleInterest(double p, double r, double t){
        return (double) ((p*r*t)/100);
    }

    // method to calculate compound interest
    static double compoundInterest(double p, double r, double t){
        return p*(Math.pow((1+r/100),t))-p;
    }
}
