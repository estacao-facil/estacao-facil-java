package br.com.fiap.beans;

public class Localizacao {

    private int id;
    private double latitude;
    private double longitude;

    public Localizacao() {
        super();
    }

    public Localizacao(int id, double latitude, double longitude) {
        super();

        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Localizacao{" +
                "\nid=" + id +
                "\nlatitude=" + latitude +
                "\nlongitude=" + longitude +
                '}';
    }

}

