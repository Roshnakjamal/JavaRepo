package assignments;

import java.util.Scanner;

public class Staticprogram4 {
	static int age;
	
	public static boolean checkage()
	{
		if (age>=18)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		boolean value;
		Scanner scanner = new Scanner(System.in);  
		System.out.println("Enter the age");
		age = scanner.nextInt(); 
		System.out.println("Entered age is: " + age);
		value=Staticprogram4.checkage();
		if(value == true)
		{
			System.out.println("The candiadate is eligible for voting");
		}
		else
		{
			System.out.println("The candiadate is not eligible for voting");
		}
		scanner.close(); 
	}
}

	


