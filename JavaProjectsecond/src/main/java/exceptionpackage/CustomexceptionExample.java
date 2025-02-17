package exceptionpackage;

public class CustomexceptionExample {

	public static void main(String[] args) throws EligibilityException {
		// TODO Auto-generated method stub
		int age=15;
		if(age>=18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			throw new EligibilityException("Not eligible to vote");
		}
	}

}
