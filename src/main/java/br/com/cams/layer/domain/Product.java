package br.com.cams.layer.domain;

import java.util.UUID;

import br.com.cams.layer.domain.dto.ProductDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
	
	private UUID id;
	private String sku;
	private String name;
	private Double price;
	private Double quantity;
	
    public Product(ProductDTO productDTO) {
        this.sku = productDTO.getSku();
        this.name = productDTO.getName();
        this.price = productDTO.getPrice();
        this.quantity = productDTO.getQuantity();
    }

    public void updateStock(double quantity) {
        this.quantity = quantity;
    }

    public ProductDTO toProductDTO() {
        return new ProductDTO(this.sku, this.name, this.price, this.quantity);
    }

}
