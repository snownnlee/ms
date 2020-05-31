package code.lzl.ms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import code.lzl.ms.entity.Employee;
import code.lzl.ms.mapper.EmployeeMapper;

@Service
public class EmpService {
	
	@Autowired
	private EmployeeMapper employeeMapper;
	
	public Employee findEmployee(Integer id) {
		return employeeMapper.selectById(id);
	}

}
