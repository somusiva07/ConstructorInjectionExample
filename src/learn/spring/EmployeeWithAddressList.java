package learn.spring;

import java.util.Iterator;
import java.util.List;

public class EmployeeWithAddressList {

	int employeeNumber;
	String employeeName;
	List<Address> address;//aggregation - has a relationship
	
	public EmployeeWithAddressList() {
		System.out.println("Default Constructor");
	}
	
	public EmployeeWithAddressList(int employeeNumber, String employeeName, List<Address> address) {
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.address = address;
	}
	
	void show(){  
	    System.out.println("Employee id : "+ employeeNumber + " : EmployeeName :  "+employeeName);
	    Iterator<Address> addresses = address.iterator();
	    while(addresses.hasNext())
	    {
	    	Address address = addresses.next();
	    	System.out.println("Employee Address : "+address.city+","+address.state+","+address.country);
	    }
	}  
	
}
