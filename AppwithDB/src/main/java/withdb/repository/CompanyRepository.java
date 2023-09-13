package withdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import withdb.entity.Company;



public interface  CompanyRepository extends JpaRepository<Company,Integer> {

}
