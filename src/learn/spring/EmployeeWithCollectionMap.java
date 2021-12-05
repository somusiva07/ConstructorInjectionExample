package learn.spring;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EmployeeWithCollectionMap {

	int employeeNumber;
	String employeeName;
	Map<String, String> skillSet;
	
	public EmployeeWithCollectionMap() {
		System.out.println("Default Constructor");
	}
	
	public EmployeeWithCollectionMap(int employeeNumber, String employeeName, Map<String,String> skillSet) {
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.skillSet= skillSet;
	}
	
	void show(){  
	    System.out.println("Employee id : "+ employeeNumber + " : EmployeeName :  "+employeeName);
	    System.out.println("Employee Skillsets : ");
	    Set<Entry<String,String>> skillsMap = skillSet.entrySet();
	    Iterator<Entry<String,String>> skills = skillsMap.iterator();
	    while(skills.hasNext())
	    {
	    	Entry<String,String> skill = skills.next();
	    	System.out.println("Stream :"+skill.getKey()+" : Skills : "+skill.getValue());
	    }
	}  
	
}
