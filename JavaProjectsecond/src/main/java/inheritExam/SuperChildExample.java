package inheritExam;

public class SuperChildExample extends SuperExample{
	String colour="Yellow";
	public void display()
	{
		System.out.println(colour);
		System.out.println(super.colour);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperChildExample obj1=new SuperChildExample();
		obj1.display();

	}

}
