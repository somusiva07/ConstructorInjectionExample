package learn.spring;

public class EmployeeWithAddress {

	int employeeNumber;
	String employeeName;
	Address address;//aggregation - has a relationship
	
	public EmployeeWithAddress() {
		System.out.println("Default Constructor");
	}
	
	public EmployeeWithAddress(int employeeNumber, String employeeName, Address address) {
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.address = address;
	}
	
	void show(){  
	    System.out.println("Employee id : "+ employeeNumber + " : EmployeeName :  "+employeeName);
	    System.out.println("Employee Address : "+address.city+","+address.state+","+address.country);
	}  
	
}
