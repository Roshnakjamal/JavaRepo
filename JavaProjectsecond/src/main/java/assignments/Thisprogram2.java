package assignments;

public class Thisprogram2 {
	int fact=1;
	public void calculate(int number)
	{
		int n=1;
		
		while(n<=number)
		{
			fact=fact*n;
			n++;
		}
		
		this.print();
	}
	public void print()
	{
		System.out.println("the fatorial is"+" "+fact);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=8;
		System.out.println("the factorial of number"+num);
		Thisprogram2 obj1=new Thisprogram2();
		obj1.calculate(8);
		
	}

}
