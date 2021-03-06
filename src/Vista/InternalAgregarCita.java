/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis
 */
public class InternalAgregarCita extends javax.swing.JInternalFrame {

    ControlCita controlCita;
    ControlMedico controlMedico;
    ControlPaciente controlPaciente;
    ControlAgenda controlAgenda;
    ControlAsiste controlAsiste;
    String fecha;

    /**
     * Creates new form InternalAgregarCita
     */
    public InternalAgregarCita(ControlCita controlCita, ControlMedico controlMedico, ControlAgenda controlAgenda, ControlPaciente controlPaciente, ControlAsiste controlAsiste) {
        this.controlCita = controlCita;
        this.controlMedico = controlMedico;
        this.controlPaciente = controlPaciente;
        this.controlAgenda = controlAgenda;
        this.controlAsiste = controlAsiste;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        FieldCedulaPaciente = new javax.swing.JTextField();
        ButtonAgregar = new javax.swing.JButton();
        ComboBoxHora = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        FieldCedulaMedico = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonConsultarDisponibilidad = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        DateChooser = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setIconifiable(true);
        setTitle("Agregar cita");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Cédula paciente");

        jLabel4.setText("Elegir hora");

        FieldCedulaPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldCedulaPacienteActionPerformed(evt);
            }
        });

        ButtonAgregar.setText("Agregar");
        ButtonAgregar.setEnabled(false);
        ButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgregarActionPerformed(evt);
            }
        });

        ComboBoxHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxHoraActionPerformed(evt);
            }
        });

        jButton1.setText("Restaurar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ComboBoxHora, 0, 121, Short.MAX_VALUE)
                            .addComponent(FieldCedulaPaciente))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ButtonAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(34, 34, 34))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(FieldCedulaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ComboBoxHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonAgregar)
                    .addComponent(jButton1))
                .addGap(18, 18, 18))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Cédula médico");

        jButtonConsultarDisponibilidad.setText("Consultar horas disponibles");
        jButtonConsultarDisponibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarDisponibilidadActionPerformed(evt);
            }
        });

        jLabel3.setText("Fecha");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(FieldCedulaMedico)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButtonConsultarDisponibilidad)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(FieldCedulaMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jButtonConsultarDisponibilidad)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FieldCedulaPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldCedulaPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldCedulaPacienteActionPerformed

    private void ButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgregarActionPerformed
        // TODO add your handling code here:        
        String id_paciente = this.FieldCedulaPaciente.getText().trim();
        if (id_paciente.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese la cédula del paciente que pide la cita");
        } else if (!controlPaciente.verificarExistencia(id_paciente)) {
            JOptionPane.showMessageDialog(this, "No existe un paciente con esa cédula");
        } else if (this.ComboBoxHora.getSelectedItem()==null){
            JOptionPane.showMessageDialog(this, "No hay horas disponibles para ese día, por favor elija otro");
        } else {
            int precio = controlAsiste.generarPrecioCita(id_paciente);
            String hora = (String) this.ComboBoxHora.getSelectedItem();
            String id_medico = this.FieldCedulaMedico.getText().trim();
            String mensaje_cita = controlCita.insertarCita(id_medico, id_paciente, this.fecha, hora, precio);
            if (mensaje_cita.equals("Cita creada exitosamente")) {
                controlAgenda.actualizarAgenda(id_medico, this.fecha, hora);
                JOptionPane.showMessageDialog(this, "El precio de la cita es de " + precio);
                this.ButtonAgregar.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(this, mensaje_cita);
            }
        }
    }//GEN-LAST:event_ButtonAgregarActionPerformed

    private void jButtonConsultarDisponibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarDisponibilidadActionPerformed
        // TODO add your handling code here:
        try {
            String id_medico = this.FieldCedulaMedico.getText().trim();
            Date fecha = this.DateChooser.getDate();
            LocalDate fechaLocal = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate actual = LocalDate.now();

            if (fechaLocal.getDayOfWeek().toString().equals("SUNDAY")) {
                JOptionPane.showMessageDialog(this, "Los medicos no se encuentran disponibles los domingos");
            } else if (fechaLocal.isBefore(actual) || fechaLocal.isEqual(actual)) {
                JOptionPane.showMessageDialog(this, "Asegúrese de elegir un día posterior al actual");
            } else if (id_medico.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese la cédula del médico con el que quiere la cita");
            } else if (!controlMedico.verificarExistencia(id_medico)) {
                JOptionPane.showMessageDialog(this, "No existe un médico con esa cédula");
            } else {
                String dia_cita = String.valueOf(fechaLocal.getDayOfMonth());
                String mes_cita = String.valueOf(fechaLocal.getMonthValue());
                String anio_cita = String.valueOf(fechaLocal.getYear());
                String fecha_cita = dia_cita + "-" + mes_cita + "-" + anio_cita;
                this.fecha = fecha_cita;

                this.refrescarHorarios(id_medico, fecha_cita);
                this.ButtonAgregar.setEnabled(true);
                this.jButtonConsultarDisponibilidad.setEnabled(false);
                this.FieldCedulaMedico.setEditable(false);
                this.DateChooser.setEnabled(false);
            }

        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(this, "Seleccione una fecha");
        }

    }//GEN-LAST:event_jButtonConsultarDisponibilidadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:        
        this.FieldCedulaMedico.setEditable(true);
        this.FieldCedulaMedico.setText("");
        this.DateChooser.setDate(null);
        this.DateChooser.setEnabled(true);
        this.jButtonConsultarDisponibilidad.setEnabled(true);
        this.ButtonAgregar.setEnabled(false);
        this.FieldCedulaPaciente.setText("");
        this.ComboBoxHora.removeAllItems();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ComboBoxHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxHoraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAgregar;
    private javax.swing.JComboBox<String> ComboBoxHora;
    private com.toedter.calendar.JDateChooser DateChooser;
    private javax.swing.JTextField FieldCedulaMedico;
    private javax.swing.JTextField FieldCedulaPaciente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonConsultarDisponibilidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    public void refrescarHorarios(String id_medico, String fecha) {
        ArrayList horas = controlAgenda.consultarAgenda(id_medico, fecha);
        this.ComboBoxHora.removeAllItems();
        for (int i = 0; i < horas.size(); i++) {
            this.ComboBoxHora.addItem((String) horas.get(i));            
        }
    }

}
