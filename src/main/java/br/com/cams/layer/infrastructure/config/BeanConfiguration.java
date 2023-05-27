package br.com.cams.layer.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.cams.layer.domain.adapters.OrderServiceImp;
import br.com.cams.layer.domain.port.interfaces.ProductServicePort;
import br.com.cams.layer.domain.port.repository.ProductRepositoryPort;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public ProductServicePort produtoService(ProductRepositoryPort repository) {
        return new OrderServiceImp(repository);
    }

}
