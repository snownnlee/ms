package code.lzl.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableConfigServer
@RestController
public class ConfigServerApplication {
	
	@GetMapping("/")
	public String index() {
		return "Hello, I am ConfigServer!";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
