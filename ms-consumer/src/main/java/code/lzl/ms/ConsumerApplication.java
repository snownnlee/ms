package code.lzl.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class ConsumerApplication {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ConsumerApplication.class, args);
	}

}
