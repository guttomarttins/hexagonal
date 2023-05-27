package br.com.cams.layer.infrastructure.adapters.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cams.layer.infrastructure.adapters.entity.ProductEntity;

@Repository
public interface SpringProductRepository extends JpaRepository<ProductEntity, UUID> {
	
	Optional<ProductEntity> findBySku(String sku);

}
