package helen.helenweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class HelenWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelenWebApplication.class, args);
	}

}
