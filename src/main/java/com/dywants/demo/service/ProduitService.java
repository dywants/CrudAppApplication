package com.dywants.demo.service;

import java.util.List;

import com.dywants.demo.modele.Produit;

public interface ProduitService {
    Produit createProduct(Produit produit);

    List<Produit> readProduct();

    Produit updateProduct(Long id ,Produit produit);

    String deleteProduct(Long id);
}
