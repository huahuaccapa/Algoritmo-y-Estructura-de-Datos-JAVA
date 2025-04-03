package com.proyecto.modelo;

public class Municipalidad {

    private int year;
    private String departamento;
    private String provincia;
    private String centroPoblado;
    private double coberturaRadio;
    private String frecuenciaRadio;
    private double ingresosAnuales;
    private double gastosAnuales;
    private String viaAcceso;
    private String medioTransporte;

    public Municipalidad(int year, String departamento, String provincia, String centroPoblado,
            double coberturaRadio, String frecuenciaRadio, double ingresosAnuales,
            double gastosAnuales, String viaAcceso, String medioTransporte) {
        this.year = year;
        this.departamento = departamento;
        this.provincia = provincia;
        this.centroPoblado = centroPoblado;
        this.coberturaRadio = coberturaRadio;
        this.frecuenciaRadio = frecuenciaRadio;
        this.ingresosAnuales = ingresosAnuales;
        this.gastosAnuales = gastosAnuales;
        this.viaAcceso = viaAcceso;
        this.medioTransporte = medioTransporte;
    }

    public Municipalidad(int ano, String departamento, String provincia, String centroPoblado,
            double coberturaRadio, String frecuenciaRadio,
            double ingresosAnuales, double gastosAnuales, String medioTransporte) {
        this.year = ano;
        this.departamento = departamento;
        this.provincia = provincia;
        this.centroPoblado = centroPoblado;
        this.coberturaRadio = coberturaRadio;
        this.frecuenciaRadio = frecuenciaRadio;
        this.ingresosAnuales = ingresosAnuales;
        this.gastosAnuales = gastosAnuales;
        this.viaAcceso = "";
        this.medioTransporte = medioTransporte;
    }

    public int getyear() {
        return year;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getCentroPoblado() {
        return centroPoblado;
    }

    public double getCoberturaRadio() {
        return coberturaRadio;
    }

    public String getFrecuenciaRadio() {
        return frecuenciaRadio;
    }

    public double getIngresosAnuales() {
        return ingresosAnuales;
    }

    public double getGastosAnuales() {
        return gastosAnuales;
    }

    public String getViaAcceso() {
        return viaAcceso;
    }

    public String getMedioTransporte() {
        return medioTransporte;
    }
}
