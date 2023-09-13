package onetoonemapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import onetoonemapping.entity.Trainer;
import onetoonemapping.service.TrainerService;

@RestController
@RequestMapping("/Trainer")
public class TrainerController {
@Autowired
private TrainerService trainerService;

@GetMapping("/all")
public List<Trainer>getAllTrainers(){
	return trainerService.getAllTrainer();	
}
@PostMapping("/add")            //http://localhost:8080/Trainer/add
public Trainer addTrainer( @RequestBody Trainer t) {
	return trainerService.addTrainer(t);
}
@DeleteMapping("/delete/{tid}")
	public void deletetrainers(@PathVariable int tid) {
	trainerService.deletetrainer(tid);
}
}
