package A5POO;

public class Estacionamento {
    
    public String vagaCarro[] = new String[20];
    public String vagaMoto[] = new String[20];

    public Estacionamento() {
   
    }

    public String[] getVagaCarro() {
        return vagaCarro;
    }

    public void setVagaCarro(String[] vagaCarro) {
        this.vagaCarro = vagaCarro;
    }

    public String[] getVagaMoto() {
        return vagaMoto;
    }

    public void setVagaMoto(String[] vagaMoto) {
        this.vagaMoto = vagaMoto;
    }
    
    
    
}
