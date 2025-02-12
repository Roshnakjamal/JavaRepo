package assignments;

public class Staticprogram3 {
	static int reversenum;
	static int num;

	public static void reverse(int number)
	{
		reversenum=0;
		while(number!=0) 
		{
		int remdr = number % 10;  
		reversenum = reversenum * 10 + remdr;  
		number = number/10;  
		}
		System.out.println("The reverse of the given number is: " + reversenum);  
	}
	
	public static void palidrome()
	{
		if (num == reversenum)
		{
			System.out.println("The number is palindrome");
		}
		else
		{
			System.out.println("The number is not palindrome");
		
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		num=323;
		System.out.println("the number is "+" "+num);
		Staticprogram3.reverse(num);
		Staticprogram3.palidrome();
	}

}
