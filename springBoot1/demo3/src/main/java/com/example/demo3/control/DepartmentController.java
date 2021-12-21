package com.example.demo3.control;

import java.util.List;

import com.example.demo3.model.Department;
import com.example.demo3.services.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
* Describe class here.
*
*
*
*
*
*/
@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	/**
	* 
	* @return
	*/
	@GetMapping(value = "/AllDept")
	public List<Department> getAllDept() {
		return departmentService.getAllDepartments();
	}

	/**
	* 
	* @param dept
	* @return
	*/
	@PostMapping(value = "/addDept")
	public Department saveDepartment(@RequestBody Department dept) {
		return departmentService.saveDepartment(dept);
	}

}
