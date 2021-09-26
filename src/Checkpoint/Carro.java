package Checkpoint;

public class Carro implements Comparavel{
    private String nome;
    private String marca;
    private String placa;
    private double precoCarro;

    public Carro(String nome, String marca, String placa, double precoCarro) {
        this.nome = nome;
        this.marca = marca;
        this.placa = placa;
        this.precoCarro = precoCarro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getPrecoCarro() {
        return precoCarro;
    }

    public void setPrecoCarro(double precoCarro) {
        this.precoCarro = precoCarro;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", precoCarro=" + precoCarro +
                '}';
    }

    @Override
    public void compareTo(Carro carro) {
        if (this.precoCarro == carro.precoCarro) {
            System.out.println("Os carros possuem o mesmo Valor");
        } else if (this.precoCarro > carro.precoCarro) {
            System.out.println("Esse carro é mais caro que o do amiguinho");
        } else {
            System.out.println("O carro do amiguinho é mais caro");
        }
    }
}
