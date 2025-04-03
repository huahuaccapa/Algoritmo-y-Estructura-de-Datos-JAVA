package com.proyecto.modelo;

public class ArbolABB {

    private NodoABB raiz;

    public ArbolABB() {
        raiz = null;
    }

    public NodoABB getRaiz() {
        return raiz;
    }

    // Método para insertar una nueva municipalidad en el árbol
    public void insertar(Municipalidad municipalidad) {
        raiz = insertarRecursivo(raiz, municipalidad);
    }

    // Inserción recursiva
    private NodoABB insertarRecursivo(NodoABB nodo, Municipalidad municipalidad) {
        if (nodo == null) {
            return new NodoABB(municipalidad);  
        }
        if (municipalidad.getProvincia().compareTo(nodo.getMunicipalidad().getProvincia()) < 0) {
            nodo.setIzquierda(insertarRecursivo(nodo.getIzquierda(), municipalidad)); // Insertamos en la izquierda
        } else if (municipalidad.getProvincia().compareTo(nodo.getMunicipalidad().getProvincia()) > 0) {
            nodo.setDerecha(insertarRecursivo(nodo.getDerecha(), municipalidad)); // Insertamos en la derecha
        }
        return nodo;
    }

    // Método para buscar por provincia
    public NodoABB buscarPorProvincia(String provincia) {
        return buscarRecursivoPorProvincia(raiz, provincia);
    }

    private NodoABB buscarRecursivoPorProvincia(NodoABB nodo, String provincia) {
        if (nodo == null) {
            return null; 
        }

        if (nodo.getMunicipalidad().getProvincia().equalsIgnoreCase(provincia)) {
            return nodo;  
        } else if (provincia.compareTo(nodo.getMunicipalidad().getProvincia()) < 0) {
            return buscarRecursivoPorProvincia(nodo.getIzquierda(), provincia);  // Buscamos en la izquierda
        } else {
            return buscarRecursivoPorProvincia(nodo.getDerecha(), provincia);  // Buscamos en la derecha
        }
    }

    // Método para buscar por departamento
    public NodoABB buscarPorDepartamento(String departamento) {
        return buscarRecursivoPorDepartamento(raiz, departamento);
    }

    private NodoABB buscarRecursivoPorDepartamento(NodoABB nodo, String departamento) {
        if (nodo == null) {
            return null;
        }

        if (nodo.getMunicipalidad().getDepartamento().equalsIgnoreCase(departamento)) {
            return nodo;  
        } else if (departamento.compareTo(nodo.getMunicipalidad().getDepartamento()) < 0) {
            return buscarRecursivoPorDepartamento(nodo.getIzquierda(), departamento);
        } else {
            return buscarRecursivoPorDepartamento(nodo.getDerecha(), departamento);
        }
    }

    // Método para buscar por medio de transporte
    public NodoABB buscarPorMedioTransporte(String medioTransporte) {
        return buscarRecursivoPorMedioTransporte(raiz, medioTransporte);
    }

    private NodoABB buscarRecursivoPorMedioTransporte(NodoABB nodo, String medioTransporte) {
        if (nodo == null) {
            return null;
        }

        if (nodo.getMunicipalidad().getMedioTransporte().equalsIgnoreCase(medioTransporte)) {
            return nodo;  
        } else if (medioTransporte.compareTo(nodo.getMunicipalidad().getMedioTransporte()) < 0) {
            return buscarRecursivoPorMedioTransporte(nodo.getIzquierda(), medioTransporte);
        } else {
            return buscarRecursivoPorMedioTransporte(nodo.getDerecha(), medioTransporte);
        }
    }

    public void imprimirEnOrden() {
        imprimirEnOrdenRecursivo(raiz);
    }

    private void imprimirEnOrdenRecursivo(NodoABB nodo) {
        if (nodo != null) {
            imprimirEnOrdenRecursivo(nodo.getIzquierda());
            System.out.println(nodo.getMunicipalidad());
            imprimirEnOrdenRecursivo(nodo.getDerecha());
        }
    }
}
