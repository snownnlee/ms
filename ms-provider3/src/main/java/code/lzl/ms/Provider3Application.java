package code.lzl.ms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("code.lzl.ms.mapper")
//@EnableEurekaClient
public class Provider3Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Provider3Application.class, args);
	}

}
