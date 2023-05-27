package br.com.cams.layer.infrastructure.adapters.entity;

import java.util.UUID;

import br.com.cams.layer.domain.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "product")
@NoArgsConstructor
public class ProductEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	private String sku;
	private String name;
	private Double price;
	private Double quantity;

	public ProductEntity(Product obj) {
		this.sku = obj.getSku();
		this.name = obj.getName();
		this.price = obj.getPrice();
		this.quantity = obj.getQuantity();
	}

	public void update(Product obj) {
		this.sku = obj.getSku();
		this.name = obj.getName();
		this.price = obj.getPrice();
		this.quantity = obj.getQuantity();
	}

	public Product toProduct() {
		return new Product(this.id, this.sku, this.name, this.quantity, this.price);
	}

}
