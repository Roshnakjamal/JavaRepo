package inheritExam;

public class SuperConstructorChild extends SuperConstructor{
	
	public SuperConstructorChild(String name)
	{
		super();//to call parent class constructor using super keyword
		System.out.println(name);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperConstructorChild obj1=new SuperConstructorChild("Roshna");
		

	}

}
