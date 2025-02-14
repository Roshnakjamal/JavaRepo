package interfacepackage;

public class MultipleInheritanceC implements MultipleInheritanceA,MultipleInheritanceB
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritanceC obj1=new MultipleInheritanceC();
		obj1.display1();
		obj1.display2();
	}

	@Override
	public void display1() {
		// TODO Auto-generated method stub
		System.out.println("Multiple inheritance from A");
	}

	@Override
	public void display2() {
		// TODO Auto-generated method stub
		System.out.println("Multiple inheritance from B");
	}

}
