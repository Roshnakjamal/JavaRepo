package collection;

import java.util.ArrayList;

public class ArraylistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> obj1=new ArrayList<String>();
		obj1.add("Apple");
		obj1.add("orange");
		obj1.add("Grapes");
		obj1.add("Guava");
		obj1.add("Pappaya");
		System.out.println(obj1);
		
		ArrayList<String> obj2=new ArrayList<String>();
		obj2.add("Apple1");
		obj2.add("orange1");
		obj2.add("Grapes1");
		obj2.add("Guava1");
		obj2.add("Pappaya1");
		System.out.println(obj2);
		
		obj1.addAll(obj2);//to combine 2 Arrays
		System.out.println(obj1);
		
		System.out.println(obj1.contains("orange"));
		System.out.println(obj1.get(2));
		System.out.println(obj1.isEmpty());
		obj1.remove(3);
		
		System.out.println(obj1);
		
		System.out.println(obj1.size());
	}

}
