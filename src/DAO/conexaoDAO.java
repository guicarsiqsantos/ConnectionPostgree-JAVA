/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Guilherme C. Santos
 */
public class conexaoDAO {
    
    private Connection con = null;
    //Credenciais
    private String path = "jdbc:postgresql://localhost:5432/";
    private String database ="BDGui"; 
    private String user ="postgres";
    private String password = "1038109";
 
    public Connection connectaPostgre() {
        
        try {
            Class.forName("org.postgresql.Driver");
            try {
               con = DriverManager.getConnection(path + database, user, password);
            } catch (SQLException ex) {
              Logger.getLogger(conexaoDAO.class.getName()).log(Level.SEVERE,null, ex);
            }
            
        } catch (ClassNotFoundException ex) {
        System.out.println("Driver não encontrado");   
        Logger.getLogger(conexaoDAO.class.getName()).log(Level.SEVERE,null, ex);
        }
        
        return con;
    }
}
