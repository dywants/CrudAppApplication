package com.dywants.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToDatabase {
    public static void main(String[] args) {
        Connection conn = null;
        try {
           // Charger le pilote JDBC MySQL.
           Class.forName("com.mysql.jdbc.Driver");
  
           // Établir une connexion à la base de données.
           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_app", "root", "root");
  
           if (conn != null) {
              System.out.println("Connexion à la base de données réussie.");
           }
        } catch (SQLException ex) {
           System.out.println("Erreur lors de la connexion à la base de données : " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
           System.out.println("Erreur lors du chargement du pilote JDBC MySQL : " + ex.getMessage());
        }
     }
}
