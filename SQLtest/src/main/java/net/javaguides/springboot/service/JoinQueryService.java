package net.javaguides.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.annotation.Resource;
import net.javaguides.springboot.Dto.EmployeeDto;
import net.javaguides.springboot.repository.EmployeeRepository;

@Service
public class JoinQueryService {

	@Resource
	private EmployeeRepository departmentRepository;

	public List<EmployeeDto> getEmployeesInnerJoin() {
		List<EmployeeDto> list = departmentRepository.fetchEmployeeDataInnerJoin();
		list.forEach(l -> System.out.println(l));
		return list;
	}


}