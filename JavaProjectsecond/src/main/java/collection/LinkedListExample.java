package collection;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> obj1=new LinkedList<String>();
		obj1.add("ROSE1");
		obj1.add("ROSE2");
		obj1.add("ROSE3");
		obj1.add("ROSE4");
		obj1.add("ROSE5");
		
		System.out.println(obj1);
		obj1.remove(2);
		System.out.println(obj1);
		 obj1.set(1, "For");
		 System.out.println(obj1);
		 for (int i = 0; i < obj1.size(); i++) { 
			  
	            System.out.print(obj1.get(i) + " "); 
	        } 
		 System.out.println("The size of the linked list is: " + obj1.size());
		 
	}

}
