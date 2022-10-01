import java.lang.*;
import java.util.Scanner;
import Interfaces.*;
import Classes.*;
import io.*;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Airlines a = new Airlines();
		FileReadWrite frwd = new FileReadWrite();
		a.setName(" Air New-Zealand");
		a.setBranchName("Dhaka");
		
		System.out.println("-----------------------------------------------");
		System.out.println("-----------------------------------------------");
		System.out.println("-------   Welcome to Air New-Zealand   -------- ");
		System.out.println("-----------------------------------------------");
		System.out.println("-----------------------------------------------\n");
		
		boolean repeat = true;
		
		while(repeat)
		{
			
			System.out.println("What you wanna do?\n");
			System.out.println("Gonna see those Option");
			
			System.out.println("   1. Employee Management");
			System.out.println("   2. Passenger Management");
			System.out.println("   3. Ticket Management");
			System.out.println("   4. Flight Booking Tansactions");
			System.out.println("   5. Show Airline Information");
			System.out.println("   6. Exit");
            System.out.println("-----------------------------------\n");
			
			System.out.print("Enter Your Choice: ");
			int choice = sc.nextInt();
			System.out.println("-----------------------------------");
			
		switch(choice)
		
			{
				case 1:
					System.out.println("-----------------------------------------");
					System.out.println("You choose Employee Management");
					System.out.println("-------------------------------------");
					
					System.out.println("You have following options: \n");
					System.out.println("   1. Insert New Employee");
					System.out.println("   2. Remove Existing Employee");
					System.out.println("   3. Show All Employees");
					System.out.println("   4. Search an Employee");
					System.out.println("   5. Go Back");

					System.out.print("Enter You Option: ");
					int option1 = sc.nextInt();
					
		            switch(option1)
				    {
					    case 1:
							System.out.println("---------------------------------");
							System.out.println("You Choose to Insert An Employee");
							System.out.println("---------------------------------");
							
							System.out.print("Enter employee ID Number : ");
							String empId1 = sc.next();
							System.out.print("Enter employee name: ");
							String name1 = sc.next();
							System.out.print("Enter employee's work hour: ");
							double workHour1 = sc.nextDouble();
							System.out.print("Enter employee monthly wage: ");
							double monthlyWage1 = sc.nextDouble();
							System.out.print("Enter employee contact number: ");
							double empContact1 = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setWorkHour(workHour1);
							e1.setMonthlyWage(monthlyWage1);
							e1.setEmpContact(empContact1);
							
							if(a.insertEmployee(e1))
							{
								System.out.println("Employee Inserted with ID: "+e1.getEmpId());
							}
							else
							{
								System.out.println("Opss!Employee Can Not be Inserted......");
							}
						    break;
							
					    case 2:
						
							System.out.println("---------------------------------");
							System.out.println("You Choose to Remove An Employee");
							System.out.println("---------------------------------");
							
							System.out.print("Enter an Employee ID to Remove: ");
							String empId2 = sc.next();
							
							Employee e2 = a.searchEmployee(empId2);
							
							if(e2 != null)
							{
								if(a.removeEmployee(e2))
								{
									System.out.println("Employee Removed with ID: "+e2.getEmpId());
								}
								else
								{
									System.out.println("Employee Can Not be Removed......");
								}
							}
							else
							{
								System.out.println("Employee Does Not Exist");
							}
							break;
						
						
					    case 3:
						
							System.out.println("---------------------------------");
							System.out.println("You Choose to See All Employees");
							System.out.println("---------------------------------");
							
							a.showAllEmployees();
							
						    break;
						
					    case 4:
						
							System.out.println("---------------------------------");
							System.out.println("You Choose to Search An Employee");
							System.out.println("---------------------------------");
							System.out.print("Enter an Employee ID to Search: ");
							String empId3 = sc.next(); 
							
							Employee e3 = a.searchEmployee(empId3);
							
							if(e3 != null)
							{
								System.out.println("Employee Found");
								e3.showDetails();
							}
							else
							{
								System.out.println("Employee Does Not Exist");
							}
							
						    break;
						
					    case 5:
						
							System.out.println("---------------------------------");
							System.out.println("You Choose to Go Back.......");
							System.out.println("---------------------------------");
						    break;
						
						default:
						
							System.out.println("-----------------------------------");
							System.out.println("Invalid Choice.....");
						    break;
					}
					
					break;
					
					case 2:
				
					System.out.println("-----------------------------------------");
					System.out.println("You have choosen Passenger Management");
					System.out.println("-----------------------------------------");
					
					System.out.println("You have following options: \n");
					System.out.println("1. Insert New Passenger");
					System.out.println("2. Remove Existing Passenger");
					System.out.println("3. Show All Passenger");
					System.out.println("4. Search a Passenger");
					System.out.println("5. Go Back");
					
					System.out.print("Enter You Option: ");
					int option2 = sc.nextInt();
					
				    switch(option2)
					{
					    case 1:
							System.out.println("---------------------------------");
							System.out.println("You Choose to Insert New Passenger");
							System.out.println("---------------------------------");
							
							
							
							System.out.print("Enter Passenger's National ID Number : ");
							String nationalId1 = sc.next();
							System.out.print("Enter Passenger's Passport Number: ");
							String passportNumber1 = sc.next();
							System.out.print("Enter Passenger's Name: ");
							String name1 = sc.next();
							System.out.print("Enter Customer Phone Number: ");
							String phoneNumber1 = sc.next();
							
							Passenger p1 = new Passenger();
							p1.setNationalId(nationalId1);
							p1.setPassportNumber(passportNumber1);
							p1.setName(name1);
							p1.setPhoneNumber(phoneNumber1);
							
							if(a.insertPassenger(p1))
							{
								System.out.println("----  Passenger Inserted, NID : " + p1.getNationalId() + "  ----");
							}
							else
							{
								System.out.println("---  Opss!Passenger NOT Inserted, NID : " + p1.getNationalId() + "  ---");
							}							
						    break;
							
					    case 2:
							System.out.println("---------------------------------");
							System.out.println("You Choose to Remove a Passenger");
							System.out.println("---------------------------------");
							
							
							System.out.print("Enter the NID to remove a Passenger: ");
							String nationalId2 = sc.next();
							
							Passenger p2 = a.searchPassenger(nationalId2);
							if(p2 != null)
							{
								System.out.println("---  Passenger Found  ---");
								
								if(a.removePassenger(p2))
								{
									System.out.println("---  Passenger Removed with NID : " + p2.getNationalId() + "  ---");
								}
							}
							else 
							{
								System.out.println("---Opss!Passenger Not Found, So can't Remove----");
							}
						    break;
							
						
						
					    case 3:
						
							System.out.println("---------------------------------");
							System.out.println("You Choose to See All Passenger");
							System.out.println("---------------------------------");
							
							a.showAllPassengers();
							
						    break;
							

					    case 4:
							System.out.println("---------------------------------");
							System.out.println("You Choose to Search A Passenger");
							System.out.println("---------------------------------");
							
							System.out.print("Enter the NID to search a Passenger: ");
							String nationalId3 = sc.next();
							
							Passenger p3 = a.searchPassenger(nationalId3);
							
							
							
							
							if(p3 != null)
							{
								System.out.println("---  Passenger Found  ---");
								p3.showDetails();
							}
							else
							{
								System.out.println("---  Opss!Passenger NOT Found  ---");
							}
							
						    break;
						
						
					    case 5:
							System.out.println("---------------------------------");
							System.out.println("You Choose to Go Back.......");
							System.out.println("---------------------------------");
						    break;
						
						default:
						
							System.out.println("-----------------------------------");
							System.out.println("Invalid Choice.....");
							break;
					}

					break;
					
					case 3:
					
					System.out.println("--------------------------------------");
					System.out.println("You have selected Ticket Management");
					System.out.println("--------------------------------------");
				
					System.out.println("What you wanna do?\n");
					
					System.out.println("\t1. Insert New Ticket");
					System.out.println("\t2. Remove Ticket");
					System.out.println("\t3. Search Ticket");
					System.out.println("\t4. Show All Ticket");
					System.out.println("\t5. Go Back");
					
					System.out.println("\n---------------------------");
					System.out.print("Where you wanna go: ");
					int option3 = sc.nextInt();
					System.out.println("---------------------------\n");
					
					switch(option3)
					{
						case 1:
							
							System.out.println("--------------------------------------");
							System.out.println("You have selected Insert New Ticket");
							System.out.println("--------------------------------------");
							
							
							System.out.print("Enter the NID to verify a Passenger for insert Ticket: ");
							String nationalId1 = sc.next();
							
							Passenger p1= a.searchPassenger(nationalId1);
							
							
							if(p1 != null)
							{
								System.out.println("----------------------------");
								System.out.println("---  Passenger Verified  ---");
								System.out.println("----------------------------");
								
								Ticket t = null;
								
								System.out.println("There are Two types of Ticket. Which one do you want to Buy ??? ");
								System.out.println("----------------------------------------------------------------");
								System.out.println("\t1. Business Class Ticket ");
								System.out.println("\t2. Economy Class Ticket ");
								System.out.println("\t3. Go Back");
								
								System.out.println("\n---------------------------");
								System.out.print("What's the type, you wanna buy: ");
								int type = sc.nextInt();
								System.out.println("---------------------------\n");
								
								if(type == 1)
								{
									System.out.print("Enter Ticket Number: ");
									String tn = sc.next();
									System.out.print("Enter Ticket Payment: ");
									double pa = sc.nextDouble();
									System.out.print("Enter Business Class Rate: ");
									double br = sc.nextDouble();
									
									BusinessClass bc = new BusinessClass(tn, p1, pa, br);
									t = bc;
									
								}
								else if(type == 2)
								{
									System.out.print("Enter Ticket Number: ");
									String tn = sc.next();
									System.out.print("Enter Ticket Payment: ");
									double pa = sc.nextDouble();
									System.out.print("Enter Economy Class rate: ");
									double er = sc.nextDouble();
									
									EconomyClass ec = new EconomyClass(tn, p1, pa, er);
									
									t = ec;
								}
								else if(type == 3)
								{
									System.out.println("--------------------------------------");
									System.out.println("You have selected to Go Back....");
									System.out.println("--------------------------------------");
								}
								else
								{									
									System.out.println("--------------------------------------");
									System.out.println("Opss!Invalid Option... Go Back...");
									System.out.println("--------------------------------------");
								}
								
								if(t!= null)
								{
									if(a.insertTicket(t))
									{
										System.out.println("---  Ticket Inserted, Ticket Number: " + t.getTicketNumber() + "  ---");
									}
									else
									{
										System.out.println("---  Ticket Inserted, Ticket Number: " + t.getTicketNumber() + "  ---");
									}
								}	
							}
							else
							{
								System.out.println("---  Opss!Invalid Passenger... Can NOT Buy or Book any Ticket   ---");
							}
							
							
							break;
							
						case 2:
							
							System.out.println("--------------------------------------");
							System.out.println("You have selected Remove Ticket");
							System.out.println("--------------------------------------");
							
							System.out.print("Enter the Ticket Number to Remove: ");
							String ticketNumber1 = sc.next();
							
							Ticket t1 = a.searchTicket(ticketNumber1);
							if(t1 != null)
							{
								System.out.println("---  Ticket Found  ---");
								
								if(a.removeTicket(t1))
								{
									System.out.println("---  Ticket Removed with Ticket Number : " + t1.getTicketNumber() + "  ---");
								}
								
							}
							else 
							{
								System.out.println("---Opss!Ticket Not Found, So can't Remove----");
							}
			                break;
							
						case 3:
							
							System.out.println("--------------------------------------");
							System.out.println("You have selected Search Ticket");
							System.out.println("--------------------------------------");
							
							
							System.out.print("Enter the Ticket number: ");
							String ticketNumber2 = sc.next();
							
							Ticket t2= a.searchTicket(ticketNumber2);
							
							if(t2 == null)
							{
								System.out.println("---Opss!Ticket Not Found---");
							}
							else{
								System.out.println("--- Ticket Found---");
							}
							
							break;
							
						case 4:
						
							System.out.println("--------------------------------------");
							System.out.println("You have selected Show All Tickets");
							System.out.println("--------------------------------------");
							
							a.showAllTickets();
							
							break;
							
						case 5:
							
							System.out.println("--------------------------------------");
							System.out.println("You have selected to Go Back....");
							System.out.println("--------------------------------------");
							
							break;
							
						default:
							
							System.out.println("--------------------------------------");
							System.out.println("Opss!Invalid Option... Go Back...");
							System.out.println("--------------------------------------");
							break;
					}
					
					
					break;
					
					case 4:
				 
				    System.out.println("-----------------------------------------");
					System.out.println("You Choose  Flight Booking Transaction Management");
					System.out.println("-----------------------------------------");
					
					System.out.println("You have following options: \n");
					System.out.println("\t1.Deposite Payment");
					System.out.println("\t2.Withdraw Payment");
					System.out.println("\t3.Payment History"); 
					System.out.println("\t4.Go Back");
					
					System.out.println("---------------------------");
					System.out.print("Which one you looking for: ");
					int option4 = sc.nextInt();
					  
					switch(option4)	
					{
					case 1:
							
							System.out.println("-------------------------------------");
							System.out.println("You have selected Deposit Payment");
							System.out.println("-------------------------------------");
							
							System.out.print("Enter Ticket Number for Verification: ");
							String tn1 = sc.next();
							
							Ticket t1 = a.searchTicket(tn1);
							
							if(t1 != null)
							{
								System.out.println("------------------------");
								System.out.println("--- Ticket Verified  ---");
								System.out.println("------------------------");
								System.out.println("Ticket Number: " + t1.getTicketNumber());
								System.out.println("Ticket Holder Name: " + t1.getPassenger().getName());
								
								System.out.println("Current Payment: " + t1.getPayment());
								System.out.print("Deposit Payment: ");
								double am = sc.nextDouble();
								
								if(t1.depositBalance(am))
								{ 
							        System.out.println("-----------------------------------");
									System.out.println("--- Deposit Payment Successfull ---");
									System.out.println("-----------------------------------");
									System.out.println("New Payment: " + t1.getPayment());
									frwd.writeInFile(am + " Deposited Balance in " + t1.getTicketNumber());
								}
								else
								{
									System.out.println("--- Opss!Deposit payment Failed ---");
								}
							}
							else
							{
								System.out.println("---  Opss!Invalid Ticket... Can NOT Deposit Balance  ---");
							}
							
							
							break;
							
						case 2:
							
							System.out.println("-------------------------------------");
							System.out.println("You have selected Withdraw Balance");
							System.out.println("-------------------------------------");
							
							System.out.print("Enter Ticket Number for Verification: ");
							String tn2 = sc.next();
							
							Ticket t2 = a.searchTicket(tn2);
							
							if(t2 != null)
							{
								System.out.println("************************");
								System.out.println("*** Ticket Verified  ***");
								System.out.println("************************");
								System.out.println("Ticket Number: " + t2.getTicketNumber());
								System.out.println("Ticket Holder Name: " + t2.getPassenger().getName());
								
								System.out.println("Current Payment: " + t2.getPayment());
								System.out.print("Withdraw Amount: ");
								double am = sc.nextDouble();
								
								if(t2.withdrawBalance(am))
								{
									System.out.println("----------------------------");
									System.out.println("--- Withdraw Successfull ---");
									System.out.println("----------------------------");
									System.out.println("--New Ticket Payment : " + t2.getPayment());
									frwd.writeInFile(am + " Withdrawn Ticket payment " + t2.getTicketNumber());
								}
								else
								{
									System.out.println("--- Opss!Ticket Balance Withdraw Failed ---");
								}
							}
							else
							{
								System.out.println("---  Opss!Invalid Ticket ... Can NOT Withdraw Money for it   ---");
							}
							
							break;
							
						case 3:
							
							System.out.println("-------------------------------------");
							System.out.println("You have selected Ticket Transaction History");
							System.out.println("-------------------------------------");
							
							frwd.readFromFile();
							
							break;
							
						case 4:
							
							System.out.println("-------------------------------------");
							System.out.println("You have selected to Go Back....");
							System.out.println("-------------------------------------");
							
							break;
							
						default:
							
							System.out.println("-------------------------------------");
							System.out.println("Opss!Invalid Option... Go Back...");
							System.out.println("-------------------------------------");
							break;
					}
					
					break;
						
				case 5:
					
					repeat = false;
					System.out.println("-------------------------------------");
					System.out.println("***  THANK YOU!! Take love from Air New-Zeland  ***");
					System.out.println("-------------------------------------");
					
					break;
				
				default:
					
					System.out.println("-------------------------------------");
					System.out.println("Opss!Invalid Choice... Please Try Again ....");
					System.out.println("-------------------------------------");
					
					break;

				 
			}
			System.out.println("-----------------------------------\n");
		}
	}
}