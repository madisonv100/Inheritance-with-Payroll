// Base salary / 52 


public class HighCommand extends Employee {


	public HighCommand(String employeeType, String name, int baseSalary, int hours) {
		super(employeeType, name, baseSalary, hours);
		// TODO Auto-generated constructor stub
	}
	@Override 	
	public String toString()
	{
		 return "Employee Name: " + getName() + " , Weekly Pay: "+ getWeeklyPay() ;
	 
	}
public double getWeeklyPay ()
{
	return (baseSalary / 52);
	
}
}
