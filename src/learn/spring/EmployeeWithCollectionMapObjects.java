package learn.spring;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EmployeeWithCollectionMapObjects {

	int employeeNumber;
	String employeeName;
	Map<Address, Skills> addressSkills;
	
	public EmployeeWithCollectionMapObjects() {
		System.out.println("Default Constructor");
	}
	
	public EmployeeWithCollectionMapObjects(int employeeNumber, String employeeName, Map<Address, Skills> addressSkills) {
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.addressSkills= addressSkills;
	}
	
	void show(){  
	    System.out.println("Employee id : "+ employeeNumber + " : EmployeeName :  "+employeeName);
	    System.out.println("Employee Skillsets : ");
	    Set<Entry<Address, Skills>> skillsMap = addressSkills.entrySet();
	    Iterator<Entry<Address, Skills>> skills = skillsMap.iterator();
	    while(skills.hasNext())
	    {
	    	Entry<Address, Skills> skill = skills.next();
	    	System.out.println("Address :"+skill.getKey().city+","+skill.getKey().state+","+skill.getKey().country);
	    	System.out.println("Skills :"+skill.getValue().stream+","+skill.getValue().skills);
	    }
	}  
	
}
