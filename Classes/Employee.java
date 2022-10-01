package Classes;
import java.lang.*;

public class Employee
{
	private String empId;
	private String name;
	private double workHour;
	private double monthlyWage;
	private double empContact;
	
	public void setEmpId(String empId)
	{
		this.empId = empId;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setWorkHour(double workHour)
	{
		this.workHour = workHour;
	}
	public void setMonthlyWage(double monthlyWage)
    {
		this.monthlyWage = monthlyWage;
	}
	public void setEmpContact(double empContact)
	{
		this.empContact = empContact;
	}
	
	public String getEmpId()
	{
		return empId;
	} 
	public String getName()
	{
		return name;
	}
	public double getWorkHour()
	{
		return workHour;
	} 
	public double getMonthlyWage()
	{
		return monthlyWage;
	}
	public double getEmpContact()
	{
		return empContact;
	} 
	
	
	public void showDetails()
	{
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Work Hour: " + workHour);
		System.out.println("Employee Monthly Wage: " + monthlyWage);
		System.out.println("Employee Contact: " + empContact);
		System.out.println();
	}
}