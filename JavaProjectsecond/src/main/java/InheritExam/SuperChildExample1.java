package InheritExam;

public class SuperChildExample1 extends SuperExample1 {
	String colour="Yellow";
	public void display1()
	{
		System.out.println(colour);
		super.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperChildExample1 obj1= new SuperChildExample1();
		obj1.display1();

	}

}
