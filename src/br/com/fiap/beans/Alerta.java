package br.com.fiap.beans;

public class Alerta {

    private int id;
    private String titulo;
    private String descricao;
    private String dataInicio;
    private String dataFim;
    private int gravidade;
    private Estacao estacao;

    public Alerta() {
        super();
    }

    public Alerta(int id, String titulo, String descricao, String dataInicio, String dataFim, int gravidade) {
        super();

        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.gravidade = gravidade;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public int getGravidade() {
        return gravidade;
    }

    public void setGravidade(int gravidade) {
        this.gravidade = gravidade;
    }

    public Estacao getEstacao() {
        return estacao;
    }

    public void setEstacao(Estacao estacao) {
        this.estacao = estacao;
    }

    @Override
    public String toString() {
        return "Alerta{" +
                "\nid=" + id +
                "\ntitulo='" + titulo + '\'' +
                "\ndescricao='" + descricao + '\'' +
                "\ndataInicio='" + dataInicio + '\'' +
                "\ndataFim='" + dataFim + '\'' +
                "\ngravidade=" + gravidade +
                "\nestacao=" + estacao +
                '}';
    }

    // Exibe o alerta de maneira mais legível para o usuário
    public String exibirAlerta() {
        return titulo + " (" + estacao.getNome() + ")" + "\n" + descricao;
    }

}
