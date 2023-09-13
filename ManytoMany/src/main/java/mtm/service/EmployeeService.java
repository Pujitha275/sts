package mtm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mtm.entity.Employee;
import mtm.repository.EmployeeRepository;


@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository erep;

	 public List<Employee>getAllEmployees(){
		 return erep.findAll();
	 }
	 public Employee addEmployee(Employee e) {
		 return erep.save(e);
	 }
}
