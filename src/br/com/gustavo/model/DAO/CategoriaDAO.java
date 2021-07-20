/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gustavo.model.DAO;

import br.com.gustavo.connection.ConnectionFactory;
import br.com.gustavo.model.bean.Categoria;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author GUSTAVO
 */
public class CategoriaDAO {
    
    
    //METODO PARA SALVAR DADOS NO BANCO EM.PERSIST (JDBC = INSERT)
    public Categoria save(Categoria categoria){
        
         EntityManager em = new ConnectionFactory().getConnection();
         
         try {
             
        em.getTransaction().begin();
        em.persist(categoria);
        em.getTransaction().commit();
            
        } catch (Exception e) {
             em.getTransaction().rollback();
             System.err.println(e);
        }finally{
            em.close();
         }
         return categoria;
       }
    
       //METODO PARA ATUALIZAR NO BANCO EM.MERGE (JDBC = UPDATE)
        
        public Categoria update(Categoria categoria){
            
            EntityManager em = new ConnectionFactory().getConnection();
            
            try {
                em.getTransaction().begin();
                
                if(categoria.getId() == null){
                    em.persist(categoria);
                }else{
                    em.merge(categoria);
                }
                em.getTransaction().commit();
            } catch (Exception e) {
                em.getTransaction().rollback();
                System.err.println(e);
            }finally{
                em.close();
            }
            
            return categoria;
        }
        
        //METODO PARA BUSCAR PELO ID NO BANCO DE DADOS (JDBC = SELECT * FROM TABELA WHERE ID....)
        //NESSE METODO BUSCAMOS UM ID ESPECIFO DA TABELA DE BANCO DE DADOS
        public Categoria findById(Integer id){
            
            EntityManager em = new ConnectionFactory().getConnection();
            Categoria categoria = null;
            
            try {
                categoria = em.find(Categoria.class, id);
            } catch (Exception e) {
                System.err.println(e);
            }finally{
                em.close();
            }
            
            return categoria;
        }
        
        //METODO PARA BUSCAR NO BANCO E FAZER UMA LISTA DOS DADOS QUE TEM NO BANCO DE DADOS
        //(JDBC = SELECT * FROM TABELA NOME)
        
        public List<Categoria> findAll(){
            EntityManager em = new ConnectionFactory().getConnection();
            List<Categoria> categorias = null;
            
            try {
                
           categorias = em.createQuery("from Categoria c").getResultList();
                
            } catch (Exception e) {
                System.err.println(e);
            }finally{
                em.close();
            }
            
            return categorias;
            
        }
        
        //METODO PARA DELETAR UMA COLUNA DA TABELA DO BANCO DE DADOS PASSANDO UM ID COMO PARAMETRO
        //(JDBC = DELETE FROM NOME DA TABELA WHERE CONDIÇÃO....)
        public Categoria delete(Integer id){
            EntityManager em = new ConnectionFactory().getConnection();
            Categoria categoria = null;
            
            try {
                
                categoria = em.find(Categoria.class, id);
                
                em.getTransaction().begin();
                em.remove(categoria);
                em.getTransaction().commit();
                
            } catch (Exception e) {
                System.err.println(e);
                em.getTransaction().rollback();
                          
            }finally{
                em.close();
            }
            
            return categoria;
        }
    }  
