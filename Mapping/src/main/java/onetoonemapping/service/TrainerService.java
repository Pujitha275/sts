package onetoonemapping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import onetoonemapping.entity.Trainer;
import onetoonemapping.repository.Trainerrepository;

@Service
public class TrainerService {
@Autowired
private Trainerrepository trainerrepository;

//To get
public List<Trainer> getAllTrainer(){
	return trainerrepository.findAll();	
}
//to add
public Trainer addTrainer(Trainer t) {
	return trainerrepository.save(t);	
}
//to delete
public void deletetrainer(int tid) {
	trainerrepository.deleteById(tid);
}
}
