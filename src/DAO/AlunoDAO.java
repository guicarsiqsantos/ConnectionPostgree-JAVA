/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.alunoMODEL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author guica
 */
public class AlunoDAO {
    
    Connection con;
    PreparedStatement pgsql;
    Statement st;
    
    public void insertAluno(alunoMODEL aluno){
    
        conexaoDAO cb = new conexaoDAO();
        con = cb.connectaPostgre();
        
        String sql = "insert into aluno (nome, nota) values (?,?)";
        
        try {
            pgsql = con.prepareCall(sql);
            pgsql.setString(1, aluno.getNome());
            pgsql.setDouble(2, (double) aluno.getNota());
            
            pgsql.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Nota enviada com Sucesso");
            
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
