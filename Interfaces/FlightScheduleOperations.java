package Interfaces;
import java.lang.*;
import Classes.*;

public interface FlightScheduleOperations
{
	boolean insertTicket(Ticket t);
	boolean removeTicket(Ticket t);
	Ticket searchTicket(String ticketNumber);
	void showAllTickets();
}