package onetoonemapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import onetoonemapping.entity.StudentEntity;
import onetoonemapping.service.StudentService;
@RestController
@RequestMapping("/StudentEntity")

public class StudentController {
@Autowired
private StudentService studentService;

@GetMapping("/all")
public List<StudentEntity> getAllStudent(){
	return studentService.getAllStudents();	
}
@PostMapping("/add")
public StudentEntity addStudent(@RequestBody StudentEntity s) {
	return studentService.addEntity(s);
}
}