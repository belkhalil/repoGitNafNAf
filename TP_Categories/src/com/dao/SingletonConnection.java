package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingletonConnection {
	
	//objet static de type connection creer dans le bloc static
	private static Connection connection;
	
	//dans le bloc static quand une class charger en memoire le bloc static 1er bloc sera exucuter
	//tres util pour un objet creer une seul fois pour tout
	static{
		//charger le pilote
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection
					("jdbc:mysql://127.0.0.1:1028/DB_CATAL","root","");
			
		}catch(Exception e){
			e.printStackTrace();
			}
		
		
	}
	
	public static Connection getConnection(){
		return connection;
		
	}

}
