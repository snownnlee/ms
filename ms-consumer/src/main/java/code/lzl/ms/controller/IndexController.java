package code.lzl.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class IndexController {
	
	@GetMapping("/")
	public String find() {
		return "Hello, I am Consumer!";
	}
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/visitprovider")
	public String visitProvider() {
		return restTemplate.getForObject("http://MS-PROVIDER/", String.class);
	}

}
