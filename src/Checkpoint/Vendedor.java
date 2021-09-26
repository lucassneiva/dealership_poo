package Checkpoint;

public class Vendedor extends Pessoa {
    public String carteiraDeTrabalho;
    public double salario;

    public Vendedor(String nome, String sexo, String cpf, String carteiraDeTrabalho, double salario) {
        super(nome, sexo, cpf);
        this.carteiraDeTrabalho = carteiraDeTrabalho;
        this.salario = salario;
    }

    @Override
    public void diaFrequentamento() {

    }

    public String getCarteiraDeTrabalho() {
        return carteiraDeTrabalho;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void receberSalario() {
        System.out.println("Salário depositado na conta no valor de " + getSalario() + " Reais.");
    }

    public void atenderCliente() {
        System.out.println("Receber cliente na concessionária");

    }

    @Override
    public String toString() {
        return "Vendedor{ " +
                "salario= " + salario +
                '}';
    }
}
