package assignments;

public class Offseason extends Onseason {
	
	public @Override void Discount(int Price)
	{
		double Totalprice;
		double discount =((.15)*Price);
		Totalprice =Price-discount;
		System.out.println("The discounted price offseason"+Totalprice);	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Onseason obj1=new Onseason();
	 	obj1.Discount(2000);
		obj1=new Offseason();
		obj1.Discount(2000);
		
		
}
}
