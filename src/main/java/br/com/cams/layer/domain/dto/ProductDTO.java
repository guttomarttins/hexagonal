package br.com.cams.layer.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductDTO {

	private String sku;
	private String name;
	private Double price;
	private Double quantity;

}
