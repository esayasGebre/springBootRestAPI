package springbootrestservice.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springbootrestservice.app.model.Employee;
import springbootrestservice.app.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepository;
	
	public List<Employee> findAllEmployees() {
		return empRepository.findAll();
	}
	
	public Employee findById(long id) {
		return empRepository.findOne(id);
	}

	public void saveEmployee(Employee employee) {
		empRepository.save(employee);
	}

	public boolean isEmployeeExist(Long empId) {
		return empRepository.getOne(empId).equals(null) ? false : true;
	}
}
