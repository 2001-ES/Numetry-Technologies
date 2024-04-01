package com.esha.serviceIMPL;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esha.model.Employee;
import com.esha.repository.EmployeeRepo;
import com.esha.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		Employee emp =employeeRepo.save(employee);
		
		
		return emp;
	}

	@Override
	public String removeEmployee(int id) {
		
		employeeRepo.deleteById(id);
		
		return "Delete data Successfully";
	}

	@Override
	public Optional<Employee> findEmpById(int id) {
		
		Optional<Employee> emp = employeeRepo.findById(id);
		
		if(emp.isPresent()) {
			return emp;
		}else {
			return null;
		}
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

}
