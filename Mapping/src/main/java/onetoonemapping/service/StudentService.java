package onetoonemapping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import onetoonemapping.entity.StudentEntity;
import onetoonemapping.repository.StudentRepository;

@Service
public class StudentService {
@Autowired
private StudentRepository studentRepository;

//To get

public List<StudentEntity> getAllStudents(){             // to get all
	return studentRepository.findAll();
}
public StudentEntity addEntity(StudentEntity se) {         //to add
	return studentRepository.save(se);	 
}

}