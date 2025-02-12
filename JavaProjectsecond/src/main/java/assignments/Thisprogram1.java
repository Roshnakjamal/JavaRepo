package assignments;

public class Thisprogram1 {
	int number;
	Thisprogram1(int number)
	{
		this();
		System.out.println(number);
		this.number=number;
		int revnum=0;
		while(number!=0)
		{
			int remainder=number%10;
			revnum=(revnum*10)+remainder;
			number=number/10;
		}
		System.out.println("the reverse num"+revnum);
		
	}
	
	Thisprogram1()
	{
		System.out.println("Finding reverse of");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thisprogram1 obj1=new Thisprogram1(132);
		
	}

}
