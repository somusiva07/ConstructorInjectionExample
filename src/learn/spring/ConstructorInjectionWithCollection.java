package learn.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ConstructorInjectionWithCollection {

	public static void main(String args[])
	{
		
		  Resource resource = new ClassPathResource("appContext_CIwithCollection.xml");
		  BeanFactory factory = new XmlBeanFactory(resource);
		  
		  //Employee employee = factory.getBean(Employee.class); 
		  EmployeeWithCollection employee = (EmployeeWithCollection)factory.getBean("employeeBean");
		  employee.show();
		 
		
	 
	}
	
}
