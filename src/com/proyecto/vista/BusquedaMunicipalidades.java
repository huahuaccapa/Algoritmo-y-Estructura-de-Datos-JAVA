package com.proyecto.vista;

import com.proyecto.modelo.Municipalidad;
import com.proyecto.modelo.ListaEnlazadaCircularDoble;
import com.proyecto.modelo.NodoMunicipalidad;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BusquedaMunicipalidades extends javax.swing.JFrame {

    private ListaEnlazadaCircularDoble listaMunicipalidades;

    public BusquedaMunicipalidades() {
        initComponents();
        listaMunicipalidades = new ListaEnlazadaCircularDoble();
    }

    private void cargarDatosDesdeArchivo(String archivo) {

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String line;
            DefaultTableModel model = (DefaultTableModel) tabladecargarcsv.getModel();
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1CARGARCVS = new javax.swing.JButton();
        jButton2BUSCAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladecargarcsv = new javax.swing.JTable();
        jButton1REGRESO = new javax.swing.JButton();
        jButton1ACTUALIZARTABLA = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("AREA DE BUSQUEDA DE MUNICIPALIDADES");

        jLabel2.setText("Año:");

        jLabel3.setText("Departamento:");

        jLabel4.setText("Provincia:");

        jLabel5.setText("Cobertura de Radio:");

        jLabel6.setText("Medio de Transporte:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jButton1CARGARCVS.setText("CARGAR CSV");
        jButton1CARGARCVS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1CARGARCVSActionPerformed(evt);
            }
        });

        jButton2BUSCAR.setText("BUSCAR");
        jButton2BUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2BUSCARActionPerformed(evt);
            }
        });

        tabladecargarcsv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Año ", "DEPARTAMENTO ", "PROVINCIA ", "CENTRO POBLADO ", "COBERTURA DE RADIO ", "FRECUENCIA DE RADIO ", "INGRESO ANUAL ", "GASTOS ANUALES ", "VIA DE ACCESO ", "MEDIO DE TRANSPORTE "
            }
        ));
        jScrollPane1.setViewportView(tabladecargarcsv);

        jButton1REGRESO.setText("REGRESAR");
        jButton1REGRESO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1REGRESOActionPerformed(evt);
            }
        });

        jButton1ACTUALIZARTABLA.setText("RETORNAR TABLA ORIGINAL");
        jButton1ACTUALIZARTABLA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ACTUALIZARTABLAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1CARGARCVS)
                                    .addComponent(jLabel6))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(jButton1ACTUALIZARTABLA)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1REGRESO)
                                .addGap(38, 38, 38))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton2BUSCAR)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1REGRESO))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2BUSCAR)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1CARGARCVS)
                    .addComponent(jButton1ACTUALIZARTABLA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarDatosEnTabla(NodoMunicipalidad cabeza) {
        if (cabeza == null) {
            JOptionPane.showMessageDialog(null, "No hay datos disponibles para mostrar.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tabladecargarcsv.getModel();
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

    private void buscarMunicipalidades() {
        String ano = jTextField1.getText().trim().toLowerCase();
        String departamento = jTextField2.getText().trim().toLowerCase();
        String provincia = jTextField3.getText().trim().toLowerCase();
        String cobertura = jTextField4.getText().trim().toLowerCase();
        String medioTransporte = jTextField5.getText().trim().toLowerCase();

        ListaEnlazadaCircularDoble resultados = new ListaEnlazadaCircularDoble();
        NodoMunicipalidad actual = listaMunicipalidades.getCabeza();

        if (actual != null) {
            do {
                Municipalidad muni = actual.getMunicipalidad();
                boolean coincide = true;

                // Búsqueda parcial en cada criterio
                if (!ano.isEmpty() && !String.valueOf(muni.getyear()).toLowerCase().contains(ano)) {
                    coincide = false;
                }
                if (!departamento.isEmpty() && !muni.getDepartamento().toLowerCase().contains(departamento)) {
                    coincide = false;
                }
                if (!provincia.isEmpty() && !muni.getProvincia().toLowerCase().contains(provincia)) {
                    coincide = false;
                }
                if (!cobertura.isEmpty() && !String.valueOf(muni.getCoberturaRadio()).toLowerCase().contains(cobertura)) {
                    coincide = false;
                }
                if (!medioTransporte.isEmpty() && !muni.getMedioTransporte().toLowerCase().contains(medioTransporte)) {
                    coincide = false;
                }

                if (coincide) {
                    resultados.insertar(muni);
                }

                actual = actual.getSiguiente();
            } while (actual != listaMunicipalidades.getCabeza());
        }

        mostrarDatosEnTabla(resultados.getCabeza());
    }


    private void jButton1CARGARCVSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1CARGARCVSActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int opcion = fileChooser.showOpenDialog(this);
        if (opcion == JFileChooser.APPROVE_OPTION) {
            String archivo = fileChooser.getSelectedFile().getPath();
            cargarDatosDesdeArchivo(archivo);
        }

     }//GEN-LAST:event_jButton1CARGARCVSActionPerformed

    private void jButton2BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2BUSCARActionPerformed
        buscarMunicipalidades();    }//GEN-LAST:event_jButton2BUSCARActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton1REGRESOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1REGRESOActionPerformed
        this.dispose();

        FormularioPrincipal formularioPrincipal = new FormularioPrincipal();  // Crea una nueva instancia del panel principal
        formularioPrincipal.setVisible(true);
    }//GEN-LAST:event_jButton1REGRESOActionPerformed

    private void jButton1ACTUALIZARTABLAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ACTUALIZARTABLAActionPerformed
        mostrarDatosEnTabla(listaMunicipalidades.getCabeza());

    }//GEN-LAST:event_jButton1ACTUALIZARTABLAActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BusquedaMunicipalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusquedaMunicipalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusquedaMunicipalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusquedaMunicipalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusquedaMunicipalidades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1ACTUALIZARTABLA;
    private javax.swing.JButton jButton1CARGARCVS;
    private javax.swing.JButton jButton1REGRESO;
    private javax.swing.JButton jButton2BUSCAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTable tabladecargarcsv;
    // End of variables declaration//GEN-END:variables
}
