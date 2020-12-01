package A5POO;


import java.util.Date;
import javax.swing.JOptionPane;

public class Carro extends Veiculos {
   
    public int nPortas;
    public double horaEntradaCarro;
    public double horaSaidaCarro;
    public String vagaCarro[] = new String[20];
    
    public Carro() {
        
    }
    
    public void checkin(){
       
        
        JOptionPane.showMessageDialog(null,  " Chekin do carro realizado!");   
    }
                                                                              
    public void checkout(){
//        this.horaSaidaCarro = new Date();
//        long periodoEstacionado = Math.abs(horaSaidaCarro.getTime() - horaEntradaCarro.getTime());
//        JOptionPane.showMessageDialog(null,  " Chekout realizado!"); 
    }


}

