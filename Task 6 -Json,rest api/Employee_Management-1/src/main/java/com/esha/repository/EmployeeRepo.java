package com.esha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esha.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
}


