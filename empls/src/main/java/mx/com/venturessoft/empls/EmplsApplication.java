package mx.com.venturessoft.empls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"mx.com.venturessoft.empls"})
@EntityScan(basePackages = {"mx.com.venturessoft.empls.entity"})
@EnableJpaRepositories(basePackages = {"mx.com.venturessoft.empls.repository"})
@SpringBootApplication
public class EmplsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmplsApplication.class, args);
	}

}
