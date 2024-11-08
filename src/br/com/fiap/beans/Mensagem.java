package br.com.fiap.beans;

import java.time.LocalDateTime;

public class Mensagem {

    private int id;
    private String horario;
    private String conteudo;
    private String resposta;
    private Usuario usuario;
    private Conversa conversa;

    public Mensagem() {
        super();
    }

    public Mensagem(int id, String horario, String conteudo, String resposta) {
        super();

        this.id = id;
        this.horario = horario;
        this.conteudo = conteudo;
        this.resposta = resposta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Conversa getConversa() {
        return conversa;
    }

    public void setConversa(Conversa conversa) {
        this.conversa = conversa;
    }

    @Override
    public String toString() {
        return "Mensagem{" +
                "\nid=" + id +
                "\nhorario='" + horario + '\'' +
                "\nconteudo='" + conteudo + '\'' +
                "\nresposta='" + resposta + '\'' +
                "\nusuario=" + usuario +
                "\nconversa=" + conversa +
                '}';
    }

}
