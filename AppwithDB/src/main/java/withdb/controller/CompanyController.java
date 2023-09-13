package withdb.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import withdb.entity.Company;
import withdb.service.CompanyService;

@RestController
@RequestMapping("/Company")
public class CompanyController {
	@Autowired
	public CompanyService companyService;
	
	@GetMapping("/all")
	public List<Company>getallcompany(){	
	return this.companyService.getallcompanies();
			}
	@PostMapping("add")
	public Company addCompany(@RequestBody Company c) {
		return this.companyService.addCompany(c);
	}
	

}