package assignments;

public class Staticprogram1 {
	static String name;
	static int age;
	public static void getname()
	{
		name="Roshna";
		age=25;
	}
	
	public static void setname()
	{
		System.out.println("Name"+" "+name);
		System.out.println("Age"+" "+age);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticprogram1.getname();
		Staticprogram1.setname();
	}

}
