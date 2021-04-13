package com.wassim.produits.repos;
import org.springframework.data.jpa.repository.JpaRepository;

import com.wassim.produits.entities.Produit;
public interface ProduitRepository extends JpaRepository<Produit, Long> {
}