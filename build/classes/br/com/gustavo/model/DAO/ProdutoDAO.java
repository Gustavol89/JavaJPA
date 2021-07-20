/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gustavo.model.DAO;

import br.com.gustavo.connection.ConnectionFactory;
import br.com.gustavo.model.bean.Produto;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author GUSTAVO
 */
public class ProdutoDAO {
    
    //CRIANDO METODO PARA SALVAR NO BANCO DE DADOS
    public Produto save(Produto produto){
        
        EntityManager em = new ConnectionFactory().getConnection();
        
        try {
            
            em.getTransaction().begin();
            em.persist(produto);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        
        return produto;
        
    }
    
    public Produto update(Produto produto){
        
        EntityManager em = new ConnectionFactory().getConnection();
        
        try {
            em.getTransaction().begin();
            
            if (produto.getId() == null){
                em.persist(produto);
            }else{
                em.merge(produto);
            }
            
            em.getTransaction().commit();
         
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        return produto;
    }
    
    public Produto findById(Integer id){
    
        EntityManager em = new ConnectionFactory().getConnection();
        Produto produto = null;
        
        try {
            
            produto = em.find(Produto.class, id);
            
        } catch (Exception e) {
            System.err.println(e);
        }finally{
            em.close();
        }
        return produto;
   }
    
    public List<Produto> findAll(){
        
        EntityManager em = new ConnectionFactory().getConnection();
        List<Produto> produtos = null;
        
        try {
            
            produtos = em.createQuery("from Produto").getResultList();
            
        } catch (Exception e) {
            System.err.println(e);
        }finally{
            em.close();
        }
        return produtos;
        
    }
    
    public Produto delete(Produto id){
        
        EntityManager em = new ConnectionFactory().getConnection();
        Produto produto = null;
        
        try {
            
            produto = em.find(Produto.class, id);
            
            em.getTransaction().begin();
            em.remove(produto);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            System.err.println(e);
        }finally{
            em.close();
        }
        return produto;
         
    }

  
    
    
    
    
}
