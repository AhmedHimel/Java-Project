package Classes;

import java.lang.*;

public class BusinessClass extends Ticket
{
	private double businessClassRate;
	
	public BusinessClass()
	{
		
	}
	public BusinessClass(String ticketNumber, Passenger passenger, double payment, double businessClassRate )
	{
		super(ticketNumber, passenger, payment );
		this.businessClassRate = businessClassRate;
	}
	
	public void setBusinessClassRate(double businessClassRate)
	{
		this.businessClassRate = businessClassRate;
	}
	public double getBusinessClassRate()
	{
		return businessClassRate;
	}
	
	public void showDetails()
	{
		System.out.println("----- Ticket Information -----");
		this.getPassenger().showDetails();
		System.out.println("Ticket Number: " + this.getTicketNumber());
		System.out.println("Ticket Price: " + this.getPayment());
		System.out.println("Business Class Ticket Rate: " + businessClassRate);
		System.out.println();
	}
}