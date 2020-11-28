package A5POO;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Moto extends Veiculos {
   
    public int capacete;
    public Date horaEntradaMoto;
    public Date horaSaidaMoto;

    public Moto() {
    
    }
    
    public void chekin(){
        this.horaEntradaMoto = new Date(); 
     JOptionPane.showMessageDialog(null,  " Chekin da Moto do realizado!");
     
    }
    
    public void checkout(){
        this.horaSaidaMoto = new Date();
        long periodoEstacionado = Math.abs(horaSaidaMoto.getTime() - horaEntradaMoto.getTime());
        JOptionPane.showMessageDialog(null,  " Checkout realizado!");
        
   }   
 }
  
