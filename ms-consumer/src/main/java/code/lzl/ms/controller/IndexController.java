package code.lzl.ms.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class IndexController {
	
	@GetMapping("/")
	public String find() {
		return "Hello, I am Consumer!";
	}
	
	private Random random = new Random();
	
	@GetMapping("/test/hystrix")
	@HystrixCommand(fallbackMethod = "testHystrixFallback")
	public String testHystrix() {
		return String.valueOf(2/random.nextInt(2));
	}
	
	public String testHystrixFallback() {
		return "Err:【I am testHystrixFallback!】";
	}
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/visitprovider")
	public String visitProvider() {
		return restTemplate.getForObject("http://MS-PROVIDER/", String.class);
	}

}
