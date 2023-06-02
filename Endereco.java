class Endereco {
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String pais;

    Endereco(String rua, String numero2, String bairro, String cidade, String pais) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;

        this.pais = pais;
    }
    
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
  

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}