package code.lzl.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import code.lzl.ms.service.IndexService;

@RestController
public class IndexController {
	
	@GetMapping("/")
	public String find() {
		return "Hello, I am ConsumerFeign!";
	}
	
	@Autowired
	private IndexService indexService;
	
	@GetMapping("/visitprovider")
	public String visitProvider() {
		return indexService.visitProvider();
	}

}
