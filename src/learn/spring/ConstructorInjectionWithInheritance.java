package learn.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ConstructorInjectionWithInheritance {

	public static void main(String args[])
	{
		Resource resource = new ClassPathResource("appContext_CIwithInheritance.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		//Employee employee = factory.getBean(Employee.class);
		EmployeeWithAddress employee = (EmployeeWithAddress)factory.getBean("anotherEmployeeBean");
		employee.show();
	}
	
}
