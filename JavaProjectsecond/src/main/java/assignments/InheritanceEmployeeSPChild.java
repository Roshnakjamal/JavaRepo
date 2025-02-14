package assignments;

public class InheritanceEmployeeSPChild extends InheritanceEmployeeSP1 {
	double totalsalary;
	double hr1;
	double pf1;
	
	
	InheritanceEmployeeSPChild(int basicpay, double deduction, int bonus) {
		super(basicpay, deduction, bonus);
		// TODO Auto-generated constructor stub
	}

	public void totalsalary()
	{
		hr1=calculatehr();
		pf1=calculatepf();
		totalsalary=basicpay+hr1-pf1-deduction+bonus;
		
	}
	public void getsalaryslip()
	{
		System.out.println("the total salary split up");
		System.out.println("basic pay:"+" "+basicpay+" "+"deduction"+" "+deduction+" "+"hra"+" "+hr1);
		System.out.println("pf"+" "+pf1+" "+"bonus"+" "+bonus);
		System.out.println("total salary by hand"+" "+totalsalary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceEmployeeSPChild obj1=new InheritanceEmployeeSPChild(1000,10.00,100);
		obj1.totalsalary();
		obj1.getsalaryslip();
		
	}

}
