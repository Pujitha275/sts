package mtm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mtm.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
