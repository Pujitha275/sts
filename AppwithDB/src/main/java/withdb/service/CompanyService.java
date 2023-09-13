package withdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import withdb.entity.Company;
import withdb.repository.CompanyRepository;



@Service
public class CompanyService {
	@Autowired
	private CompanyRepository companyRepository;
	
	public List<Company>getallcompanies(){
		return companyRepository.findAll();
	}
	public Company addCompany(Company c) {
		return companyRepository.save(c);
		
	}
}
