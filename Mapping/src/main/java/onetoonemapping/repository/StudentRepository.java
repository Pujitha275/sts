package onetoonemapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import onetoonemapping.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{

}
