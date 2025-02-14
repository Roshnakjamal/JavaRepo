package exceptionpackage;

public class Exceptionexample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String var="Roshna";
		try
		{
		System.out.println(var.charAt(6));
		}
	
		catch(StringIndexOutOfBoundsException var1)
		{		
			System.out.println(var.charAt(5));
		}
		}

}
