package br.com.cams.layer.infrastructure.adapters.repository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import br.com.cams.layer.domain.Product;
import br.com.cams.layer.domain.port.repository.ProductRepositoryPort;
import br.com.cams.layer.infrastructure.adapters.entity.ProductEntity;
import br.com.cams.layer.infrastructure.exceptions.NotFoundException;

@Component
public class ProductRepository implements ProductRepositoryPort {

	private final SpringProductRepository springProductRepository;

	public ProductRepository(SpringProductRepository springProductRepository) {
		this.springProductRepository = springProductRepository;
	}

	@Override
	public List<Product> findProducts() {
		List<ProductEntity> productEntities = this.springProductRepository.findAll();
		return productEntities.stream().map(ProductEntity::toProduct).collect(Collectors.toList());
	}

	@Override
	public Product findBySku(String sku) {
		Optional<ProductEntity> obj = this.springProductRepository.findBySku(sku);

		if (obj.isPresent())
			return obj.get().toProduct();

		throw new NotFoundException("Not Found!");
	}

	@Override
	public void save(Product obj) {
		ProductEntity productEntity;
		if (Objects.isNull(obj.getId()))
			productEntity = new ProductEntity(obj);
		else {
			productEntity = this.springProductRepository.findById(obj.getId()).get();
			productEntity.update(obj);
		}

		this.springProductRepository.save(productEntity);
	}

}
