package Interfaces;
import java.lang.*;
import Classes.*;

public interface PassengerOperations
{
	boolean insertPassenger(Passenger p);
	boolean removePassenger(Passenger p);
	Passenger searchPassenger(String nationalId);
	void showAllPassengers();

}