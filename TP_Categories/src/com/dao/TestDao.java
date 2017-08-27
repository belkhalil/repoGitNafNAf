package com.dao;

import com.entities.Produit;
import com.metier.ProduitDaoImpl;

public class TestDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProduitDaoImpl dao =new ProduitDaoImpl();
		Produit p1=dao.save(new Produit("hp 678",900,45));
		Produit p2=dao.save(new Produit("hp 687",800,49));
		Produit p3=dao.save(new Produit("hp 689",700,40));

	}

}
