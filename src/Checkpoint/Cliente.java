package Checkpoint;


public class Cliente extends Pessoa {
    private String contato;
    private boolean premium;
    private int dinheiro;

    public Cliente(String nome, String sexo, String cpf, String contato, boolean premium, int dinheiro) {
        super(nome, sexo, cpf);
        this.contato = contato;
        this.premium = premium;
        this.dinheiro = dinheiro;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public int getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }

    @Override
    public void diaFrequentamento() {
    }

    public void fazerPedido() {
        System.out.println("Eu quero");
    }

    public String consultaPremium(){
        if(premium == true) {
            return "Você possui desconto de 10%";
        } else {
            return "Você não possui desconto";
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "contato='" + contato + '\'' +
                ", premium=" + premium +
                '}';
    }
}




