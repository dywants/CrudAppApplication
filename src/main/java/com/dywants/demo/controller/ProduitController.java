package com.dywants.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dywants.demo.service.ProduitService;

import lombok.AllArgsConstructor;
import com.dywants.demo.modele.Produit;
import java.util.List;

@RestController
@RequestMapping("/produit")
@AllArgsConstructor
public class ProduitController {

    private final ProduitService produitService;

    @PostMapping("/createProduit")
    public Produit create(@RequestBody Produit produit){
        return produitService.createProduct(produit);
    }

    @GetMapping
    public List<Produit> read(){
        return produitService.readProduct();
    }

    @PutMapping("/update/{id}")
    public Produit update(@RequestBody Produit produit, @PathVariable Long id){
        return produitService.updateProduct(id, produit);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return produitService.deleteProduct(id);
    }
}
