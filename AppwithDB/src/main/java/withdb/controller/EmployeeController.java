package withdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import withdb.entity.Employee;
import withdb.service.EmployeeService;

@RestController     //to interact with web
@RequestMapping("/Employee")
public class EmployeeController {
@Autowired
private EmployeeService employeeService;

@GetMapping("/all")
public List<Employee> getEmployees(){
return this.employeeService.getAllEmployees();
}
@PostMapping("/add")
public Employee addEmpolyee(@RequestBody Employee e) {
	return this.employeeService.addEmployee(e);
}
@DeleteMapping("/del/{id}")
public void delEmployee(@PathVariable int id) {
	employeeService.delEmployee(id);
}
@PutMapping("/update/{id}")
public Employee updateEmployee(@PathVariable int id,@RequestBody Employee e ) {
return employeeService.updateEmployee(id,e);
}
@GetMapping("/search/{id}")
public List<Employee> findByid(@PathVariable int id){
	return this.employeeService.findByid(id);
	}
@GetMapping("/nsearch/{ename}")
public List<Employee> findByename(@PathVariable String ename){
	return this.employeeService.findByename(ename);
}
}

