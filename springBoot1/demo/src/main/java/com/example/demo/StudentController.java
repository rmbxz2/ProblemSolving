package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* Describe class here.
*
*
*
*
*
*/
@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

	private final StudentService studentService;

	/**
	 * @param studentService
	 */
        @Autowired
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	/**
	* 
	* @return
	*/
	@GetMapping
	public List<Student> getStudent() {
		return studentService.getStudent();
	}

}
