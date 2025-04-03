package com.proyecto.modelo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ListaEnlazadaCircularDoble {

    private NodoMunicipalidad cabeza;
    private NodoMunicipalidad cola;

    public ListaEnlazadaCircularDoble() {
        cabeza = null;
        cola = null;
    }

    
    public NodoMunicipalidad getCabeza() {
        return cabeza;
    }
    public void insertar(Municipalidad nuevaMunicipalidad) {
        NodoMunicipalidad nuevoNodo = new NodoMunicipalidad(nuevaMunicipalidad);

        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
            cabeza.setSiguiente(cabeza);
            cabeza.setAnterior(cabeza);
        } else {
            cola.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(cola);
            nuevoNodo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevoNodo);
            cola = nuevoNodo;
        }
    }


    public void buscarMunicipalidades(String ano, String departamento, String provincia,
            String coberturaRadio, String medioTransporte) {
        NodoMunicipalidad actual = cabeza;
        do {
            Municipalidad muni = actual.getMunicipalidad();
            boolean match = true;

            if (ano != null && !ano.isEmpty() && !String.valueOf(muni.getyear()).equals(ano)) {
                match = false;
            }
            if (departamento != null && !departamento.isEmpty() && muni.getDepartamento().compareTo(departamento) != 0) {
                match = false;
            }
            if (provincia != null && !provincia.isEmpty() && muni.getProvincia().compareTo(provincia) != 0) {
                match = false;
            }
            if (coberturaRadio != null && !coberturaRadio.isEmpty() && !String.valueOf(muni.getCoberturaRadio()).equals(coberturaRadio)) {
                match = false;
            }
            if (medioTransporte != null && !medioTransporte.isEmpty() && muni.getMedioTransporte().compareTo(medioTransporte) != 0) {
                match = false;
            }

            if (match) {
                System.out.println(muni.getyear() + "\t"
                        + muni.getDepartamento() + "\t"
                        + muni.getProvincia() + "\t"
                        + muni.getCentroPoblado() + "\t"
                        + muni.getCoberturaRadio() + "\t"
                        + muni.getFrecuenciaRadio() + "\t"
                        + muni.getIngresosAnuales() + "\t"
                        + muni.getGastosAnuales() + "\t"
                        + muni.getMedioTransporte());
            }

            actual = actual.getSiguiente();
        } while (actual != cabeza);
    }

    public void exportarAArchivo(String nombreArchivo) {
        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter(nombreArchivo));

            writer.write("Año\tDepartamento\tProvincia\tCentro Poblado\tCobertura Radio\tFrecuencia Radio\tIngresos Anuales\tGastos Anuales\tMedio Transporte\n");

            NodoMunicipalidad actual = cabeza;
            do {
                Municipalidad muni = actual.getMunicipalidad();
                writer.write(muni.getyear() + "\t"
                        + muni.getDepartamento() + "\t"
                        + muni.getProvincia() + "\t"
                        + muni.getCentroPoblado() + "\t"
                        + muni.getCoberturaRadio() + "\t"
                        + muni.getFrecuenciaRadio() + "\t"
                        + muni.getIngresosAnuales() + "\t"
                        + muni.getGastosAnuales() + "\t"
                        + muni.getMedioTransporte() + "\n");

                actual = actual.getSiguiente();
            } while (actual != cabeza);

            System.out.println("Datos exportados exitosamente a " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al exportar a archivo: " + e.getMessage());
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo: " + e.getMessage());
            }
        }
    }
    
}
