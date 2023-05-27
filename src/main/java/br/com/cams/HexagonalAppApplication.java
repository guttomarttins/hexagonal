package br.com.cams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.cams.layer.infrastructure.adapters.repository.SpringProductRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = SpringProductRepository.class)
public class HexagonalAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HexagonalAppApplication.class, args);
	}

}
