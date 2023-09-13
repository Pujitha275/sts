package withdb.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import withdb.entity.Employee;





public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	List<Employee> findByid(int id);

	List<Employee> findByename(String ename);

	List<Employee> findByename(Employee ename);



}
