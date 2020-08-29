/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.rmi.RemoteException;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Antecedente;
import model.Ciudadano;
import model.TipoDocumento;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import controller.ControllerAntecedentesPenales;

/**
 *
 * @author Estudiantes
 */
public class GUIAntecedentes extends javax.swing.JFrame implements Cambiable, IBuscarDelito, IBuscarCiudadano{

    private ControllerAntecedentesPenales controller;
    /**
     * Creates new form GUIAntecedentes
     */
    public GUIAntecedentes() {
        initComponents();
        this.controller = ControllerAntecedentesPenales.getInstance();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAntecedentes = new javax.swing.JTable();
        jCheckBoxDI = new javax.swing.JCheckBox();
        jCheckBoxDelito = new javax.swing.JCheckBox();
        jTextFieldDI = new javax.swing.JTextField();
        jTextFieldDelito = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButtonFiltrar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setTitle("Ver Antecedentes");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Fax", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(3, 59, 118));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ANTECEDENTES");

        jTableAntecedentes.setBackground(new java.awt.Color(229, 229, 229));
        jTableAntecedentes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jTableAntecedentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Ciudadano_Di", "Delito_Codigo", "Fecha_Delito", "Sentencia", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableAntecedentes.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTableAntecedentes.setSelectionForeground(new java.awt.Color(3, 59, 118));
        jTableAntecedentes.getTableHeader().setReorderingAllowed(false);
        jTableAntecedentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAntecedentesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAntecedentes);

        jCheckBoxDI.setText("DI");

        jCheckBoxDelito.setText("Delito");

        jButton2.setText("...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButtonFiltrar.setBackground(new java.awt.Color(229, 229, 229));
        jButtonFiltrar.setFont(new java.awt.Font("Lucida Fax", 2, 18)); // NOI18N
        jButtonFiltrar.setForeground(new java.awt.Color(3, 59, 118));
        jButtonFiltrar.setText("Filtrar/mostrar");
        jButtonFiltrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiltrarActionPerformed(evt);
            }
        });

        jButton3.setText("...");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxDI)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldDI, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxDelito)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldDelito, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonFiltrar)))
                .addContainerGap(306, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxDI)
                    .addComponent(jCheckBoxDelito))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDelito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButtonFiltrar)
                    .addComponent(jButton3))
                .addContainerGap(383, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(149, 149, 149)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(84, Short.MAX_VALUE)))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableAntecedentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAntecedentesMouseClicked
        // TODO add your handling code here:
        int row = jTableAntecedentes.getSelectedRow();
        String cedula = (String)jTableAntecedentes.getValueAt(row, 5);
        Ciudadano persona = controller.darCiudadanoPorCedula(cedula);
    }//GEN-LAST:event_jTableAntecedentesMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        GUIMostrarDelito gui = new GUIMostrarDelito(this);
        gui.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiltrarActionPerformed
        // TODO add your handling code here:
        ArrayList<Antecedente> antecedentes = new ArrayList<>();
        if(jCheckBoxDI.isSelected()){
            if(jCheckBoxDelito.isSelected()){
                antecedentes = controller.darAntecedentesPorCiudadanoYDelito(jTextFieldDI.getText(), Integer.parseInt(jTextFieldDelito.getText()));
            }
            else{
                    antecedentes = controller.darAntecedentesPorCiudadano(jTextFieldDI.getText());
            } 
        }
        else if(jCheckBoxDelito.isSelected())
        {
                antecedentes = controller.darAntecedentesPorDelito(Integer.parseInt(jTextFieldDelito.getText()));
        }
        else
        {
                antecedentes = controller.darAntecedentes();
        }
        llenarGrilla(antecedentes);
    }//GEN-LAST:event_jButtonFiltrarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        GUICiudadano gui = new GUICiudadano(this);
        gui.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonFiltrar;
    private javax.swing.JCheckBox jCheckBoxDI;
    private javax.swing.JCheckBox jCheckBoxDelito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAntecedentes;
    private javax.swing.JTextField jTextFieldDI;
    private javax.swing.JTextField jTextFieldDelito;
    // End of variables declaration//GEN-END:variables

    //TODO implementar
    @Override
    public void cambio() {

    }

    @Override
    public void cambiarTxtDelito(int codigoDelito) {
       jTextFieldDelito.setText("" + codigoDelito);
    }
    
    public void llenarGrilla(ArrayList<Antecedente> lista)
    {
        DefaultTableModel model = (DefaultTableModel) jTableAntecedentes.getModel();
        model.getDataVector().removeAllElements();
        if(!lista.isEmpty())
        {
            for (Antecedente antecedente : lista) {
                model.addRow(new Object[]{antecedente.getId(), antecedente.getCiudadanoDi(), antecedente.getDelitoCodigo(), antecedente.getFechaDelito(), antecedente.getSentencia(), antecedente.getEstado()});    
            }
        }
    }

    @Override
    public void cambiarTxtCiudadano(String ciudadanoDI) {
        jTextFieldDI.setText(ciudadanoDI);
    }
}
