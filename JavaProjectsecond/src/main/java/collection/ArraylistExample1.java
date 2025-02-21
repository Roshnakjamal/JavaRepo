package collection;

import java.util.ArrayList;

public class ArraylistExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> obj1=new ArrayList<String>();
		obj1.add("Apple1");
		obj1.add("orange1");
		obj1.add("Grapes1");
		obj1.add("Guava1");
		obj1.add("Pappaya1");
		System.out.println(obj1);
		
		for(String var:obj1)//iteration using for loop
		{
			System.out.println(var);
		}
	}

}
