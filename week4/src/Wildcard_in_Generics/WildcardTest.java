package Wildcard_in_Generics;

import java.util.*;

// abstract shape class
abstract class Shape{  
	abstract void draw();  
} 

// Rectangle class that extends shape
class Rectangle extends Shape{  
	void draw(){
		System.out.println("drawing rectangle");
	}  
}

// Circle class that extends shape
class Circle extends Shape{  
	void draw(){
		System.out.println("drawing circle");
	}  
} 

public class WildcardTest {
	//creating a method that accepts only child class of Shape  
	public static void drawShapes(List<? extends Shape> lists){  
		for(Shape s:lists){  
			s.draw();//calling method of Shape class by child class instance  
		}  
	} 
	
	public static void main(String args[]){  
		List<Rectangle> list1=new ArrayList<Rectangle>();  
		list1.add(new Rectangle());  
		  
		List<Circle> list2=new ArrayList<Circle>();  
		list2.add(new Circle());  
		list2.add(new Circle());  
		  
		drawShapes(list1);  
		drawShapes(list2);  
	}

}
