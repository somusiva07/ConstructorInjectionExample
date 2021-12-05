package learn.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ConstructorInjection {

	public static void main(String args[])
	{
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		//Employee employee = factory.getBean(Employee.class);
		Employee employee = (Employee)factory.getBean("employeebean");
		employee.show();
	}
	
}
