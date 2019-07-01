//# hours < 40 *12 + (#hours > 40 ) * 25 
public class CobraTrooper extends Employee {



	public CobraTrooper(String employeeType, String name, int baseSalary, int hours) {
		super(employeeType, name, baseSalary, hours);
		
	}

	@Override 	
	public String toString()
	{
		 return "Employee Name: " + getName() + " , Weekly Pay: "+ getWeeklyPay() ;
	 
	}

	public double getWeeklyPay()
	{
		if (hours <= 40)
		{
			return baseSalary + (hours * 12);
			
		}
		else {
			int overTime = hours - 40;
			int overTimePay = overTime*25 ;
			int regularPay = 40*12;
			double weeklyPay = regularPay + overTimePay;
			return weeklyPay;
			
			
		}
		
	}

	

}
