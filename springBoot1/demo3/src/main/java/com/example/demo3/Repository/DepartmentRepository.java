package com.example.demo3.Repository;

import java.util.List;

import com.example.demo3.model.Department;
import com.example.demo3.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
* Describe class here.
*
*
*
*
*
*/
// Java EE patterns such as "Data Access Object" may also apply this stereotype to DAO classes
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {


}
