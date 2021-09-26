package Checkpoint;

public abstract class Pessoa {
    private String nome;
    private String sexo;
    private String cpf;

    public Pessoa(String nome, String sexo, String cpf) {
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    abstract public void diaFrequentamento();

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
