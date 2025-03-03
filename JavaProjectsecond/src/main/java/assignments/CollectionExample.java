package assignments;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> obj1=new ArrayList<String>();
		obj1.add("Red");
		obj1.add("orange");
		obj1.add("Pink");
		obj1.add("black");
		obj1.add("white");
		obj1.add("violet");
		System.out.println(obj1);
		System.out.println();
		System.out.println(obj1.get(2));
		System.out.println();
		Iterator<String> it=obj1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println();
		obj1.remove(3);
		System.out.println(obj1);
		System.out.println();
		System.out.println();
		System.out.println(obj1.contains("orange"));
		
		
		
	}

}
