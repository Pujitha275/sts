package withdb.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import withdb.entity.Employee;
import withdb.repository.EmployeeRepository;


@Service
public class EmployeeService {
@Autowired // to access the methods in service class by controller class
private  EmployeeRepository employeeRepository;
public List<Employee>getAllEmployees(){
	return employeeRepository.findAll();
}
public Employee addEmployee(Employee e) {
	return employeeRepository.save(e);
}
public void  delEmployee(int id) {
 employeeRepository.deleteById(id);
}
public  Employee updateEmployee(int id, Employee e) {
	e.setId(id);
	return employeeRepository.save(e);
}

public List<Employee> findByid(int id) {
	return  employeeRepository.findByid(id);
}

public List<Employee> findByename(String ename) {
	return  employeeRepository.findByename(ename);
}
}
