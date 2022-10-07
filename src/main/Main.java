
package main;

import controller.Conexao_DB;
import view.Splash_SLE_GUI;

public class Main {

    public static void main(String[] args) {
        
        controller.Conexao_DB.carregaDriver();
        new Splash_SLE_GUI().setVisible(true);
        
    }
    
}
