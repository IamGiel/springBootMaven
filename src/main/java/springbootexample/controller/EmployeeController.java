package springbootexample.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springbootexample.dao.EmployeeDao;
import springbootexample.model.Employee;

//this is where all the rest api calls live

@RestController
@RequestMapping("/company")
public class EmployeeController {
	@Autowired
	EmployeeDao employeeDao
	
//	save employee
	@PostMapping("/employees")
	public Employee createEmployee(@Valid @RequestBody Employee emp) {
	
	}
}
