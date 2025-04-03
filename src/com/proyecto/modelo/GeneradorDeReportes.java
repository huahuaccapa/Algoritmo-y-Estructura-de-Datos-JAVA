package com.proyecto.modelo;

public class GeneradorDeReportes {

    // Generar reporte filtrado por varios criterios
    public static String generarReporteFiltrado(NodoABB raiz, String provincia, String departamento, String medioTransporte) {
        StringBuilder reporte = new StringBuilder();

        // Agregar encabezado
        reporte.append("Año;Departamento;Provincia;Centro Poblado;Cobertura Radio;Frecuencia Radio;Ingresos Anuales;Gastos Anuales;Vía de Acceso;Medio de Transporte\n");

        // Recorrer el árbol y generar el reporte
        recorrerYGenerarReporteFiltrado(raiz, reporte, provincia, departamento, medioTransporte);

        return reporte.toString();
    }

    private static void recorrerYGenerarReporteFiltrado(NodoABB nodo, StringBuilder reporte, String provincia, String departamento, String medioTransporte) {
        if (nodo != null) {
            Municipalidad muni = nodo.getMunicipalidad();
            boolean agregar = true;

            // Normalizar y aplicar filtros
            if (provincia != null && !provincia.isEmpty() && !muni.getProvincia().trim().equalsIgnoreCase(provincia.trim())) {
                agregar = false;
            }
            if (departamento != null && !departamento.isEmpty() && !muni.getDepartamento().trim().equalsIgnoreCase(departamento.trim())) {
                agregar = false;
            }
            if (medioTransporte != null && !medioTransporte.isEmpty() && !muni.getMedioTransporte().trim().equalsIgnoreCase(medioTransporte.trim())) {
                agregar = false;
            }

            // Si la municipalidad cumple con los filtros, agregarla al reporte
            if (agregar) {
                reporte.append(muni.getyear()).append(";")
                        .append(muni.getDepartamento()).append(";")
                        .append(muni.getProvincia()).append(";")
                        .append(muni.getCentroPoblado()).append(";")
                        .append(muni.getCoberturaRadio()).append(";")
                        .append(muni.getFrecuenciaRadio()).append(";")
                        .append(muni.getIngresosAnuales()).append(";")
                        .append(muni.getGastosAnuales()).append(";")
                        .append(muni.getViaAcceso()).append(";")
                        .append(muni.getMedioTransporte()).append("\n");
            }

            // Recursión en los subárboles izquierdo y derecho
            recorrerYGenerarReporteFiltrado(nodo.getIzquierda(), reporte, provincia, departamento, medioTransporte);
            recorrerYGenerarReporteFiltrado(nodo.getDerecha(), reporte, provincia, departamento, medioTransporte);
        }
    }

    // Reporte por Provincia
    public static String generarReportePorProvincia(NodoABB nodo, String provincia) {
        StringBuilder reporte = new StringBuilder();
        reporte.append("Año;Departamento;Provincia;Centro Poblado;Cobertura Radio;Frecuencia Radio;Ingresos Anuales;Gastos Anuales;Vía de Acceso;Medio de Transporte\n");

        recorrerYGenerarReportePorProvincia(nodo, provincia, reporte);

        return reporte.toString();
    }

    private static void recorrerYGenerarReportePorProvincia(NodoABB nodo, String provincia, StringBuilder reporte) {
        if (nodo != null) {
            Municipalidad muni = nodo.getMunicipalidad();

            // Filtrar por provincia
            if (muni.getProvincia().equalsIgnoreCase(provincia)) {
                reporte.append(muni.getyear()).append(";")
                        .append(muni.getDepartamento()).append(";")
                        .append(muni.getProvincia()).append(";")
                        .append(muni.getCentroPoblado()).append(";")
                        .append(muni.getCoberturaRadio()).append(";")
                        .append(muni.getFrecuenciaRadio()).append(";")
                        .append(muni.getIngresosAnuales()).append(";")
                        .append(muni.getGastosAnuales()).append(";")
                        .append(muni.getViaAcceso()).append(";")
                        .append(muni.getMedioTransporte()).append("\n");
            }

            // Recursión en los subárboles izquierdo y derecho
            recorrerYGenerarReportePorProvincia(nodo.getIzquierda(), provincia, reporte);
            recorrerYGenerarReportePorProvincia(nodo.getDerecha(), provincia, reporte);
        }
    }

