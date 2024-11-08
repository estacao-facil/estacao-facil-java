package br.com.fiap.beans;

public class Usuario {

    private int id;
    private String nome;
    private String email;
    private String dataCriacao;
    private String dataAlteracao;

    public Usuario() {
        super();
    }

    public Usuario(int id, String nome, String email, String dataCriacao, String dataAlteracao) {
        super();

        this.id = id;
        this.nome = nome;
        this.email = email;
        this.dataCriacao = dataCriacao;
        this.dataAlteracao = dataAlteracao;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(String dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "\nid=" + id +
                "\nnome='" + nome + '\'' +
                "\nemail='" + email + '\'' +
                "\ndataCriacao='" + dataCriacao + '\'' +
                "\ndataAlteracao='" + dataAlteracao + '\'' +
                '}';
    }

}
