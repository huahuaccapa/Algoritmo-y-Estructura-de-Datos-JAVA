package com.proyecto.vista;

import com.proyecto.modelo.ArbolABB;
import com.proyecto.modelo.ArbolAVL;
import com.proyecto.modelo.Municipalidad;
import com.proyecto.modelo.ListaEnlazadaCircularDoble;
import com.proyecto.modelo.NodoMunicipalidad;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.proyecto.modelo.GeneradorDeReportes;

public class GenerarReportesDeMunicipalilades extends javax.swing.JFrame {

    private ListaEnlazadaCircularDoble listaMunicipalidades;
    private ArbolABB arbolABB;
    private ArbolAVL arbolAVL;

    public GenerarReportesDeMunicipalilades() {
        initComponents();
        listaMunicipalidades = new ListaEnlazadaCircularDoble();
        arbolABB = new ArbolABB();
        arbolAVL = new ArbolAVL();

    }

    private void cargarDatosDesdeArchivo(String archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String line;
            DefaultTableModel model = (DefaultTableModel) jTable1TABALADECSV.getModel();
            model.setRowCount(0);

            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] datos = line.split(";");

                if (datos.length == 10) {
                    try {
                        int ano = Integer.parseInt(datos[0]);
                        String departamento = datos[1];
                        String provincia = datos[2];
                        String centroPoblado = datos[3];
                        double coberturaRadio = Double.parseDouble(datos[4]);
                        String frecuenciaRadio = datos[5];
                        double ingresosAnuales = Double.parseDouble(datos[6]);
                        double gastosAnuales = Double.parseDouble(datos[7]);
                        String viaAcceso = datos[8];
                        String medioTransporte = datos[9];

                        Municipalidad muni = new Municipalidad(ano, departamento, provincia, centroPoblado,
                                coberturaRadio, frecuenciaRadio, ingresosAnuales, gastosAnuales, viaAcceso, medioTransporte);
                        listaMunicipalidades.insertar(muni);
                        arbolABB.insertar(muni);
                        arbolAVL.insertar(muni);

                        model.addRow(new Object[]{
                            ano, departamento, provincia, centroPoblado, coberturaRadio,
                            frecuenciaRadio, ingresosAnuales, gastosAnuales, viaAcceso, medioTransporte
                        });

                    } catch (NumberFormatException e) {
                        System.out.println("Error de formato en los datos: " + line);
                    }
                } else {
                    System.out.println("Datos incompletos en la línea: " + line);
                }
            }

            JOptionPane.showMessageDialog(this, "Archivo cargado correctamente.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void exportarACSV(String contenido, String tipoReporte, String parametro) {
        try {
            String nombreArchivo = "reporte_" + tipoReporte;
            if (parametro != null && !parametro.isEmpty()) {
                nombreArchivo += "_" + parametro;
            }
            nombreArchivo += ".csv";

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
                writer.write(contenido);
                JOptionPane.showMessageDialog(this, "Reporte exportado exitosamente como: " + nombreArchivo);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al exportar el reporte: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttongroupMenudereportes = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1IMPORTARCSV = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1TABALADECSV = new javax.swing.JTable();
        jButton1GENERARREPORTE = new javax.swing.JButton();
        jButton1REGRESAR = new javax.swing.JButton();
        jRadioButton1porProvincia = new javax.swing.JRadioButton();
        jRadioButton2pordepartamento = new javax.swing.JRadioButton();
        jRadioButton5pormediodetranporte = new javax.swing.JRadioButton();
        jRadioButton6ingresosgastospormuni = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("AREA DE REPORTES");

        jButton1IMPORTARCSV.setText("IMPORTAR CSV");
        jButton1IMPORTARCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1IMPORTARCSVActionPerformed(evt);
            }
        });

        jLabel2.setText("MENU DE REPORTES:");

        jTable1TABALADECSV.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jTable1TABALADECSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "AÑO", "DEPARTAMENTO", "PROVINCIA", "CENTRO POBLADO", "COBERTURA DE RADIO", "FRECUENCIA DE RADIO", "INGRESOS ANUALES", "GASTOS ANUALES", "VIA DE ACCESO", "MEDIO DE TRANSPORTE"
            }
        ));
        jScrollPane1.setViewportView(jTable1TABALADECSV);

        jButton1GENERARREPORTE.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1GENERARREPORTE.setText("GENERAR");
        jButton1GENERARREPORTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1GENERARREPORTEActionPerformed(evt);
            }
        });

        jButton1REGRESAR.setText("REGRESAR");
        jButton1REGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1REGRESARActionPerformed(evt);
            }
        });

        buttongroupMenudereportes.add(jRadioButton1porProvincia);
        jRadioButton1porProvincia.setText("1)Cantidad de municipalidades por provincia");
        jRadioButton1porProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1porProvinciaActionPerformed(evt);
            }
        });

        buttongroupMenudereportes.add(jRadioButton2pordepartamento);
        jRadioButton2pordepartamento.setText("2)Cantidad de municipalidades por departamento");
        jRadioButton2pordepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2pordepartamentoActionPerformed(evt);
            }
        });

        buttongroupMenudereportes.add(jRadioButton5pormediodetranporte);
        jRadioButton5pormediodetranporte.setText("3)Cantidad de municipalidades por medio de transporte");
        jRadioButton5pormediodetranporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5pormediodetranporteActionPerformed(evt);
            }
        });

        buttongroupMenudereportes.add(jRadioButton6ingresosgastospormuni);
        jRadioButton6ingresosgastospormuni.setText("4)Utilidad total (ingreso – gasto) por municipalidad");
        jRadioButton6ingresosgastospormuni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ingresosgastospormuniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1REGRESAR))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jButton1IMPORTARCSV))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton6ingresosgastospormuni)
                    .addComponent(jButton1GENERARREPORTE, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jRadioButton1porProvincia)
                    .addComponent(jRadioButton2pordepartamento)
                    .addComponent(jRadioButton5pormediodetranporte))
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton1porProvincia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2pordepartamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton5pormediodetranporte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton6ingresosgastospormuni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1GENERARREPORTE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1REGRESAR)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1IMPORTARCSV)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarDatosEnTabla(NodoMunicipalidad cabeza) {
        if (cabeza == null) {
            JOptionPane.showMessageDialog(null, "No hay datos disponibles para mostrar.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1TABALADECSV.getModel();
        model.setRowCount(0);

        NodoMunicipalidad actual = cabeza;
        do {
            Municipalidad muni = actual.getMunicipalidad();

            model.addRow(new Object[]{
                muni.getyear(),
                muni.getDepartamento(),
                muni.getProvincia(),
                muni.getCentroPoblado(),
                muni.getCoberturaRadio(),
                muni.getFrecuenciaRadio(),
                muni.getIngresosAnuales(),
                muni.getGastosAnuales(),
                muni.getViaAcceso(),
                muni.getMedioTransporte()
            });

            actual = actual.getSiguiente();
        } while (actual != cabeza);
    }


    private void jButton1IMPORTARCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1IMPORTARCSVActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int opcion = fileChooser.showOpenDialog(this);
        if (opcion == JFileChooser.APPROVE_OPTION) {
            String archivo = fileChooser.getSelectedFile().getPath();
            cargarDatosDesdeArchivo(archivo);
        }
    }//GEN-LAST:event_jButton1IMPORTARCSVActionPerformed


    private void jButton1GENERARREPORTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1GENERARREPORTEActionPerformed
        boolean reporteGenerado = false;

        // Verificar si el botón "Por Provincia" está seleccionado
        if (jRadioButton1porProvincia.isSelected()) {
            String provincia = JOptionPane.showInputDialog(this, "Ingrese la provincia:");
            if (provincia != null && !provincia.isEmpty()) {
                // Generar el reporte por provincia
                String reporte = GeneradorDeReportes.generarReportePorProvincia(arbolABB.getRaiz(), provincia);
                exportarACSV(reporte, "reporte_por_provincia", provincia);
                reporteGenerado = true;
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar una provincia válida.");
            }
        }

        // Verificar si el botón "Por Departamento" está seleccionado
        if (jRadioButton2pordepartamento.isSelected()) {
            String departamento = JOptionPane.showInputDialog(this, "Ingrese el departamento:");
            if (departamento != null && !departamento.isEmpty()) {
                // Generar el reporte por departamento
                String reporte = GeneradorDeReportes.generarReportePorDepartamento(arbolABB.getRaiz(), departamento);
                exportarACSV(reporte, "reporte_por_departamento", departamento);
                reporteGenerado = true;
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar un departamento válido.");
            }
        }

        // Verificar si el botón "Por Medio de Transporte" está seleccionado
        if (jRadioButton5pormediodetranporte.isSelected()) {
            String medioTransporte = JOptionPane.showInputDialog(this, "Ingrese el medio de transporte:");
            if (medioTransporte != null && !medioTransporte.isEmpty()) {
                // Generar el reporte por medio de transporte
                String reporte = GeneradorDeReportes.generarReportePorMedioTransporte(arbolABB.getRaiz(), medioTransporte);
                exportarACSV(reporte, "reporte_por_medio_transporte", medioTransporte);
                reporteGenerado = true;
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar un medio de transporte válido.");
            }
        }

        // Verificar si el botón "Ingresos - Gastos por Municipalidad" está seleccionado
        if (jRadioButton6ingresosgastospormuni.isSelected()) {
            // Generar el reporte por utilidad
            String reporte = GeneradorDeReportes.generarReportePorUtilidad(arbolABB.getRaiz());
            exportarACSV(reporte, "reporte_por_utilidad", "");
            reporteGenerado = true;
        }

        // Mostrar mensaje si no se generó ningún reporte
        if (!reporteGenerado) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar al menos una opción para generar un reporte.");
        }
    }//GEN-LAST:event_jButton1GENERARREPORTEActionPerformed

    private void jButton1REGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1REGRESARActionPerformed
        this.dispose();

        FormularioPrincipal formularioPrincipal = new FormularioPrincipal();  // Crea una nueva instancia del panel principal
        formularioPrincipal.setVisible(true);
    }//GEN-LAST:event_jButton1REGRESARActionPerformed

    private void jRadioButton1porProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1porProvinciaActionPerformed
        jRadioButton1porProvincia.setSelected(!jRadioButton1porProvincia.isSelected());

    }//GEN-LAST:event_jRadioButton1porProvinciaActionPerformed

    private void jRadioButton2pordepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2pordepartamentoActionPerformed
        jRadioButton2pordepartamento.setSelected(!jRadioButton2pordepartamento.isSelected());

    }//GEN-LAST:event_jRadioButton2pordepartamentoActionPerformed

    private void jRadioButton5pormediodetranporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5pormediodetranporteActionPerformed
        jRadioButton5pormediodetranporte.setSelected(!jRadioButton5pormediodetranporte.isSelected());
    }//GEN-LAST:event_jRadioButton5pormediodetranporteActionPerformed

    private void jRadioButton6ingresosgastospormuniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ingresosgastospormuniActionPerformed
            jRadioButton6ingresosgastospormuni.setSelected(!jRadioButton6ingresosgastospormuni.isSelected());

    }//GEN-LAST:event_jRadioButton6ingresosgastospormuniActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GenerarReportesDeMunicipalilades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerarReportesDeMunicipalilades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerarReportesDeMunicipalilades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerarReportesDeMunicipalilades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerarReportesDeMunicipalilades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttongroupMenudereportes;
    private javax.swing.JButton jButton1GENERARREPORTE;
    private javax.swing.JButton jButton1IMPORTARCSV;
    private javax.swing.JButton jButton1REGRESAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1porProvincia;
    private javax.swing.JRadioButton jRadioButton2pordepartamento;
    private javax.swing.JRadioButton jRadioButton5pormediodetranporte;
    private javax.swing.JRadioButton jRadioButton6ingresosgastospormuni;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1TABALADECSV;
    // End of variables declaration//GEN-END:variables
}
