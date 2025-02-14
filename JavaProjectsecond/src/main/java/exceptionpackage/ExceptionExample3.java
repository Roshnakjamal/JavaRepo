package exceptionpackage;

public class ExceptionExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		int var=Integer.parseInt("ye");
		System.out.println(var);
		}
		catch(NumberFormatException var1)
		{
			int var = Integer.parseInt("100");
			System.out.println(var);
			System.out.println(var1);
	}


}
}
