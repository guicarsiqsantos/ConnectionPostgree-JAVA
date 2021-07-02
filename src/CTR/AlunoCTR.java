/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTR;

import DAO.AlunoDAO;
import MODEL.alunoMODEL;

/**
 *
 * @author guica
 */
public class AlunoCTR {
    
    public void inserirAlunoCTR(String nome, double nota){
    
        alunoMODEL objaluno = new alunoMODEL();
        
        objaluno.setNome(nome);
        objaluno.setNota(nota);
        
        AlunoDAO objDAO = new AlunoDAO();
        
        objDAO.insertAluno(objaluno);
        
    }
    
}
