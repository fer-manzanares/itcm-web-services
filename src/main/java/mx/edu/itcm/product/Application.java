package mx.edu.itcm.product;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import mx.edu.itcm.product.repository.ProductRepository;
import mx.edu.itcm.product.service.ProductService;

@SpringBootApplication()
public class Application {

	public static void main(String[] args) {
		 SpringApplication application = new SpringApplication(Application.class);
	     application.setAdditionalProfiles("ssl");
	     application.run(args);
	}

	@Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
