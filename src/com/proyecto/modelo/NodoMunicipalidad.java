package com.proyecto.modelo;

public class NodoMunicipalidad {

    private Municipalidad municipalidad;
    private NodoMunicipalidad siguiente;
    private NodoMunicipalidad anterior;

    public NodoMunicipalidad(Municipalidad municipalidad) {
        this.municipalidad = municipalidad;
        this.siguiente = null;
        this.anterior = null; 
    }

    public Municipalidad getMunicipalidad() {
        return municipalidad;
    }

    public void setMunicipalidad(Municipalidad municipalidad) {
        this.municipalidad = municipalidad;
    }

    public NodoMunicipalidad getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoMunicipalidad siguiente) {
        this.siguiente = siguiente;
    }

    public NodoMunicipalidad getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoMunicipalidad anterior) {
        this.anterior = anterior;
    }
}
