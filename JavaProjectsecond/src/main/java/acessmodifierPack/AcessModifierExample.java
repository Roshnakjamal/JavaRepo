package acessmodifierPack;

public class AcessModifierExample {
	
	public void display1()
	{
		System.out.println("This is public method");
	}
	
	private void display2()
	{
		System.out.println("This is private method");
	}
	
	protected void display3()
	{
		System.out.println("This is protected method");
	}
	
	void display4()
	{
		System.out.println("This is default method");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AcessModifierExample obj1= new AcessModifierExample();
		obj1.display1();
		obj1.display2();
		obj1.display3();
		obj1.display4();
		
	}

}
