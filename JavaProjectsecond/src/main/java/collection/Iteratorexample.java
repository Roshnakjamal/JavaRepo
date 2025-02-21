package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> obj1=new ArrayList<String>();
		obj1.add("Apple1");
		obj1.add("orange1");
		obj1.add("Grapes1");
		obj1.add("Guava1");
		obj1.add("Pappaya1");
		Iterator<String> it= obj1.iterator();
		while(it.hasNext())//to check the iterator in the first location  and check if element is present
		{
		System.out.println(it.next());
		}
		it.remove();
		System.out.println(obj1);;
	}

}
