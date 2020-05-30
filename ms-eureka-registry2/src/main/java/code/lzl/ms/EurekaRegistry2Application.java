package code.lzl.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaRegistry2Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(EurekaRegistry2Application.class, args);
	}

}
