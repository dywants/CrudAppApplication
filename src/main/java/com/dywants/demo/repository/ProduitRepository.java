package com.dywants.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dywants.demo.modele.Produit;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {
    
}
