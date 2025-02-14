package polymorphismpackage;

public class childclass1 extends parentclass1 {
	
	public void operation(int b)
	{
		//int diff=a-b;
		//System.out.println("the difference"+diff);
		System.out.println("the value of"+b);
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		childclass1 obj1= new childclass1();
		obj1.operation(10, 5);
		obj1.operation(5);

	}

}
