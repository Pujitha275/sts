package com.projectlombok.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectlombok.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
