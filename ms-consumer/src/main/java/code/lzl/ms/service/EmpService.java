package code.lzl.ms.service;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import code.lzl.ms.entity.Employee;

@Service
public class EmpService {
	
	static final String EMP_SERVICE_ADDR = "http://localhost:8077";
	
	@Autowired
	private RestTemplate restTemplate;
	
	public Employee getEmp(Integer id) {
		return restTemplate.getForObject(URI.create(EMP_SERVICE_ADDR+"/emp/"+id), Employee.class);
	}

}
