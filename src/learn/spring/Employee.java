package learn.spring;

public class Employee {

	int employeeNumber;
	String employeeName;
	
	public Employee() {
		System.out.println("Default Constructor");
	}
	
	public Employee(int employeeNumber) {
		super();
		this.employeeNumber = employeeNumber;
	}
	
	public Employee(String employeeName) {
		super();
		this.employeeName = employeeName;
	}
	
	public Employee(int employeeNumber, String employeeName) {
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
	}
	
	void show(){  
	    System.out.println("Employee id : "+ employeeNumber + " : EmployeeName :  "+employeeName);  
	}  
	
}
