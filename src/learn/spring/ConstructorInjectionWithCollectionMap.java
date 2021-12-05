package learn.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ConstructorInjectionWithCollectionMap {

	public static void main(String args[])
	{
		
		  Resource resource = new ClassPathResource("appContext_CICollectionwithMap.xml");
		  BeanFactory factory = new XmlBeanFactory(resource);
		  
		  //Employee employee = factory.getBean(Employee.class); 
		  EmployeeWithCollectionMap employee = (EmployeeWithCollectionMap)factory.getBean("employeeMap");
		  employee.show();
		 
		
	 
	}
	
}
