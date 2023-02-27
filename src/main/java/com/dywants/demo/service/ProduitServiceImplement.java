package com.dywants.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dywants.demo.modele.Produit;
import com.dywants.demo.repository.ProduitRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProduitServiceImplement implements ProduitService{

    private final ProduitRepository produitRepository;

    @Override
    public Produit createProduct(Produit produit) {
       return produitRepository.save(produit);
    }

    @Override
    public List<Produit> readProduct() {
       return produitRepository.findAll();
    }

    @Override
    public Produit updateProduct(Long id ,Produit produit) {
        return produitRepository.findById(id)
                .map(p -> {
                    p.setPrice(produit.getPrice());
                    p.setName(produit.getName());
                    p.setDescription(produit.getDescription());
                    return produitRepository.save(p);
                })
                .orElseThrow(()-> new RuntimeException(String.format("Product with id [%d] was not found!",id)
                ));
    }

    @Override
    public String deleteProduct(Long id) {
        produitRepository.deleteById(id);
        return String.format("Product with id [%d] was deleted", id);
    }
    
}
