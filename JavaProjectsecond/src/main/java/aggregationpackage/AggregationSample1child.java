package aggregationpackage;

public class AggregationSample1child {

	String bookname;
	int bookcost;
	AggregationSample1 refer;//Aggregation
	
	AggregationSample1child(String bookname,int bookcost,AggregationSample1 refer)
	{
		this.bookname=bookname;
		this.bookcost=bookcost;
		this.refer=refer;
	}
	public void display()
	{
		System.out.println(refer.autherId+"   "+refer.authername);
		System.out.println(bookname+"  "+bookcost);
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		AggregationSample1 obj=new AggregationSample1("Roshna",1234);
		AggregationSample1child obj1= new AggregationSample1child("book1",3000,obj);
		obj1.display();
	}

}
