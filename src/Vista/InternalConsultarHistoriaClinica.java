/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControlHistoriaClinica;
import Controlador.ControlPaciente;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis
 */
public class InternalConsultarHistoriaClinica extends javax.swing.JInternalFrame {

    ControlHistoriaClinica controlHistoriaClinica;

    /**
     * Creates new form InternalConsultarHistoriaClinica
     *
     * @param controlHistoriaClinica
     */
    public InternalConsultarHistoriaClinica(ControlHistoriaClinica controlHistoriaClinica) {
        this.controlHistoriaClinica = controlHistoriaClinica;
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
        FieldCedula = new javax.swing.JTextField();
        ButtonConsultarHistoria = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextConsulta = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setTitle("Consultar historia clinica");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Ingrese la cedula del paciente que desea consultar la historia clinica");

        FieldCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldCedulaActionPerformed(evt);
            }
        });

        ButtonConsultarHistoria.setText("Consultar");
        ButtonConsultarHistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonConsultarHistoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(FieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonConsultarHistoria))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonConsultarHistoria)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TextConsulta.setColumns(20);
        TextConsulta.setRows(5);
        jScrollPane1.setViewportView(TextConsulta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FieldCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldCedulaActionPerformed

    private void ButtonConsultarHistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonConsultarHistoriaActionPerformed
        if (this.FieldCedula.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "por favor ingrese una cedula");
        } else {            
            String consulta;
            String num_historia = "H" + this.FieldCedula.getText();
            String[] historia = controlHistoriaClinica.consultarHistoria(num_historia);
            if (historia == null) {
                consulta = "No existe un paciente con esa cédula en el hospital";
                this.TextConsulta.setText(consulta);
            } else {
                consulta = controlHistoriaClinica.listarRegistros(num_historia);
                if (consulta.equals("")) {
                    this.TextConsulta.setText("No existen registros en la historia clínica");
                } else {
                    this.TextConsulta.setText(consulta);
                }                
            }
        }
    }//GEN-LAST:event_ButtonConsultarHistoriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonConsultarHistoria;
    private javax.swing.JTextField FieldCedula;
    private javax.swing.JTextArea TextConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
