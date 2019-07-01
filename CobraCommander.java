// 1 dollar 

//method that override weekly pay method with the correct implentation for the amount 
//method that overrides the toString method that prints the employee name and the weekly pay 

public class CobraCommander extends Employee {




public CobraCommander(String employeeType, String name, int baseSalary, int hours) {
		super(employeeType, name, baseSalary, hours);
	
	}

@Override 	
public String toString()
{
	 return "Employee Name: " + getName() + " , Weekly Pay: "+ getWeeklyPay() ;
 
}

public double getWeeklyPay()
{
	return baseSalary + hours;
	
}
	
}
