package Checkpoint;
import java.util.List;


public class PedidoDeCompra {

    private Cliente cliente;
    private List<Carro> carros;

    public PedidoDeCompra(Cliente cliente, List<Carro> carros) {
        this.cliente = cliente;
        this.carros = carros;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    public void addCarro(Carro carro){
        this.carros.add(carro);
    }

    public String valorCarro() {
        double preco = 0;
        for (Carro carro:carros) {
            preco += carro.getPrecoCarro();

        }
        return "Valor da compra é de: " + preco + " Reais";
    }

    @Override
    public String toString() {
        return "PedidoDeCompra{" +
                "cliente=" + cliente +
                ", carros=" + carros +
                '}';
    }
}
