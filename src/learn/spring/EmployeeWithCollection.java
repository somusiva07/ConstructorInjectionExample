package learn.spring;

import java.util.Iterator;
import java.util.List;

public class EmployeeWithCollection {

	int employeeNumber;
	String employeeName;
	List<String> skillSet;
	
	public EmployeeWithCollection() {
		System.out.println("Default Constructor");
	}
	
	public EmployeeWithCollection(int employeeNumber, String employeeName, List<String> skillSet) {
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.skillSet= skillSet;
	}
	
	void show(){  
	    System.out.println("Employee id : "+ employeeNumber + " : EmployeeName :  "+employeeName);
	    System.out.println("Employee Skillsets : ");
	    Iterator<String> skills = skillSet.iterator();
	    while(skills.hasNext())
	    {
	    	System.out.println(skills.next());
	    }
	}  
	
}
