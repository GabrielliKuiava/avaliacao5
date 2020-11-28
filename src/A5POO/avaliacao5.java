package A5POO;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class avaliacao5 {

    public static void main(String[] args) {
    
    for (int i = 0; i < 10; i++) {
        
   int op =Integer.parseInt(JOptionPane.showInputDialog(null, "\n Escolha a opção desejada:\n 1- Cadastrar Cliente\n 2- Checkin Moto \n 3- Checkin Carro \n 4- Checkout Moto\n 5- Checkout Carro"));
   
  switch(op){
            
     case 1:
        Cliente cli = new Cliente();
        cli.nome = JOptionPane.showInputDialog("Informe o nome: ");
        cli.cpf = JOptionPane.showInputDialog("Informe o CPF:");
        cli.dataNascimento= JOptionPane.showInputDialog("Informe a data de nascimento:");
        cli.telefone= JOptionPane.showInputDialog("Informe o número de telefone:");
        cli.cadastrar();
        break;
        
     case 2:
        Moto mot = new Moto();
        mot.placa = JOptionPane.showInputDialog("Informe a Placa: ");
        mot.modelo = JOptionPane.showInputDialog("Informe o modelo: ");
        mot.cor = JOptionPane.showInputDialog("Informe a cor: ");
        mot.capacete = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos capacetes possui?"));
        mot.chekin();
        //falta validar vaga
        break;
     case 3:
         Carro car = new Carro();
         car.placa = JOptionPane.showInputDialog("Informe a placa: ");
         car.modelo= JOptionPane.showInputDialog("Informe o modelo:");
         car.cor= JOptionPane.showInputDialog("Informe a cor:");
         car.nPortas = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas portas possui?"));
         car.chekin();
          //falta validar vaga
         
     case 4:
         
     case 5:
     
   
   }
        
  }
 }
}
        
        
   
   
