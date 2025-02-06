package InheritExam;

public class childCclls extends ParentBclls
{
	public void sub1()
	{
		int a=50;
		int b=20;
		int c=b-a;
		System.out.println("The difference is"+" "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childCclls obj1= new childCclls();
		obj1.add();
		obj1.sub();
		obj1.sub1();
	}

}