    // Reporte por Departamento
    public static String generarReportePorDepartamento(NodoABB nodo, String departamento) {
        StringBuilder reporte = new StringBuilder();
        reporte.append("Año;Departamento;Provincia;Centro Poblado;Cobertura Radio;Frecuencia Radio;Ingresos Anuales;Gastos Anuales;Vía de Acceso;Medio de Transporte\n");

        recorrerYGenerarReportePorDepartamento(nodo, departamento, reporte);

        return reporte.toString();
    }

    private static void recorrerYGenerarReportePorDepartamento(NodoABB nodo, String departamento, StringBuilder reporte) {
        if (nodo != null) {
            Municipalidad muni = nodo.getMunicipalidad();

            // Filtrar por departamento
            if (muni.getDepartamento().equalsIgnoreCase(departamento)) {
                reporte.append(muni.getyear()).append(";")
                        .append(muni.getDepartamento()).append(";")
                        .append(muni.getProvincia()).append(";")
                        .append(muni.getCentroPoblado()).append(";")
                        .append(muni.getCoberturaRadio()).append(";")
                        .append(muni.getFrecuenciaRadio()).append(";")
                        .append(muni.getIngresosAnuales()).append(";")
                        .append(muni.getGastosAnuales()).append(";")
                        .append(muni.getViaAcceso()).append(";")
                        .append(muni.getMedioTransporte()).append("\n");
            }

            // Recursión en los subárboles izquierdo y derecho
            recorrerYGenerarReportePorDepartamento(nodo.getIzquierda(), departamento, reporte);
            recorrerYGenerarReportePorDepartamento(nodo.getDerecha(), departamento, reporte);
        }
    }

    // Reporte por Medio de Transporte
    public static String generarReportePorMedioTransporte(NodoABB nodo, String medioTransporte) {
        StringBuilder reporte = new StringBuilder();
        reporte.append("Año;Departamento;Provincia;Centro Poblado;Cobertura Radio;Frecuencia Radio;Ingresos Anuales;Gastos Anuales;Vía de Acceso;Medio de Transporte\n");

        recorrerYGenerarReportePorMedioTransporte(nodo, medioTransporte, reporte);

        return reporte.toString();
    }

    private static void recorrerYGenerarReportePorMedioTransporte(NodoABB nodo, String medioTransporte, StringBuilder reporte) {
        if (nodo != null) {
            Municipalidad muni = nodo.getMunicipalidad();

            // Filtrar por medio de transporte
            if (muni.getMedioTransporte().equalsIgnoreCase(medioTransporte)) {
                reporte.append(muni.getyear()).append(";")
                        .append(muni.getDepartamento()).append(";")
                        .append(muni.getProvincia()).append(";")
                        .append(muni.getCentroPoblado()).append(";")
                        .append(muni.getCoberturaRadio()).append(";")
                        .append(muni.getFrecuenciaRadio()).append(";")
                        .append(muni.getIngresosAnuales()).append(";")
                        .append(muni.getGastosAnuales()).append(";")
                        .append(muni.getViaAcceso()).append(";")
                        .append(muni.getMedioTransporte()).append("\n");
            }

            // Recursión en los subárboles izquierdo y derecho
            recorrerYGenerarReportePorMedioTransporte(nodo.getIzquierda(), medioTransporte, reporte);
            recorrerYGenerarReportePorMedioTransporte(nodo.getDerecha(), medioTransporte, reporte);
        }
    }

    // Reporte por Utilidad
    public static String generarReportePorUtilidad(NodoABB nodo) {
        StringBuilder reporte = new StringBuilder();
        reporte.append("Centro Poblado;Provincia;Departamento;Ingresos Anuales;Gastos Anuales;Utilidad\n");

        recorrerYGenerarReportePorUtilidad(nodo, reporte);

        return reporte.toString();
    }

    private static void recorrerYGenerarReportePorUtilidad(NodoABB nodo, StringBuilder reporte) {
        if (nodo != null) {
            Municipalidad muni = nodo.getMunicipalidad();
            double utilidad = muni.getIngresosAnuales() - muni.getGastosAnuales();

            // Agregar datos al reporte
            reporte.append(muni.getCentroPoblado()).append(";")
                    .append(muni.getProvincia()).append(";")
                    .append(muni.getDepartamento()).append(";")
                    .append(muni.getIngresosAnuales()).append(";")
                    .append(muni.getGastosAnuales()).append(";")
                    .append(utilidad).append("\n");

            // Recursión en los subárboles izquierdo y derecho
            recorrerYGenerarReportePorUtilidad(nodo.getIzquierda(), reporte);
            recorrerYGenerarReportePorUtilidad(nodo.getDerecha(), reporte);
        }
    }
}
