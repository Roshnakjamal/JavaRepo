package abstractionpackage;

public class Abstractionclass1child extends abstractionclass1 {


public static void main(String args[])
{
	Abstractionclass1child obj1=new Abstractionclass1child();
	obj1.display();
	obj1.display1();
	
	
}
@Override
public void display1() {
	// TODO Auto-generated method stub
	System.out.println("This is a abstract method");
}
}