/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Controlador.*;
import java.util.ArrayList;
import javax.swing.JOptionPane; 
/**
 *
 * @author Luis
 */
public class InternalBorrarCita extends javax.swing.JInternalFrame {

  ControlCita controlCita;
  ControlPaciente controlPaciente;
    /**
     * Creates new form InternalEliminarCita
     */
    public InternalBorrarCita(ControlCita controlCita,ControlPaciente controlPaciente) {
        this.controlCita = controlCita;
        this.controlPaciente = controlPaciente;
        initComponents();
        this.jComboBox1.setVisible(false);
        this.jLabel6.setVisible(false);
        this.eliminar.setVisible(false);
        
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
        id_paciente = new javax.swing.JTextField();
        eliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        consultar = new javax.swing.JButton();

        setClosable(true);

        id_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_pacienteActionPerformed(evt);
            }
        });

        eliminar.setText("ELIMINAR");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        jLabel1.setText("INGRESE EL ID DEL PACIENTE DEL QUE QUIERE CONSULTAR LAS CITAS:");

        jLabel2.setText("ID DEL PACIENTE:");

        jLabel6.setText("LAS CITAS DEL PACIENTE SON:");

        consultar.setText("CONSULTAR");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1)
                    .addComponent(eliminar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(id_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(consultar))
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultar))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eliminar)
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

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        if(this.jComboBox1.getSelectedItem()== null){
            JOptionPane.showMessageDialog(this, "porfavor elija una cita para eliminar, si no hay ninguna no tiene citas");
        }else{
            String id_paciente = this.id_paciente.getText();            
            String string= (String) this.jComboBox1.getSelectedItem();
            
            String[] cita = string.split("=");
            
            String pr= cita[1];
            String[] s= pr.split("\\.");
            String medico=s[0];
            
            String se= cita[2];
            String[] o= se.split("\\.");
            String fecha= o[0];
            
            String hora= cita[3];
            JOptionPane.showMessageDialog(this, controlCita.eliminarCita(medico, id_paciente, fecha, hora));
            this.jComboBox1.removeAllItems();
            refrescar(this.id_paciente.getText());
        }     
    }//GEN-LAST:event_eliminarActionPerformed

    private void id_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_pacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_pacienteActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
       if(this.id_paciente.getText().trim().isEmpty()
           ){
            JOptionPane.showMessageDialog(this, "el campo id del paciente esta vacio");
        }else{
            String id_paciente = this.id_paciente.getText();
            if(controlPaciente.verificarExistencia(id_paciente)){
                refrescar(id_paciente);
                this.jComboBox1.setVisible(true);
                this.jLabel6.setVisible(true);
                this.eliminar.setVisible(true);
                this.id_paciente.setEditable(false);
                this.consultar.setEnabled(false);
            }else{
                JOptionPane.showMessageDialog(this, "el numero de paciente o el numero del medico no existen");
            }
            
                       
        }
    }//GEN-LAST:event_consultarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consultar;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField id_paciente;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables


 private void refrescar(String id_paciente) {
        ArrayList lista = controlCita.listarCitasPaciente(id_paciente);

        if (lista != null) {
            int n = lista.size();
            for (int i = 0; i < n; i++) {
                this.jComboBox1.addItem((String) lista.get(i));
            }
        }else{
            lista.add("usted no tiene ninguna cita");
            this.jComboBox1.addItem((String)lista.get(1));
        }
    }
}