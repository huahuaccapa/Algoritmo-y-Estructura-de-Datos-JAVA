package com.proyecto.vista;

import com.proyecto.modelo.NodoMunicipalidad;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.proyecto.modelo.ListaEnlazadaCircularDoble;
import com.proyecto.modelo.Municipalidad;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;

public class RegistrarDatosDeMunicipalidades extends javax.swing.JFrame {

    private ListaEnlazadaCircularDoble listaMunicipalidades;

    public RegistrarDatosDeMunicipalidades() {
        initComponents();
        listaMunicipalidades = new ListaEnlazadaCircularDoble(); // Inicializar la lista

        // Crear grupos de botones para el tipo de acceso y medio de transporte
        ButtonGroup Viaacceso = new ButtonGroup();
        Viaacceso.add(jRadioButton1TERRESTE);
        Viaacceso.add(jRadioButton2AEREO);
        Viaacceso.add(jRadioButton3MARINO);

        ButtonGroup grupoTransporte = new ButtonGroup();
        grupoTransporte.add(jRadioButton4VEHICULO);
        grupoTransporte.add(jRadioButton5AVION);
        grupoTransporte.add(jRadioButton6BARCO);

        // Configurar las columnas de la tabla
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Año");
        model.addColumn("Departamento");
        model.addColumn("Provincia");
        model.addColumn("Centro Poblado");
        model.addColumn("Cobertura Radio");
        model.addColumn("Frecuencia Radio");
        model.addColumn("Ingresos Anuales");
        model.addColumn("Gastos Anuales");
        model.addColumn("Medio Transporte");

        TABLADEREGISTRO.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TITULO = new javax.swing.JLabel();
        AÑO = new javax.swing.JLabel();
        DEPARTAMENTO = new javax.swing.JLabel();
        PROVINCIA = new javax.swing.JLabel();
        CENTROPOBLADO = new javax.swing.JLabel();
        COBERTURARADIO = new javax.swing.JLabel();
        FRECUENCIARADIO = new javax.swing.JLabel();
        INGRESOSANUALES = new javax.swing.JLabel();
        GASTOSANUALES = new javax.swing.JLabel();
        VIAACCESO = new javax.swing.JLabel();
        MEDIOTRANSPORTE = new javax.swing.JLabel();
        jRadioButton1TERRESTE = new javax.swing.JRadioButton();
        jRadioButton2AEREO = new javax.swing.JRadioButton();
        jRadioButton3MARINO = new javax.swing.JRadioButton();
        jRadioButton4VEHICULO = new javax.swing.JRadioButton();
        jRadioButton5AVION = new javax.swing.JRadioButton();
        jRadioButton6BARCO = new javax.swing.JRadioButton();
        BTONREGISRAR = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TABLADEREGISTRO = new javax.swing.JTable();
        OPCIONES = new javax.swing.JLabel();
        SALIR = new javax.swing.JButton();
        jButton1ELIMINARCONTENIDO = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TITULO.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TITULO.setText("AREA DE REGISTRO DE MUNICIPALIDADES");

        AÑO.setText("AÑO:");

        DEPARTAMENTO.setText("DEPARTAMENTO:");

        PROVINCIA.setText("PROVINCIA:");

        CENTROPOBLADO.setText("CENTRO POBLADO:");

        COBERTURARADIO.setText("COBERTURA DE RADIO:");

        FRECUENCIARADIO.setText("FRECUENCIA DE RADIO:");

        INGRESOSANUALES.setText("INGRESOS ANUALES:");

        GASTOSANUALES.setText("GASTOS ANUALES:");

        VIAACCESO.setText("VIA DE ACCESO:");

        MEDIOTRANSPORTE.setText("MEDIO DE TRANSPORTE:");

        jRadioButton1TERRESTE.setText("TERRESTRE");
        jRadioButton1TERRESTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1TERRESTEActionPerformed(evt);
            }
        });

        jRadioButton2AEREO.setText("AEREO");
        jRadioButton2AEREO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2AEREOActionPerformed(evt);
            }
        });

        jRadioButton3MARINO.setText("MARINO");
        jRadioButton3MARINO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3MARINOActionPerformed(evt);
            }
        });

        jRadioButton4VEHICULO.setText("VEHICULO");
        jRadioButton4VEHICULO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4VEHICULOActionPerformed(evt);
            }
        });

        jRadioButton5AVION.setText("AVION");
        jRadioButton5AVION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5AVIONActionPerformed(evt);
            }
        });

        jRadioButton6BARCO.setText("BARCO");
        jRadioButton6BARCO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6BARCOActionPerformed(evt);
            }
        });

        BTONREGISRAR.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BTONREGISRAR.setText("REGISTRAR");
        BTONREGISRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTONREGISRARActionPerformed(evt);
            }
        });

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

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        TABLADEREGISTRO.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        TABLADEREGISTRO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "AÑO", "DEPARTAMENTO", "PROVINCIA", "CENTRO POBLADO", "COBERTURA DE RADIO", "FRECUENCIA DE RADIO", "INGRESOS ANUALES", "GASTOS ANUALES", "VIA DE ACCESO", "MEDIO DE TRANSPORTE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TABLADEREGISTRO);

        OPCIONES.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        OPCIONES.setText("OPCIONES:");

        SALIR.setText("REGRESAR");
        SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALIRActionPerformed(evt);
            }
        });

        jButton1ELIMINARCONTENIDO.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1ELIMINARCONTENIDO.setText("ELIMINAR CONTENIDO");
        jButton1ELIMINARCONTENIDO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ELIMINARCONTENIDOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(VIAACCESO)
                                .addGap(46, 46, 46)
                                .addComponent(jRadioButton1TERRESTE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton2AEREO)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton3MARINO))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AÑO)
                                    .addComponent(DEPARTAMENTO)
                                    .addComponent(PROVINCIA)
                                    .addComponent(CENTROPOBLADO)
                                    .addComponent(COBERTURARADIO)
                                    .addComponent(FRECUENCIARADIO)
                                    .addComponent(INGRESOSANUALES)
                                    .addComponent(GASTOSANUALES))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField4)
                                    .addComponent(jTextField5)
                                    .addComponent(jTextField6)
                                    .addComponent(jTextField7)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(MEDIOTRANSPORTE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton4VEHICULO)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton5AVION)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton6BARCO))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BTONREGISRAR)
                                .addGap(28, 28, 28)
                                .addComponent(jButton1ELIMINARCONTENIDO))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(SALIR)
                                .addGap(37, 37, 37)
                                .addComponent(TITULO))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(OPCIONES)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SALIR)
                    .addComponent(TITULO))
                .addGap(16, 16, 16)
                .addComponent(OPCIONES)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AÑO)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DEPARTAMENTO)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PROVINCIA)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CENTROPOBLADO)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(COBERTURARADIO)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FRECUENCIARADIO)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(INGRESOSANUALES)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GASTOSANUALES)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(VIAACCESO)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton1TERRESTE)
                        .addComponent(jRadioButton2AEREO)
                        .addComponent(jRadioButton3MARINO)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MEDIOTRANSPORTE)
                    .addComponent(jRadioButton4VEHICULO)
                    .addComponent(jRadioButton5AVION)
                    .addComponent(jRadioButton6BARCO))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1ELIMINARCONTENIDO)
                    .addComponent(BTONREGISRAR))
                .addGap(18, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(258, 258, 258))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jRadioButton1TERRESTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1TERRESTEActionPerformed
    }//GEN-LAST:event_jRadioButton1TERRESTEActionPerformed

    private void jRadioButton2AEREOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2AEREOActionPerformed
    }//GEN-LAST:event_jRadioButton2AEREOActionPerformed

    private void jRadioButton3MARINOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3MARINOActionPerformed
    }//GEN-LAST:event_jRadioButton3MARINOActionPerformed

    private void jRadioButton4VEHICULOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4VEHICULOActionPerformed
    }//GEN-LAST:event_jRadioButton4VEHICULOActionPerformed

    private void jRadioButton5AVIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5AVIONActionPerformed
    }//GEN-LAST:event_jRadioButton5AVIONActionPerformed

    private void jRadioButton6BARCOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6BARCOActionPerformed
    }//GEN-LAST:event_jRadioButton6BARCOActionPerformed

    private void BTONREGISRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTONREGISRARActionPerformed
        String anoTexto = jTextField1.getText();
        String departamento = jTextField2.getText();
        String provincia = jTextField3.getText();
        String centroPoblado = jTextField4.getText();
        String coberturaRadioTexto = jTextField5.getText();
        String frecuenciaRadio = jTextField6.getText();
        String ingresosAnualesTexto = jTextField7.getText();
        String gastosAnualesTexto = jTextField8.getText();

        if (anoTexto.isEmpty() || departamento.isEmpty() || provincia.isEmpty() || centroPoblado.isEmpty()
                || coberturaRadioTexto.isEmpty() || frecuenciaRadio.isEmpty() || ingresosAnualesTexto.isEmpty() || gastosAnualesTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double coberturaRadio = 0.0;
        double ingresosAnuales = 0.0;
        double gastosAnuales = 0.0;
        try {
            coberturaRadio = Double.parseDouble(coberturaRadioTexto);
            ingresosAnuales = Double.parseDouble(ingresosAnualesTexto);
            gastosAnuales = Double.parseDouble(gastosAnualesTexto);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese valores numéricos válidos para los campos de cobertura, ingresos y gastos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int ano = 0;
        try {
            ano = Integer.parseInt(anoTexto);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un año válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String medioTransporte = "";
        if (jRadioButton1TERRESTE.isSelected()) {
            medioTransporte = "Terrestre";
        } else if (jRadioButton2AEREO.isSelected()) {
            medioTransporte = "Aéreo";
        } else if (jRadioButton3MARINO.isSelected()) {
            medioTransporte = "Marino";
        } else if (jRadioButton4VEHICULO.isSelected()) {
            medioTransporte = "Vehículo";
        } else if (jRadioButton5AVION.isSelected()) {
            medioTransporte = "Avión";
        } else if (jRadioButton6BARCO.isSelected()) {
            medioTransporte = "Barco";
        }

        Municipalidad nuevaMunicipalidad = new Municipalidad(ano, departamento, provincia, centroPoblado,
                coberturaRadio, frecuenciaRadio, ingresosAnuales, gastosAnuales, "Vía Acceso", medioTransporte);

        listaMunicipalidades.insertar(nuevaMunicipalidad);

        actualizarTabla();

        guardarDatosEnArchivo();

        limpiarCampos();

    }//GEN-LAST:event_BTONREGISRARActionPerformed
    private void crearArchivoSiNoExiste() {
        File archivo = new File("muni_actualizado.txt");
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error al crear el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }


    private void SALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALIRActionPerformed
        this.dispose();

        FormularioPrincipal formularioPrincipal = new FormularioPrincipal();  // Crea una nueva instancia del panel principal
        formularioPrincipal.setVisible(true);    }//GEN-LAST:event_SALIRActionPerformed

    private void jButton1ELIMINARCONTENIDOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ELIMINARCONTENIDOActionPerformed

        DefaultTableModel model = (DefaultTableModel) TABLADEREGISTRO.getModel();
        model.setRowCount(0);  // Esto elimina todas las filas de la tabla

        File archivo = new File("muni_actualizado.txt");
        try {
            if (archivo.exists()) {
                BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
                bw.write("");
                bw.close();
            }

            JOptionPane.showMessageDialog(this, "Contenido de la tabla y el archivo han sido eliminados.",
                    "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al eliminar el contenido del archivo.", "Error", JOptionPane.ERROR_MESSAGE);
        }    }//GEN-LAST:event_jButton1ELIMINARCONTENIDOActionPerformed
    private void actualizarTabla() {
        DefaultTableModel model = (DefaultTableModel) TABLADEREGISTRO.getModel();
        model.setRowCount(0);

        NodoMunicipalidad actual = listaMunicipalidades.getCabeza();
        do {
            Object[] fila = {
                actual.getMunicipalidad().getyear(),
                actual.getMunicipalidad().getDepartamento(),
                actual.getMunicipalidad().getProvincia(),
                actual.getMunicipalidad().getCentroPoblado(),
                actual.getMunicipalidad().getCoberturaRadio(),
                actual.getMunicipalidad().getFrecuenciaRadio(),
                actual.getMunicipalidad().getIngresosAnuales(),
                actual.getMunicipalidad().getGastosAnuales(),
                actual.getMunicipalidad().getMedioTransporte()
            };
            model.addRow(fila);
            actual = actual.getSiguiente();
        } while (actual != listaMunicipalidades.getCabeza());
    }

    private void guardarDatosEnArchivo() {
        new Thread(() -> {
            File archivo = new File("muni_actualizado.txt");

            try {
                if (!archivo.exists()) {
                    archivo.createNewFile();
                }

                try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) { // 'true' para agregar datos sin sobrescribir
                    NodoMunicipalidad nodoActual = listaMunicipalidades.getCabeza();
                    if (nodoActual != null) {
                        do {
                            Municipalidad municipio = nodoActual.getMunicipalidad();

                            String linea = municipio.getyear() + ","
                                    + municipio.getDepartamento() + ","
                                    + municipio.getProvincia() + ","
                                    + municipio.getCentroPoblado() + ","
                                    + municipio.getCoberturaRadio() + ","
                                    + municipio.getFrecuenciaRadio() + ","
                                    + municipio.getIngresosAnuales() + ","
                                    + municipio.getGastosAnuales() + ","
                                    + municipio.getMedioTransporte();

                            bw.write(linea);
                            bw.newLine();

                            nodoActual = nodoActual.getSiguiente();
                        } while (nodoActual != listaMunicipalidades.getCabeza());
                    }

                    SwingUtilities.invokeLater(() -> {
                        JOptionPane.showMessageDialog(this, "Datos guardados en muni_actualizado.txt");
                    });

                }
            } catch (IOException e) {
                SwingUtilities.invokeLater(() -> {
                    JOptionPane.showMessageDialog(this, "Error al guardar los datos en el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
                });
            }
        }).start();
    }

    private void limpiarCampos() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarDatosDeMunicipalidades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AÑO;
    private javax.swing.JButton BTONREGISRAR;
    private javax.swing.JLabel CENTROPOBLADO;
    private javax.swing.JLabel COBERTURARADIO;
    private javax.swing.JLabel DEPARTAMENTO;
    private javax.swing.JLabel FRECUENCIARADIO;
    private javax.swing.JLabel GASTOSANUALES;
    private javax.swing.JLabel INGRESOSANUALES;
    private javax.swing.JLabel MEDIOTRANSPORTE;
    private javax.swing.JLabel OPCIONES;
    private javax.swing.JLabel PROVINCIA;
    private javax.swing.JButton SALIR;
    private javax.swing.JTable TABLADEREGISTRO;
    private javax.swing.JLabel TITULO;
    private javax.swing.JLabel VIAACCESO;
    private javax.swing.JButton jButton1ELIMINARCONTENIDO;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1TERRESTE;
    private javax.swing.JRadioButton jRadioButton2AEREO;
    private javax.swing.JRadioButton jRadioButton3MARINO;
    private javax.swing.JRadioButton jRadioButton4VEHICULO;
    private javax.swing.JRadioButton jRadioButton5AVION;
    private javax.swing.JRadioButton jRadioButton6BARCO;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
