package serviceImpl;

import java.util.ArrayList;
import java.util.List;

import model.Employee;
import service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public List<Employee> generateListOfEmployees() {
		
		List<Employee> employeeList = new ArrayList<>();

		Employee bob = new Employee(36, "Bob", "Crandall", 150000.00, 4, 'M', "Senior Engineer");
		Employee susie = new Employee(26, "Susie", "Box", 50000.00, 3, 'F', "Intern");
		Employee alex = new Employee(26, "Alex", "Buvette", 60000.00, 3, 'M', "Intern");
		Employee omar = new Employee(36, "Omar", "Johnson", 120000.00, 5, 'M', "Senior Engineer");
		Employee kiesha = new Employee(32, "Kiesha", "Bobles", 80000.00, 5, 'F', "Software Engineer");
		Employee hector = new Employee(34, "Hector", "Robles", 90000.00, 4, 'M', "Software Engineer");
		
		
		
		employeeList.add(bob);
		employeeList.add(susie);
		employeeList.add(alex);
		employeeList.add(omar);
		employeeList.add(kiesha);
		employeeList.add(hector);
		
		return employeeList;
	}

}
