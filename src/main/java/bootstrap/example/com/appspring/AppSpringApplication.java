package bootstrap.example.com.appspring;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("bootstrap.example.com.appspring")
@EntityScan("bootstrap.example.com.appspring")
@SpringBootApplication
public class AppSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppSpringApplication.class, args);
	}



}
