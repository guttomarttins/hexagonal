package br.com.cams.layer.application.adpters;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cams.layer.domain.dto.ProductDTO;
import br.com.cams.layer.domain.dto.StockDTO;
import br.com.cams.layer.domain.port.interfaces.ProductServicePort;

@RestController
@RequestMapping("product")
public class ProductController {

	private ProductServicePort ProductServicePort;

	public ProductController(ProductServicePort ProductServicePort) {
		this.ProductServicePort = ProductServicePort;
	}

	@PostMapping
	void criarProducts(@RequestBody ProductDTO ProductDTO) {
		ProductServicePort.createProduct(ProductDTO);
	}

	@GetMapping
	List<ProductDTO> getProducts() {
		return ProductServicePort.findProducts();
	}

	@PutMapping(value = "/{sku}")
	void atualizarEstoque(@PathVariable String sku, @RequestBody StockDTO estoqueDTO) throws NotFoundException {
		ProductServicePort.updateStock(sku, estoqueDTO);
	}

}
