/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControlAgenda;
import Controlador.ControlMedico;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis
 */
public class InternalConsultarAgendaMes extends javax.swing.JInternalFrame {
    VistaAdmin vistaAdmin;
    ControlAgenda controlAgenda;
    ControlMedico controlMedico;

    /**
     * Creates new form InternalConsultarAgendaMes
     */
    public InternalConsultarAgendaMes(ControlMedico controlMedico, ControlAgenda controlAgenda, VistaAdmin vistaAdmin) {
        this.controlAgenda = controlAgenda;
        this.controlMedico = controlMedico;
        this.vistaAdmin = vistaAdmin;
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
        FieldCedula = new javax.swing.JTextField();
        Calendar = new com.toedter.calendar.JCalendar();
        ButtonConsultarDia = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Consultar agenda del mes");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Ingrese la cédula del medico y el mes del que desea consultar la agenda");

        jLabel2.setText("Cédula");

        Calendar.setRequestFocusEnabled(false);
        Calendar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CalendarMouseClicked(evt);
            }
        });

        ButtonConsultarDia.setText("Consultar");
        ButtonConsultarDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonConsultarDiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Calendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ButtonConsultarDia))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(FieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Calendar, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonConsultarDia)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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

    private void ButtonConsultarDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonConsultarDiaActionPerformed
        String id_medico = this.FieldCedula.getText().trim();
        if (id_medico.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese la cédula del médico");
        } else if (!controlMedico.verificarExistencia(id_medico)) {
            JOptionPane.showMessageDialog(this, "No existe un médico con esa cédula");
        } else {
            Date fecha = this.Calendar.getDate();
            LocalDate fechaLocal = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            if (fechaLocal.getDayOfWeek().toString().equals("SUNDAY")) {
                JOptionPane.showMessageDialog(this, "Él medico no se encuentra disponible los domingos");
            } else {
                String fechaConsulta = Integer.toString(fechaLocal.getDayOfMonth()) + "-" + Integer.toString(fechaLocal.getMonthValue()) + "-" + Integer.toString(fechaLocal.getYear());
                String horas = "AGENDA DEL MÉDICO " + id_medico + " \n\nFecha: " + fechaConsulta + "\n";
                horas += controlAgenda.consultarAgendaMensual(id_medico, fechaConsulta);
                
                InternalShowAgenda showAgenda = new InternalShowAgenda(horas);
                
                this.vistaAdmin.showAgendaMes(showAgenda);
            }
        }

    }//GEN-LAST:event_ButtonConsultarDiaActionPerformed
   
    private void CalendarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalendarMouseClicked

    }//GEN-LAST:event_CalendarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonConsultarDia;
    private com.toedter.calendar.JCalendar Calendar;
    private javax.swing.JTextField FieldCedula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
