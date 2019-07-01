//constructer that accepts weekly hours, name, and base salary 
//accessor method for name, a base salary and number of hours worked in a week 
// abstract method for the weekly pay that returns double 


public class Employee {
	public String employeeType ;
	
	public int hours;
	public String name;
	public int baseSalary;
	
	public Employee(String employeeType, String name , int baseSalary, int hours)
	{   this.employeeType = employeeType;
		this.hours = hours;
		this.name = name ;
		this.baseSalary = baseSalary;
		
	}
	

public String getEmployeeType()
{
	return employeeType;
}
public String getName()
{
	return name;
}
public int getHours()
{
	return hours;
}
public int getBaseSalary()
{
	return baseSalary;
}

public double getWeeklyPay()
{
	return hours;
	
}



	



}
