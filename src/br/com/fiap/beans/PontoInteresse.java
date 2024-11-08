package br.com.fiap.beans;

public class PontoInteresse {

    private int id;
    private String nome;
    private String tipo;
    private String descricao;
    private Estacao estacao;
    private Localizacao localizacao;

    public PontoInteresse() {
        super();
    }

    public PontoInteresse(int id, String nome, String tipo, String descricao) {
        super();

        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.descricao = descricao;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Estacao getEstacao() {
        return estacao;
    }

    public void setEstacao(Estacao estacao) {
        this.estacao = estacao;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public String toString() {
        return "PontoInteresse{" +
                "\nid=" + id +
                "\nnome='" + nome + '\'' +
                "\ntipo='" + tipo + '\'' +
                "\ndescricao='" + descricao + '\'' +
                "\nestacao=" + estacao +
                "\nlocalizacao=" + localizacao +
                '}';
    }

}
