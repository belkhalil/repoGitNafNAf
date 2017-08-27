package com.dao;

import java.util.List;

import com.entities.Produit;

public interface IProduitDao {
	public Produit save(Produit p);
	public List<Produit> produitParCM(String mc);
	public Produit getProduit(Long id);
	public Produit update(Produit p);
	public void deleteProduit(Long id);
	

}
