package mtm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import mtm.entity.Project;
import mtm.service.ProjectService;

@RestController
@RequestMapping("/Project")
public class ProjectController {
	
	@Autowired
	private ProjectService ps;

	@GetMapping("/all")
	public List<Project>getAllProjects(){
		return  ps.getAllProjects();
	}
//	{
//		  "id": 2,
//		  "name": "Puji",
//		  "projects": [
//		    {
//		      "name": "java"
//		     
//		    },
//		    {
//		        "name":"Testing"
//		    }
//		    
//		  ]
//		}
	@PostMapping("/add")
	public Project addprProject(@RequestBody Project p) {
		return ps.addProject(p);
	}
}




//
//@SequenceGenerator(name = "generator2", sequenceName = "gen2", initialValue = 5000)
//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator2")