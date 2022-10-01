package Classes;
import java.lang.*;

public class Passenger
{
	private String nationalId;
    private String passportNumber;
    private String name;
    private String phoneNumber;

	
	public void setNationalId(String nationalId)
	{
		this.nationalId = nationalId;
	}
    public void setPassportNumber(String passportNumber)
	{
		this.passportNumber = passportNumber;
	}
    public void setName(String name)
	{
		this.name = name;
	}
    public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	
	public String getNationalId()
	{
		return nationalId;
	}
	public String getPassportNumber()
	{
		return passportNumber;
	}
	public String getName()
	{
		return name;
	}
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	
	public void showDetails()
	{
		System.out.println("---------------------------------");
		System.out.println("Ticket Owner's NID number : " + nationalId);
		System.out.println("Ticket Owner's Passport number: " + passportNumber);
		System.out.println("Account Owner's name: " + name);
		System.out.println("Ticket Owner's Phone Number: " + phoneNumber);
		System.out.println();
	}
}