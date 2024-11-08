package br.com.fiap.beans;

public class QRCode {

    private int id;
    private String codigo;
    private String descricao;
    private Estacao estacao;
    private Localizacao localizacao;

    public QRCode() {
        super();
    }

    public QRCode(int id, String codigo, String descricao) {
        super();

        this.id = id;
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
        return "QRCode{" +
                "\nid=" + id +
                "\ncodigo='" + codigo + '\'' +
                "\ndescricao='" + descricao + '\'' +
                "\nestacao=" + estacao +
                "\nlocalizacao=" + localizacao +
                '}';
    }

}
