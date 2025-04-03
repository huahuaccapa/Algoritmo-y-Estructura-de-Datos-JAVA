package com.proyecto.modelo;

public class ArbolAVL {
    private NodoAVL raiz;

    public ArbolAVL() {
        raiz = null;
    }

    public NodoAVL getRaiz() {
        return raiz;
    }

    // Método para insertar una nueva municipalidad en el árbol
    public void insertar(Municipalidad municipalidad) {
        raiz = insertarRecursivo(raiz, municipalidad);
    }

    private NodoAVL insertarRecursivo(NodoAVL nodo, Municipalidad municipalidad) {
        if (nodo == null) {
            return new NodoAVL(municipalidad);
        }
        
        if (municipalidad.getProvincia().compareTo(nodo.getMunicipalidad().getProvincia()) < 0) {
            nodo.setIzquierdo(insertarRecursivo(nodo.getIzquierdo(), municipalidad));
        } else {
            nodo.setDerecho(insertarRecursivo(nodo.getDerecho(), municipalidad));
        }
        // Recalcular la altura del nodo
        nodo.setAltura(1 + Math.max(getAltura(nodo.getIzquierdo()), getAltura(nodo.getDerecho())));
        return balancear(nodo);  // Balanceamos el árbol
    }

   
    private int getAltura(NodoAVL nodo) {
        if (nodo == null) {
            return 0;
        }
        return nodo.getAltura();
    }

    private NodoAVL balancear(NodoAVL nodo) {
        // Lógica de balanceo del árbol AVL
        return nodo;
    }
}
