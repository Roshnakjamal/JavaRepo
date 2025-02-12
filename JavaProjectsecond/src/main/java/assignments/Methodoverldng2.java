package assignments;

public class Methodoverldng2 {
	public void average(int a,int b,int c)
	{
		int avg=(a+b+c)/3;
		System.out.println("the average of integers"+" "+avg);
	}
	
	public void average(double a,double b,double c)
	{
		double avg=((a+b+c)/3);
		System.out.println("the average of floats"+" "+avg);
	}
	
	public void area(int length,int breadth)
	{
		double area=(length*breadth);
		System.out.println("The area of rectangle "+" "+area);
	}

	public void area(int length)
	{
		double area=(length*length);
		System.out.println("The area of square "+" "+area);
	}
	
	public void area(double radius)
	{
		double area=(3.14*radius*radius);
		System.out.println("The area of circle "+" "+area);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methodoverldng2 obj=new Methodoverldng2();
		obj.average(20,30,40);
		obj.average(2.0,1.5,5.6);
		obj.area(10,20);
		obj.area(10);
		obj.area(5.0);
	}

}
