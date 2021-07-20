/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import br.com.gustavo.view.TelaPrincipal;

/**
 *
 * @author GUSTAVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CHAMANDO A TELA PRINCIPAL ONDE CONTEN O CRUD
        
        TelaPrincipal tela = new TelaPrincipal();
        tela.setTitle("Mercadinho JPA");
        tela.setVisible(true);
        
    }
    
}
