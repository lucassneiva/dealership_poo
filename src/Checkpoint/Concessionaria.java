package Checkpoint;

import java.util.ArrayList;
import java.util.List;

public class Concessionaria {
    private String nome;
    private String endereco;
    private String telefone;
    private List<Vendedor> vendedores = new ArrayList<>();

    public Concessionaria(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(List<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    public void addVendedores(Vendedor vendedor) {
        this.vendedores.add(vendedor);
    }

    public void pagarSalario(){
        for (int index = 0; index < vendedores.size(); index++) {
            System.out.println("Pagamento ao vendedor: " + vendedores.get(index).getNome()
                    + " com o salário de R$" + vendedores.get(index).getSalario());
        }
    }
}
