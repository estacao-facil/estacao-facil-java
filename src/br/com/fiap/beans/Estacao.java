package br.com.fiap.beans;

public class Estacao {

    private int id;
    private String nome;
    private String horaAbertura;
    private String horaFechamento;
    private Linha linha;

    public Estacao() {
        super();
    }

    public Estacao(int id, String nome, String horaAbertura, String horaFechamento) {
        super();

        this.id = id;
        this.nome = nome;
        this.horaAbertura = horaAbertura;
        this.horaFechamento = horaFechamento;
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

    public String getHoraAbertura() {
        return horaAbertura;
    }

    public void setHoraAbertura(String horaAbertura) {
        this.horaAbertura = horaAbertura;
    }

    public String getHoraFechamento() {
        return horaFechamento;
    }

    public void setHoraFechamento(String horaFechamento) {
        this.horaFechamento = horaFechamento;
    }

    public Linha getLinha() {
        return linha;
    }

    public void setLinha(Linha linha) {
        this.linha = linha;
    }

    @Override
    public String toString() {
        return "Estacao{" +
                "\nid=" + id +
                "\nnome='" + nome + '\'' +
                "\nhoraAbertura='" + horaAbertura + '\'' +
                "\nhoraFechamento='" + horaFechamento + '\'' +
                "\nlinha=" + linha +
                '}';
    }

}
