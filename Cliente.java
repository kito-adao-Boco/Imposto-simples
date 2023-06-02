class Cliente {
    private int id;
    private String nome;
    private Endereco endereco;
    private Contacto contacto;

    public Cliente(int id,String nome, Endereco endereco, Contacto contacto) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.contacto = contacto;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }
}
