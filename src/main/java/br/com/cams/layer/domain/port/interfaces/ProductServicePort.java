package br.com.cams.layer.domain.port.interfaces;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import br.com.cams.layer.domain.dto.ProductDTO;
import br.com.cams.layer.domain.dto.StockDTO;

public interface ProductServicePort {

    List<ProductDTO> findProducts();
    void createProduct(ProductDTO dto);
    void updateStock(String sku, StockDTO dto) throws NotFoundException;

}
