package com.example.demo3.services;

import java.util.List;

import com.example.demo3.Repository.DepartmentRepository;
import com.example.demo3.model.Department;
import com.example.demo3.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* Describe class here.
*
*
*
*
*
*/
// "Business Service Facade" (in the Core J2EE patterns sense),
@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	/**
	*
	*
	*/
	public List<Department> getAllDepartments() {
		return departmentRepository.findAll();
	}

	/**
	*
	*
	*/
	public Department findDeptById(long id) {
		return departmentRepository.findById(id).orElseThrow();
	}

	/**
	*
	*
	*/
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}


}
