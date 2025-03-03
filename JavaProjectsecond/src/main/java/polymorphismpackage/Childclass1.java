package polymorphismpackage;

public class Childclass1 extends Parentclass1 {
	
	public void operation(int a,int b)
	{
		int diff=a-b;
		System.out.println("the difference"+diff);
		//System.out.println("the value of"+b);
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Parentclass1 obj1=new Parentclass1();
		obj1.operation(10, 5);
		obj1=new Childclass1();
		obj1.operation(15,10);
	

	}

}
