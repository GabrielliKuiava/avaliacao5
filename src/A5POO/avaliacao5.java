package A5POO;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class avaliacao5 {

    public static void main(String[] args) {
    
    for (int i = 0; i < 10; i++) {
        
   int op =Integer.parseInt(JOptionPane.showInputDialog(null, "\nOlá Seja Bem Vindo sou Alexy"
           + "\nSeu assistente Virtual de Parquimetro \n\nDigite \n\n 1- Cadastrar Moto\n 2- Cadastrar Carro"));
   
  switch(op){
            
     case 1:
        Cliente carro = new Cliente();
        carro.nome = JOptionPane.showInputDialog("Informe o nome: ");
        carro.cpf = JOptionPane.showInputDialog("Informe o CPF: ");
        carro.placa = JOptionPane.showInputDialog("Informe a placa do veiculo: ");
        carro.telefone = JOptionPane.showInputDialog("Informe o número de telefone: ");
        carro.cadastrar();
        carro.imprimir();
        
        switch(op){
        case 1:
            carro.email();
            
            break;
        case 2:
            break;
     }
        break;
        
     case 2:
        Cliente moto = new Cliente();
        moto.nome = JOptionPane.showInputDialog("Informe o nome: ");
        moto.cpf = JOptionPane.showInputDialog("Informe o CPF: ");
        moto.placa = JOptionPane.showInputDialog("Informe a placa do veiculo: ");
        moto.telefone= JOptionPane.showInputDialog("Informe o número de telefone: ");
        moto.cadastrar();
       

   
   }
        
  }
 }
}
        
        
   
   
