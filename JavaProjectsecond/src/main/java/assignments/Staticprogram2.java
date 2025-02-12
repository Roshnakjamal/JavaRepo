package assignments;

import java.util.Scanner;

public class Staticprogram2 {
	static int sum=1;
	static int num;
	public static void fact()
	{
		int n=1;
		while(n<=num)
		{
			sum=n*sum;
			n++;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);  
		System.out.println("Enter the number");
		num = scanner.nextInt(); 
		System.out.println("Entered integer is: " + num);
		Staticprogram2.fact();
		
		System.out.println("Factorial of"+"  "+num+"  "+"is "+sum);
		scanner.close();  
	}

}
