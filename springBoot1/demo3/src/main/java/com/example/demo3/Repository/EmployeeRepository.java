package com.example.demo3.Repository;

import java.util.List;

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
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	/**
	* find by Employee.firstName
	* @param firstName
	* @return
	*/
	public List<Employee> findByFirstName(String firstName);

	/**
	* 
	* @param firstName
	* @return
	*/
	@Query(value = "SELECT emp FROM Employee emp   WHERE emp.firstName= :firstBind")
	public List<Employee> findEmpByFirstName(@Param("firstBind") String firstName);

	/**
	* 
	* @param lastName
	* @return
	*/
	@Query(value = "SELECT * FROM employees WHERE last_name= :last_name and salary > 100", nativeQuery = true)
	public List<Employee> findNativeEmpByLastName(@Param("last_name") String lastName);

	/**
	* 
	* @param lastName
	* @return
	*/
	@Query(value = "SELECT * FROM employees WHERE departement_id= :id", nativeQuery = true)
	public List<Employee> findAllEmpOfDeptId(@Param("id") long id);

	/**
	*  find by Employee.Department.id
	* @param id
	* @return
	*/
	public List<Employee> findByDepartementId(long id);
}
