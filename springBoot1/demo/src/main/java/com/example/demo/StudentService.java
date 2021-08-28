package com.example.demo;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Component;

/**
* Describe class here.
* component is bean
*
*
*
*
*/
@Component
public class StudentService {
	/**
	* 
	* @return
	*/
	public List<Student> getStudent() {
		Student student1 = new Student(1L, "ahmad", "ahmad@yahoo.com", LocalDate.of(2000, Month.JANUARY, 5), 50);
		Student student2 = new Student(2L, "ali", "ali@yahoo.com", LocalDate.of(2001, Month.JANUARY, 6), 60);
		Student student3 = new Student(3L, "omar", "omar@yahoo.com", LocalDate.of(2002, Month.JANUARY, 7), 80);
		return List.of(student1, student2, student3);
	}

}
