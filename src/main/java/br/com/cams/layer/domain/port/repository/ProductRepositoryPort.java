package br.com.cams.layer.domain.port.repository;

import java.util.List;

import br.com.cams.layer.domain.Product;

public interface ProductRepositoryPort {
	
    List<Product> findProducts();
    Product findBySku(String sku);
    void save(Product obj);

}
