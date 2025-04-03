package com.proyecto.modelo;

public class NodoABB {

    private Municipalidad municipalidad;  // Información de la municipalidad
    private NodoABB izquierda;            // Nodo hijo izquierdo
    private NodoABB derecha;              // Nodo hijo derecho

    // Constructor del NodoABB
    public NodoABB(Municipalidad municipalidad) {
        this.municipalidad = municipalidad;
        this.izquierda = null;
        this.derecha = null;
    }

    // Getters y Setters
    public Municipalidad getMunicipalidad() {
        return municipalidad;
    }

    public void setMunicipalidad(Municipalidad municipalidad) {
        this.municipalidad = municipalidad;
    }

    public NodoABB getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(NodoABB izquierda) {
        this.izquierda = izquierda;
    }

    public NodoABB getDerecha() {
        return derecha;
    }

    public void setDerecha(NodoABB derecha) {
        this.derecha = derecha;
    }
}
