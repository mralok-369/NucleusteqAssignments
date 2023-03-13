package classTask;

import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Students ? ");
        int n = sc.nextInt();
        while (n!=0){
            Student student = new Student();

            System.out.println("Enter the Roll Number of Student : ");
            int rollNumber = sc.nextInt();
            student.setRollNumber(rollNumber);

            System.out.println("Enter the Name of the Student : ");
            String name = sc.next();
            student.setName(name);

            System.out.println("Enter the Course for the Student : ");
            String course = sc.next();
            student.setCourse(course);

            System.out.println("Enter marks1 of Student : ");
            int marks1 = sc.nextInt();
            student.setMarks1(marks1);

            System.out.println("Enter marks2 of Student : ");
            int marks2 = sc.nextInt();
            student.setMarks2(marks2);

            System.out.println("Enter marks3 of Student : ");
            int marks3 = sc.nextInt();
            student.setMarks3(marks3);

             //Displaying details of the students
            System.out.println("Student details are : ");
            System.out.println(student);
//            System.out.println("Roll No. : "+student.getRollNumber()
//                                + ", Student Name : "+student.getName()
//                                + ", Enrolled Course : "+student.getCourse()
//                                + ", Subject 1 Marks : "+student.getMarks1()
//                                + ", Subject 2 Marks : "+student.getMarks2()
//                                + ", Subject 3 Marks : "+student.getMarks3());
            student.calculateTotal();
            student.calculateAverage();
            student.calculateGrade();

            n--;
        }

    }
}
