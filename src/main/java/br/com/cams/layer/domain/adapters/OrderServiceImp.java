package br.com.cams.layer.domain.adapters;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import br.com.cams.layer.domain.Product;
import br.com.cams.layer.domain.dto.ProductDTO;
import br.com.cams.layer.domain.dto.StockDTO;
import br.com.cams.layer.domain.exceptions.ObjectNotFoundException;
import br.com.cams.layer.domain.port.interfaces.ProductServicePort;
import br.com.cams.layer.domain.port.repository.ProductRepositoryPort;

public class OrderServiceImp implements ProductServicePort {

	private final ProductRepositoryPort productRepository;

	public OrderServiceImp(ProductRepositoryPort productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public List<ProductDTO> findProducts() {
		List<Product> produtos = this.productRepository.findProducts();
		return produtos.stream().map(Product::toProductDTO).collect(Collectors.toList());
	}

	@Override
	public void createProduct(ProductDTO dto) {
		Product obj = new Product(dto);
        this.productRepository.save(obj);
	}

	@Override
	public void updateStock(String sku, StockDTO dto) {
		Product obj = this.productRepository.findBySku(sku);

        if (Objects.isNull(obj))
            throw new ObjectNotFoundException("Product Not Found!");

        obj.updateStock(dto.getQuantity());

        this.productRepository.save(obj);

	}

}
