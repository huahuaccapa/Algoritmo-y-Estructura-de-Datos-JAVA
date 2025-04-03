package com.proyecto.modelo;

public class NodoAVL {

    private Municipalidad municipalidad;
    private NodoAVL izquierdo;
    private NodoAVL derecho;
    private int altura;

    public NodoAVL(Municipalidad municipalidad) {
        this.municipalidad = municipalidad;
        this.izquierdo = null;
        this.derecho = null;
        this.altura = 1; // La altura inicial del nodo es 1
    }

    public Municipalidad getMunicipalidad() {
        return municipalidad;
    }

    public void setMunicipalidad(Municipalidad municipalidad) {
        this.municipalidad = municipalidad;
    }

    public NodoAVL getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(NodoAVL izquierdo) {
        this.izquierdo = izquierdo;
    }

    public NodoAVL getDerecho() {
        return derecho;
    }

    public void setDerecho(NodoAVL derecho) {
        this.derecho = derecho;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
