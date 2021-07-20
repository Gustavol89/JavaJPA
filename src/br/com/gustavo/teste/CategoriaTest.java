/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gustavo.teste;

import br.com.gustavo.connection.ConnectionFactory;
import br.com.gustavo.model.DAO.CategoriaDAO;
import br.com.gustavo.model.bean.Categoria;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author GUSTAVO
 */
public class CategoriaTest {
    
    public static void main(String[] args) {
       
        
        CategoriaDAO dao = new CategoriaDAO();
        
        dao.delete(3);
        
        System.out.println("id deletado: "+3);
     
        
    }
    
}
