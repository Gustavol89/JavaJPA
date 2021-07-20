/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gustavo.teste;

import br.com.gustavo.model.DAO.ProdutoDAO;
import br.com.gustavo.model.bean.Categoria;
import br.com.gustavo.model.bean.Produto;

/**
 *
 * @author GUSTAVO
 */
public class ProdutoTest {
    
    public static void main(String[] args) {
        
        
        ProdutoDAO dao = new ProdutoDAO();
        
        
        for (Produto produto : dao.findAll()){
        System.out.println("Descrição: "+produto.getDescricao());
        System.out.println("QTD: "+produto.getQtd());
        System.out.println("Valor: "+produto.getValor());
        System.out.println("Categoria: "+produto.getCategoria().getDescricao());
        
         }
         
    }
    
 
}
