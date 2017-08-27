package com.metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.dao.IProduitDao;
import com.dao.SingletonConnection;
import com.entities.Produit;

public class ProduitDaoImpl implements IProduitDao {

	public Produit save(Produit p) {
		// TODO Auto-generated method stub
		Connection connection= SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement
					("INSERT INTO PRODUITS (DESIGNATION,PRIX,QUANTITE) VALUES(?,?,?)");
			ps.setString(1,p.getDesignation());
			ps.setDouble(2,p.getPrix());
			ps.setInt(3,p.getQuantite());
			ps.executeUpdate();
			PreparedStatement ps2=connection.prepareStatement("SELECT MAX(ID) AS MAX_ID FROM PRODUITS");
			ResultSet rs=ps2.executeQuery();
			if(rs.next()){
				p.setId(rs.getLong("MAX_ID"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return p;
	}

	public List<Produit> produitParCM(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	public Produit getProduit(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Produit update(Produit p) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void deleteProduit(Long id) {
		// TODO Auto-generated method stub

	}

}
