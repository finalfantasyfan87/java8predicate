package demo;

import java.util.List;
import java.util.function.Predicate;

import model.Employee;
import serviceImpl.EmployeeServiceImpl;

public class EmployeeDemo {

	public static void main(String[] args) {
		EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
		List<Employee> companyEmployees = employeeService.generateListOfEmployees();
		
		//System.out.println(companyEmployees);
		Predicate<Employee> employesUnder30 = e -> e.getAge() < 30;
		Predicate<Employee> femaleEmployees = e -> e.getGender() == 'F';
		
		//here filtering on employees under30 and map the results to a list
		System.out.println("Here is a report of the company employees under 30 " 
		+ companyEmployees.stream().filter(employesUnder30).toList());
		
		//using findFirst we get the first employee in the list
		System.out.println(companyEmployees.stream().filter(employesUnder30).findFirst().get().getFirstName() 
				+ " is the first employee who is under 30");
		
		System.out.println(companyEmployees.stream().filter(femaleEmployees).toList() + " is the filtered list of female employees");
	}

}
