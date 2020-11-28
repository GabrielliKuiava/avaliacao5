package A5POO;

import javax.swing.JOptionPane;

public class Cliente {
    
    public String nome;
    public String cpf;
    public String dataNascimento;
    public String telefone;

    public Cliente() {
   
    }

    public Cliente(String nome, String cpf, String dataNascimento, String telefone) {
       
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        
    }
    
     public void cadastrar(){
        
    JOptionPane.showMessageDialog(null,  " Cliente " + this.nome + " cadastrado!");
        
   }
    
}
