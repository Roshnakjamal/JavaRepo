package exceptionpackage;

public class ExceptionExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= new int[] {10,20,30,40};
		try
		{
		for(int i=0;i<=4;i++)
		{
			System.out.println(a[i]);
		}
		}
		catch(ArrayIndexOutOfBoundsException var1)
		{
			for(int i=0;i<4;i++)
			{
				System.out.println(a[i]);
			}
			System.out.println(var1);
		}
		
	}

}
