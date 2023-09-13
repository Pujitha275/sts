package mtm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mtm.entity.Employee;
import mtm.service.EmployeeService;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
@Autowired
private EmployeeService es;

@GetMapping("/all")
public List<Employee>getAllEmployees(){
	return  es.getAllEmployees();
}
@PostMapping("/add")
public Employee addEmployee(@RequestBody Employee e) {
	return es.addEmployee(e);
}
}
