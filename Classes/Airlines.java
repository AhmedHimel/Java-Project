package Classes;

import java.lang.*;
import Interfaces.*;

public class Airlines implements FlightScheduleOperations, EmployeeOperations, PassengerOperations
{
	private String name;
	private String branchName;
	Ticket tickets[] = new Ticket [1000];
	Passenger passengers[] = new Passenger [500];
	Employee employees[] = new Employee [100];
	
	public Airlines()
	{
		
	}
	public Airlines(String name, String branchName)
	{
		this.name = name;
		this.branchName = branchName;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setBranchName(String branchName)
	{
		this.branchName = branchName;
	}
	
	public String getName()
	{
		return name;
	}
	public String getBranchName()
	{
		return branchName;
	}

	public boolean insertTicket(Ticket t)
	{
		for(int i=0; i<tickets.length; i++)
		{
			if(tickets[i] == null)
			{
				tickets[i] = t;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeTicket(Ticket t)
	{
		for(int i=0; i<tickets.length; i++)
		{
			if(tickets[i] == t)
			{
				tickets[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Ticket searchTicket(String ticketNumber)
	{
		for(int i=0; i<tickets.length; i++)
		{
			if(tickets[i] != null)
			{
				if(tickets[i].getTicketNumber().equals(ticketNumber))
				{
					return tickets[i];
				}
			}
		}
		return null;
	}
	
	public void showAllTickets()
	{
		for(int i=0; i<tickets.length; i++)
		{
			if(tickets[i] != null)
			{
				tickets[i].showDetails();
			}
		}
	}
	
	
	public boolean insertPassenger(Passenger p)
	{
		for(int i=0; i<passengers.length; i++)
		{
			if(passengers[i] == null)
			{
				passengers[i] = p;
				return true;
			}
		}
		return false;
	}
	
	public boolean removePassenger(Passenger p)
	{
		for(int i=0; i<passengers.length; i++)
		{
			if(passengers[i] == p)
			{
				passengers[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Passenger searchPassenger(String nationalId)
	{
		
		for(int i=0; i<passengers.length; i++)
		{
			
			if(passengers[i] != null)
		
			{
				
				if( nationalId.equals(passengers[i].getNationalId()))
				{
					System.out.println("ccc");
					return passengers[i];
				}
				
			}
		}
		return null;
		
	}
	
	public void showAllPassengers()
	{
		for(int i=0; i<passengers.length; i++)
		{
			if(passengers[i] != null)
			{
				passengers[i].showDetails();
			}
		}
	}
	
	public boolean insertEmployee(Employee e)
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == null)
			{
				employees[i] = e;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeEmployee(Employee e)
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == e)
			{
				employees[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Employee searchEmployee(String empId)
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				if(employees[i].getEmpId().equals(empId))
				{
					return employees[i];
				}
			}
		}
		return null;
	}
	
	public void showAllEmployees()
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				employees[i].showDetails();
			}
		}
	}
	
	public void showDetails()
	{
		System.out.println("----- Ticket Information ----");
		System.out.println("Ticket Name: " + name);
		System.out.println("Ticket Branch Name: " + branchName);
		System.out.println("----------------------------------");
		System.out.println("----- List of Tickets -----");
		this.showAllTickets();
		System.out.println("----------------------------------");
		System.out.println();
		System.out.println("----- List of Employees -----");
		this.showAllEmployees();
		System.out.println("----------------------------------");
		
	}	
}