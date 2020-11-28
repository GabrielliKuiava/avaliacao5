package A5POO;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Carro extends Veiculos {
   
    public int nPortas;
    public Date horaEntradaCarro;
    public Date horaSaidaCarro;
    
    public Carro() {
        
    }
    
    public void chekin(){
        this.horaEntradaCarro = new Date();
        JOptionPane.showMessageDialog(null,  " Chekin do carro realizado!");   
    }
    
    public void checkout(){
        this.horaSaidaCarro = new Date();
        long periodoEstacionado = Math.abs(horaSaidaCarro.getTime() - horaEntradaCarro.getTime());
        JOptionPane.showMessageDialog(null,  " Chekout realizado!"); 
    }


}

