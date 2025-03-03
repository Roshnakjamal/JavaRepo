package Reviewpackage;

public class ChildAB implements ParentA,ParentB {
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ChildAB obj1=new ChildAB();
		obj1.Display1();
		obj1.Display2();
		
	}

	@Override
	public void Display1() {
		// TODO Auto-generated method stub
		System.out.println("Display from parent A");
	}

	@Override
	public void Display2() {
		// TODO Auto-generated method stub
		System.out.println("Display from parent B");
	}

}
