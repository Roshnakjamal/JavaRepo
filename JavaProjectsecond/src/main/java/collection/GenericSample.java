package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> obj1= new ArrayList<String>();
		 obj1.add("roshna");//only non primitive data type
		 obj1.add("apple");
		 obj1.add("orange");
		 obj1.add("Guava");
		 obj1.add("Tree");
		 obj1.add("roshna");
		 System.out.println(obj1);
		 obj1.set(1, "Grapes");//to set the value
		 System.out.println(obj1);
		 System.out.println(obj1.indexOf("roshna"));
		 System.out.println(obj1.lastIndexOf("roshna"));
		 obj1.remove(0);//to remove  a value
		 System.out.println(obj1);
		 obj1.remove(1);
		 System.out.println(obj1);
		 System.out.println(obj1.get(2));//to get the value
		 System.out.println(obj1.contains("roshna"));//to check the value is present in list
		 
	}

}
