package spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import spring.controller.EmpController;
import spring.model.Employee;

/**
 * Hello world!
 *
 */

public class App {

	public static void main(String[] args) {

		System.out.println("Hello World!");

		// employeeBeans must be in resources folder, src/main/resources/employeeBeans.xml

		// IoC, Dependancy injection 
		// 1- bean factory

		Resource resource = new ClassPathResource("employeeBeans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		// beanFactory it construct the object when we request

		Employee employee1 = (Employee) factory.getBean("emp1");
		Employee employee2 = (Employee) factory.getBean("emp2");
		System.out.println("emp1 = " + employee1);
		System.out.println("emp2 = " + employee2);
		System.out.println("==================================");

		// IoC, Dependancy injection 
		// 2- ApplicationContext , construct the object even if we dont request
		ApplicationContext context = new ClassPathXmlApplicationContext("employeeBeans.xml");
		Employee employee3 = (Employee) context.getBean("emp1");
		Employee employee4 = context.getBean("emp2", Employee.class);
		System.out.println("emp3 = " + employee3);
		System.out.println("emp4 = " + employee4);
		System.out.println("==================================");

		// empAutoWired by name 
		Employee empAutoWiredByName = (Employee) context.getBean("empAutoWiredByName");
		System.out.println("empAutoWiredByName = " + empAutoWiredByName);

		// empAutoWired by type 
		Employee empAutoWiredByTypeDiffName = (Employee) context.getBean("empAutoWiredByType");
		System.out.println("empAutoWiredByTypeDiffName = " + empAutoWiredByTypeDiffName);

		// empAutoWired by constructor
		Employee empAutoWiredByConstructorArgs = (Employee) context.getBean("empAutoWiredByConstructor");
		System.out.println("empAutoWiredByConstructorArgs = " + empAutoWiredByConstructorArgs);

		// autowire by annotation
		EmpController empController = new EmpController();
		empController.printEmp();
		System.out.println("===============================");

	}
}
