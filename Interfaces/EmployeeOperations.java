package Interfaces;
import java.lang.*;
import Classes.*;

public interface EmployeeOperations
{
	boolean insertEmployee(Employee e);
	boolean removeEmployee(Employee e);
	Employee searchEmployee(String empId);
	void showAllEmployees();
}