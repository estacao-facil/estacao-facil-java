package br.com.fiap.beans;

public class Conversa {

    private int id;
    private String titulo;
    private String dataCriacao;

    public Conversa() {
        super();
    }

    public Conversa(int id, String titulo, String dataCriacao) {
        super();

        this.id = id;
        this.titulo = titulo;
        this.dataCriacao = dataCriacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    @Override
    public String toString() {
        return "Conversa{" +
                "\nid=" + id +
                "\ntitulo='" + titulo + '\'' +
                "\ndataCriacao='" + dataCriacao + '\'' +
                '}';
    }

}
