package Checkpoint;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        //Criando Vendedor
        Vendedor vendedor = new Vendedor("Anakin", "M", "123123", "121123", 1200);
        Vendedor vendedor2 = new Vendedor("Anitta", "F", "321321", "212321", 1500);

        //Criando Cliente
        Cliente cliente = new Cliente("Yana","F", "23242", "70707070", true,200000);
        Cliente cliente2 = new Cliente("Vitoria","F", "32424", "40028922", false,200000);

        //Criando Concessionaria
        Concessionaria DHCarros = new Concessionaria("DHCarros","Rua dos bobos", "666");

        //Adicionando Funcionarios a Concessionaria
        DHCarros.addVendedores(vendedor);
        DHCarros.addVendedores(vendedor2);

        //Pagamento da Dh aos Funcionarios
        DHCarros.pagarSalario();

        //Ação vendedor
        vendedor.atenderCliente(); //atendimento
        vendedor.receberSalario(); //recebendo salario

        //Verificando cliente premium
        System.out.println(cliente.isPremium());
        System.out.println(cliente2.isPremium());

        //Criando carro
        Carro carro = new Carro("Fox", "VolksWagen","ABSHU12", 20000);
        Carro carro1 = new Carro("CrossFox", "VolksWagen","AHUYU12", 40000);
        Carro carro2 = new Carro("Civic", "Honda","AHOY123", 100000);
        Carro carro3 = new Carro("Pajero", "Mitsubishi","UAITREM123", 200000);

        //Lista Carros yana
        List<Carro> carros = new ArrayList<>();
        //adicionando carro ao array de lista
        carros.add(carro);
        carros.add(carro1);
        carros.add(carro2);

        //Lista Vitoria
        List<Carro> honda = new ArrayList<>();
        honda.add(carro3);

        //pedido de compras da Yana
        PedidoDeCompra yana = new PedidoDeCompra(cliente,carros);
        System.out.println(yana.valorCarro());

        //pedido de compra vitoria
        PedidoDeCompra vit = new PedidoDeCompra(cliente,honda);
        System.out.println(vit.valorCarro());




    }
}
