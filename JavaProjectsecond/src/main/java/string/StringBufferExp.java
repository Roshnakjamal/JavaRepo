package string;

public class StringBufferExp {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StringBuffer obj1 =new StringBuffer("Hello");
		obj1.insert(5,"Welcome");
		System.out.println(obj1);
		obj1.delete(1, 4);
		System.out.println(obj1);
		obj1.append("HOME");
		System.out.println(obj1);
		obj1.replace(0, 3, "Welcome");
		System.out.println(obj1);
		
		
		
	}

}
