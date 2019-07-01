//base salary/ 52 + (#hours >40 ) * 25 


public class CrimsonGuard extends Employee{


	public CrimsonGuard(String employeeType, String name, int baseSalary, int hours) {
		super(employeeType, name, baseSalary, hours);
	
	}
	@Override 	
	public String toString()
	{
		 return "Employee Name: " + getName() + " , Weekly Pay: "+ getWeeklyPay() ;
	 
	}
public double getWeeklyPay()
{
	int overTime = hours - 40 ;
	double weeklyPay = baseSalary/ ((overTime + 52) *25);
	return weeklyPay;
	
}
}
