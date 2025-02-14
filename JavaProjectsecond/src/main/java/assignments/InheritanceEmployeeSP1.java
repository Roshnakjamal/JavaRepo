package assignments;

public class InheritanceEmployeeSP1 extends InheritanceEmployeeSP2{
	
	InheritanceEmployeeSP1(int basicpay, double deduction, int bonus) {
		super(basicpay, deduction, bonus);
		// TODO Auto-generated constructor stub
	}
	public double calculatehr()
	{
		double hra;
		hra=((.05)*basicpay);
		return hra;
	}
	public double calculatepf()
	{
		double pf;
		pf=((.2)*basicpay);
		return pf;
	}

}
