package classes;
import java.lang.*;
import interfaces.*;

public class Bank implements CustomerOperations, EmployeeOperations
{
	private Customer customers[] = new Customer[100];
	private Employee employees[] = new Employee[20];
	
	public void insertCustomer(Customer c)
	{
		int flag = 0;
		
		for(int i=0; i<customers.length; i++)
		{
			if(customers[i] == null)
			{
				customers[i] = c;
				flag = 1;
				break;
			}
		}
	}
	
	public void removeCustomer(Customer c)
	{
		int flag = 0;
		for(int i=0; i<customers.length; i++)
		{
			if(customers[i] == c)
			{
				customers[i] = null;
				flag = 1;
				break;
			}
		}

	}
	
	public Customer getCustomer(int nid)
	{
			Customer c = null;
		
		for(int i=0; i<customers.length; i++)
		{
			if(customers[i] != null)
			{
				if(customers[i].getNid() == nid)
				{
					c = customers[i];
					break;
				}
			}
		}
		return c;
	}
	
	public void showAllCustomers()
	{

		for(Customer c : customers)
		{
			if(c!= null)
			{
				System.out.println("/////////////////////////////////");
				System.out.println("Customer Name: "+ c.getName());
				System.out.println("Customer Nid: "+ c.getNid());
				System.out.println("----------------------------------");
				c.showAllAccounts();
				System.out.println("----------------------------------");
				System.out.println();
			}
		}
	}
	public void insertEmployee(Employee e)
	{
		int flag = 0;
		
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == null)
			{
				employees[i] = e;
				flag = 1;
				break;
			}
		}

	}
	
	public void removeEmployee(Employee e)
	{
		int flag = 0;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == e)
			{
				employees[i] = null;
				flag = 1;
				break;
			}
		}
	}
public Employee getEmployee(String empId)
	{
		Employee e = null;
		
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				if(employees[i].getEmpId().equals(empId))
				{
					e = employees[i];
					break;
				}
			}
		}
		return e;
	}
	public void showAllEmployees()
	{
	
		for(Employee e : employees)
		{
			if(e!= null)
			{
				System.out.println("/////////////////////////////////");
				System.out.println("Employee Name: "+ e.getName());
				System.out.println("Employee Id: "+ e.getEmpId());
				System.out.println("Salary: "+ e.getSalary());
				System.out.println();
			}
		}
	}
	

	
}