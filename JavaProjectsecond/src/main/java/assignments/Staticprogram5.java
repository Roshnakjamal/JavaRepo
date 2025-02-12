package assignments;

public class Staticprogram5 {
	static int discountvalue=5000;
	
	public static float gettotal(int itemprc1,int itemprc2,int itemprc3)
	{
		float sum=itemprc1+itemprc2+itemprc3;
		return sum;
	}

	public static float checkdiscount(float totalprice)
	{
		float newamount;
		if (totalprice>=discountvalue)
		{
			newamount=(float) (totalprice*(0.2));
			return newamount;
		}
		else
		{
			return totalprice;
		}
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float totalprice= Staticprogram5.gettotal(1000,4000,1000);
		float newprice=Staticprogram5.checkdiscount(totalprice);
		System.out.println("the final amount:"+" "+newprice);
	}

}
