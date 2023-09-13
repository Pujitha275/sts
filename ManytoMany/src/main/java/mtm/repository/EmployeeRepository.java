package mtm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mtm.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
