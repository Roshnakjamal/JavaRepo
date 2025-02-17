package exceptionpackage;

public class ExceptionExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=15;
		if(age>=18)
		{
			System.out.println("The person is eligible to vote");
		}
		else
		{
			throw new ArithmeticException("Not eligible to vote");
		}
	}

}
