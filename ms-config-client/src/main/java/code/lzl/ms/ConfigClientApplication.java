package code.lzl.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClientApplication {

	@GetMapping("/")
	public String index() {
		return "Hello, I am ConfigClient!";
	}
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

}
