package A5POO;

import javax.swing.JOptionPane;

public class Cliente {
    
    public String nome;
    public String cpf;
    public String placa;
    public String telefone;
    public String email;

    public Cliente() {
   
    }

    public Cliente(String nome, String cpf, String placa, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.placa = placa;
        this.telefone = telefone;
        
    }

    
    
     public void cadastrar(){
        
    JOptionPane.showMessageDialog(null,  " Cliente " + this.nome + " cadastrado!");
     
     }
     
     public void imprimir(){
      
         JOptionPane.showMessageDialog(null, "Nome: "+this.nome + "\nCPF: " +
                 this.cpf + "\nPlaca: " + this.placa + "\nTelefone: " + this.telefone);
         JOptionPane.showInputDialog(null, "\n\nGostaria de receber o comprovante por e-mail?"
         +"\n\nDigite 1 para 'Sim' \nDigite 2 para 'Nao' ");
     }   
   
    public void email(){
        JOptionPane.showInputDialog("Digite seu email: " + this.email);
        JOptionPane.showMessageDialog(null,"Comprovante enviado para \nemail: " +this.email);
    }
}
