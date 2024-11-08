package br.com.fiap.beans;

public class Rota {

    private int id;
    private Estacao estacaoOrigem;
    private Estacao estacaoDestino;
    private double distancia;
    private double vel_media;

    public Rota() {
        super();
    }

    public Rota(int id, double distancia, double vel_media) {
        this.id = id;
        this.distancia = distancia;
        this.vel_media = vel_media;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Estacao getEstacaoOrigem() {
        return estacaoOrigem;
    }

    public void setEstacaoOrigem(Estacao estacaoOrigem) {
        this.estacaoOrigem = estacaoOrigem;
    }

    public Estacao getEstacaoDestino() {
        return estacaoDestino;
    }

    public void setEstacaoDestino(Estacao estacaoDestino) {
        this.estacaoDestino = estacaoDestino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getVel_media() {
        return vel_media;
    }

    public void setVel_media(double vel_media) {
        this.vel_media = vel_media;
    }

    @Override
    public String toString() {
        return "Rota{" +
                "\nid=" + id +
                "\nestacaoOrigem=" + estacaoOrigem +
                "\nestacaoDestino=" + estacaoDestino +
                "\ndistancia=" + distancia +
                "\nvel_media=" + vel_media +
                '}';
    }

    // Calcula o tempo de viagem estimado da rota
    public double calcularTempoViagem() {
        return distancia / vel_media;
    }

}
