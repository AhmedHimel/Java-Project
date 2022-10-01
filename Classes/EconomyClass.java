package Classes;

import java.lang.*;

public class EconomyClass extends Ticket
{
	private double economyClassRate;
	
	public EconomyClass()
	{
		
	}
	public EconomyClass(String ticketNumber, Passenger passenger, double payment, double economyClassRate)
	{
		super(ticketNumber, passenger , payment);
		this.economyClassRate = economyClassRate;
	}
	
	public void setEconomyClassRate(double economyClassRate)
	{
		this.economyClassRate = economyClassRate;
	}
	public double getEconomyClassRate()
	{
		return economyClassRate;
	}
	
	public void showDetails()
	{
		System.out.println("------ Ticket Information ------");
		this.getPassenger().showDetails();
		System.out.println("Ticket Number: " + this.getTicketNumber());
		System.out.println("Ticket Price : " + this.getPayment());
		System.out.println("Economy Class Ticket Rate: " + economyClassRate);
		System.out.println();
	}
}