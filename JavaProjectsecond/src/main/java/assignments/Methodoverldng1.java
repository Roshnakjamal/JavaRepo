package assignments;

public class Methodoverldng1 {
	int m1;
	int m2;
	int m3;
	Methodoverldng1(int m1,int m2,int m3)
	{
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	public int totalmark()
	{
		int sum=m1+m2+m3;
		return sum;
	}
	public void gradeheck(int total)
	{
		if((total>=281)&& (total<=300))
		{
		System.out.println("The grade is A");
		}
		else if((total>=171) && (total<=280))
		{
		System.out.println("The grade is B");
		}
		else if((total>=161) && (total<=170))
		{
		System.out.println("The grade is C");
		}
		else if((total>=140)&& (total<=160))
		{
		System.out.println("The grade is D");
		}
		else
		{
		System.out.println("Failed");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverldng1 obj1=new Methodoverldng1(98,78,88);
		Methodoverldng1 obj2=new Methodoverldng1(43,46,49);
		int total=obj1.totalmark();
		System.out.println("the grade of first student");
		obj1.gradeheck(total);
		total=obj2.totalmark();
		System.out.println("the grade of second student");
		obj2.gradeheck(total);
		
		}
		

	}


