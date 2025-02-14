package exceptionpackage;

public class ExceptionExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=20;
		int y=0;
		try
		{
		int z=x/y;//the code which has exception
		//System.out.println("Hai");
		System.out.println(z);//Arithmetic exception error
		}
//		catch(ArithmeticException var)
//		{
//			x=20;
//			y=2;
//			int a=x/y;
//			System.out.println(a);
//			System.out.println(var);
//		}
//		
		finally
		{
			System.out.println("Excecution completed successfully");
		}
	}

}
