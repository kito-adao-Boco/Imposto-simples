public class Imposto {

    private int id;
    private Cliente cliente;
    private double valor;
    private String dataPagamento;

   
    public Imposto(int id, Cliente cliente, double valor, String dataPagamento) {
        this.id = id;
        this.cliente = cliente;
        this.valor = valor;
        this.dataPagamento = dataPagamento;
    }

    public Imposto(String nomeCliente, String cpfCliente, Endereco enderecoCliente, String telefoneCliente,
            String emailCliente, double valor2, String dataPagamento) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
   }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}