package assignments;

public class SuperClassex1Child extends SuperClassex1{
    int sum;
	public void checksum()
	{
		sum=super.sum(20,40);
		if((sum%10)==0)
		{
			System.out.println("the number is divisible by 10");
		}
		else
		{
			System.out.println("the number is not divisible by 10");
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperClassex1Child obj1=new SuperClassex1Child();
		obj1.checksum();
	}

}
