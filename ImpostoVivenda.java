class ImpostoVivenda extends Imposto {
    public ImpostoVivenda(String nomeCliente, String cpfCliente, Endereco enderecoCliente, String telefoneCliente, String emailCliente, double valor, Object dataPagamento) {
        super(nomeCliente, cpfCliente, enderecoCliente, telefoneCliente, emailCliente, valor, null);
    } 
}