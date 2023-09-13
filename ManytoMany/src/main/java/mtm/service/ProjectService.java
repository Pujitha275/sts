package mtm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mtm.entity.Project;
import mtm.repository.ProjectRepository;

@Service
public class ProjectService {
@Autowired
private ProjectRepository prep;

 public List<Project>getAllProjects(){
	 return prep.findAll();
 }
 public Project addProject(Project p) {
	 return prep.save(p);
 }
}
