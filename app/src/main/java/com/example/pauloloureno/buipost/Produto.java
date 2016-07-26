package com.example.pauloloureno.buipost;

/**
 * Created by Paf on 20/07/2016.
 */
public class Produto {
    private String nome,supermercado;
    private double longitude,latitude;
    private float precoAntigo,precoAtual;
    private String linkImagem;

    public Produto(String nome, String supermercado,double longitude,double latitude,float precoAntigo, float precoAtual, String linkImagem) {
        this.nome = nome;
        this.supermercado = supermercado;
        this.longitude = longitude;
        this.latitude = latitude;
        this.precoAntigo = precoAntigo;
        this.precoAtual = precoAtual;
        this.linkImagem= linkImagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSupermercado() {
        return supermercado;
    }

    public void setSupermercado(String supermercado) {
        this.supermercado = supermercado;
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

    public float getPrecoAntigo() {
        return precoAntigo;
    }

    public void setPrecoAntigo(float precoAntigo) {
        this.precoAntigo = precoAntigo;
    }

    public float getPrecoAtual() {
        return precoAtual;
    }

    public void setPrecoAtual(float precoAtual) {
        this.precoAtual = precoAtual;
    }

    public String getLinkImagem() {
        return linkImagem;
    }


}
