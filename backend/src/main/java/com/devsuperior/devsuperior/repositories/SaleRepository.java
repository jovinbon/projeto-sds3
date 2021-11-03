package com.devsuperior.devsuperior.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.devsuperior.devsuperior.entities.Sale;

public interface SaleRepository extends JpaRepositoryImplementation<Sale, Long> {

}
