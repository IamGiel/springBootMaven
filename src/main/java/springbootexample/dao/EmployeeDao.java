package springbootexample.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springbootexample.model.Employee;
import springbootexample.repository.EmployeeRepository;

@Service
public class EmployeeDao {
	@Autowired
	EmployeeRepository employeeRepository;
	
//	save employee
	public Employee save(Employee emp) {
		return employeeRepository.save(emp);
	}

//	search employee
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}
//	get employee
	public Optional<Employee> findOne(Long empid) {
		return employeeRepository.findById(empid);
	}
	
//	delete employee
	public void delete(Employee emp) {
		employeeRepository.delete(emp);
	}
	
	

}
