package A5POO;

import javax.swing.JOptionPane;

public class Carro extends Veiculos {
   
    public int nPortas;
    
    public Carro() {
        
    }
    
    public void chekin(){
      JOptionPane.showMessageDialog(null,  " Chekin do carro realizado!");   
    }
    
    public void checkout(){
        JOptionPane.showMessageDialog(null,  " Chekout realizado!"); 
    }


}

