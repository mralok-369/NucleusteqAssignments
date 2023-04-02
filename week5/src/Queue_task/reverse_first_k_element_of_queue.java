package Queue_task;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class reverse_first_k_element_of_queue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = -1;
		
		// creating queue  using linked list
		Queue<Integer> queue = new LinkedList<Integer>();
		
		do {
			System.out.println("Want to perform operation with Queue: ");
			System.out.println("1.INSERT");
			System.out.println("2.DISPLAY");
			System.out.println("3.REVERSE");
			System.out.println("4.REVERSE K ELEMENTS");
			System.out.println("0.EXIT");
			
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();			
			
			switch (choice) {
			case 1: {
				// adding elements in to the queue
				System.out.println("Enter element to add: ");
				int val = sc.nextInt();
				queue.add(val);
				System.out.println("Value added successfully.");
				break;
			}
			case 2: {
				// Displaying the queue
				System.out.println("Queue elemenst are: ");
//				System.out.println(queue.size());
				System.out.println(queue);
				break;
			}
			case 3: {
				System.out.println("Revesre of the queue: ");
				Stack<Integer> stack = new Stack<>();
				
				while (!queue.isEmpty()) {
		            stack.add(queue.peek());
		            queue.remove();
		        }
		        while (!stack.isEmpty()) {
		            queue.add(stack.peek());
		            stack.pop();
		        }
		        
		        // printing reverse queue
		        while (!queue.isEmpty()) {
		            System.out.print(queue.peek() + ", ");
		            queue.remove();
		        }
				
				System.out.println();
				break;
			}
			case 4: {
				System.out.println("Revesre of first k element of the queue: ");
				Queue<Integer> temp = new LinkedList<Integer>();
				Stack<Integer> s = new Stack<Integer>();
				
				System.out.println("Enter no of elements to reverse");
				int n = sc.nextInt();
				
				for(int i=0;i<n;i++)
				{
					s.push(queue.peek());
					queue.remove();
				}
				
				while(queue.size()>0)
				{
					temp.add(queue.peek());
					queue.remove();
				}
				
				while(s.size()>0)
				{
					queue.add(s.peek());
					s.pop();
				}
				
				while(temp.size()>0)
				{
					queue.add(temp.peek());
					temp.remove();
				}
				
				while(queue.size()>0)
				{
					System.out.print(queue.peek()+" ");
					queue.remove();
				}
				System.out.println();
				
				break;
			}
			default:
				System.out.println("Thank you for using...!!");
				break;
			}
			
		} while (choice!=0);
	}
}
