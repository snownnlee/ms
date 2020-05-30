package code.lzl.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import code.lzl.ms.entity.Employee;
import code.lzl.ms.service.EmpService;

@RestController
public class EmpController {
	
	@Autowired
	private EmpService empService;

	@GetMapping("/emp/{id}")
	public Employee getEmp(@PathVariable("id") Integer id) {
		return empService.getEmp(id);
	}
}
