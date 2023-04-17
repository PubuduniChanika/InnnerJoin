package net.javaguides.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.Dto.EmployeeDto;
import net.javaguides.springboot.model.Department;

@Repository
public interface EmployeeRepository extends JpaRepository<Department, Long> {
	@Query("SELECT new net.javaguides.springboot.Dto.EmployeeDto(d.name, e.name, e.email, e.address) "
			+ "FROM Department d INNER JOIN d.employees e")
	List<EmployeeDto> fetchEmployeeDataInnerJoin();

}
