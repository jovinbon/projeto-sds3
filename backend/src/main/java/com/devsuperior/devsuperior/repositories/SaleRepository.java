package com.devsuperior.devsuperior.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.devsuperior.devsuperior.dto.SaleSuccessDTO;
import com.devsuperior.devsuperior.dto.SaleSumDTO;
import com.devsuperior.devsuperior.entities.Sale;

public interface SaleRepository extends JpaRepositoryImplementation<Sale, Long> {
	
	@Query("SELECT new com.devsuperior.devsuperior.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new com.devsuperior.devsuperior.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> successGroupedBySeller();

}
