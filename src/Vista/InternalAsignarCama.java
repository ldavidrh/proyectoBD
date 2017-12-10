/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import AccesoDatos.DaoPaciente;
import Controlador.ControlAsignada;
import Controlador.ControlCama;
import Controlador.ControlPaciente;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis
 */
public class InternalAsignarCama extends javax.swing.JInternalFrame {

    ControlAsignada controlAsignada;
    ControlPaciente controlPaciente;
    ControlCama controlCama;

    /**
     * Creates new form InternalAsignarCama
     *
     * @param controlAsignada
     */
    public InternalAsignarCama(ControlAsignada controlAsignada, ControlPaciente controlPaciente, ControlCama controlCama) {
        this.controlAsignada = controlAsignada;
        this.controlPaciente = controlPaciente;
        this.controlCama = controlCama;
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        FieldNumeroCama = new javax.swing.JTextField();
        FieldCedula = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        ButtonAsignarCama = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Asignar cama");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Número cama");

        jLabel2.setText("Cédula persona");

        jLabel3.setText("Fecha entrada");

        jLabel4.setText("Fecha salida");

        FieldCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldCedulaActionPerformed(evt);
            }
        });

        ButtonAsignarCama.setText("Asignar");
        ButtonAsignarCama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAsignarCamaActionPerformed(evt);
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
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addComponent(FieldNumeroCama))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FieldCedula)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ButtonAsignarCama)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(FieldNumeroCama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonAsignarCama)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FieldCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldCedulaActionPerformed

    private void ButtonAsignarCamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAsignarCamaActionPerformed
        // TODO add your handling code here:
        try {
            if (this.FieldNumeroCama.getText().trim().isEmpty() || this.FieldCedula.getText().trim().isEmpty()) {
                JOptionPane.showInternalMessageDialog(this, "Existen casillas vacias.", "Atención", JOptionPane.WARNING_MESSAGE);
            } else {
                String num_cama = this.FieldNumeroCama.getText();
                String cedula = this.FieldCedula.getText();

                if (!controlPaciente.verificarExistencia(cedula)) {
                    JOptionPane.showMessageDialog(this, "No existe un paciente con esa cédula");
                } else if (!controlCama.verificarExistencia(num_cama)) {
                    JOptionPane.showMessageDialog(this, "No existe una cama con ese número");
                }else if (!controlCama.verificarEstado(num_cama)){
                    JOptionPane.showMessageDialog(this, "Esa cama se encuentra ocupada");                 
                } else {
                    LocalDate entrada = this.jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                    String dia_entrada = String.valueOf(entrada.getDayOfMonth());
                    String mes_entrada = String.valueOf(entrada.getMonthValue());
                    String anio_entrada = String.valueOf(entrada.getYear());
                    String fecha_entrada = dia_entrada + "-" + mes_entrada + "-" + anio_entrada;

                    LocalDate salida = this.jDateChooser2.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                    String dia_salida = String.valueOf(salida.getDayOfMonth());
                    String mes_salida = String.valueOf(salida.getMonthValue());
                    String anio_salida = String.valueOf(salida.getYear());
                    String fecha_salida = dia_salida + "-" + mes_salida + "-" + anio_salida;

                    String mensaje = controlAsignada.insertarAsignada(cedula, num_cama, fecha_entrada, fecha_salida);
                    if (mensaje.equals("Asignación exitosa")) {
                        controlCama.modificarEstado(num_cama, "Ocupada");
                    }
                    JOptionPane.showMessageDialog(this, mensaje);
                }
            }
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(this, "Seleccione las fechas");
        }
    }//GEN-LAST:event_ButtonAsignarCamaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAsignarCama;
    private javax.swing.JTextField FieldCedula;
    private javax.swing.JTextField FieldNumeroCama;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
