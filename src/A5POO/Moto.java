package A5POO;

import javax.swing.JOptionPane;

public class Moto extends Veiculos {
   
    public int capacete;
    public float horaEntradaMoto;
    public float horaSaidaMoto;
    public String vagaMoto[] = new String[20];

    public Moto() {
    
    }
    
    public void checkin(){
        
        JOptionPane.showMessageDialog(null,  " Chekin da Moto do realizado!");
     
    }
    
    public void checkout(){
        
        
   }   
   
   public void validarVagaMoto(){
       this.vagaMoto = new String[20];
   }
 }
  
