/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Controlador.ControlCampana;
import Controlador.ControlMedico;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
/**
 *
 * @author Luis
 */
public class InternalAgregarCampana extends javax.swing.JInternalFrame {
    ControlCampana controlCampana;
    ControlMedico controlMedico;
    /**
     * Creates new form InternalAgregarCampana
     */
    public InternalAgregarCampana(ControlCampana controlCampana, ControlMedico controlMedico) {
        this.controlCampana = controlCampana;
        this.controlMedico = controlMedico;
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
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaDescripcion = new javax.swing.JTextArea();
        ButtonAgregar = new javax.swing.JButton();
        FieldCodigo = new javax.swing.JTextField();
        FieldNombre = new javax.swing.JTextField();
        DateChooser = new com.toedter.calendar.JDateChooser();
        FieldCedulaEncargado = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Agregar campaña");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Código");

        jLabel2.setText("Nombre");

        jLabel3.setText("Fecha");

        jLabel4.setText("Cédula encargado");

        jLabel5.setText("Descripción");

        TextAreaDescripcion.setColumns(20);
        TextAreaDescripcion.setRows(5);
        jScrollPane1.setViewportView(TextAreaDescripcion);

        ButtonAgregar.setText("Agregar");
        ButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(ButtonAgregar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FieldCodigo)
                            .addComponent(FieldNombre)
                            .addComponent(DateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(FieldCedulaEncargado)))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(FieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(FieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(FieldCedulaEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonAgregar)
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

    private void ButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgregarActionPerformed
        // TODO add your handling code here:
        try {
            if (this.FieldCedulaEncargado.getText().trim().isEmpty() || this.FieldCodigo.getText().trim().isEmpty() ||
                this.FieldNombre.getText().trim().isEmpty() || this.TextAreaDescripcion.getText().trim().isEmpty()) {
                JOptionPane.showInternalMessageDialog(this, "Existen casillas vacias.", "Atención", JOptionPane.WARNING_MESSAGE);
            } else {
                String ced_medico = this.FieldCedulaEncargado.getText();               

                if (!controlMedico.verificarExistencia(ced_medico)) {
                    JOptionPane.showMessageDialog(this, "No existe un médico con esa cédula");
                } else {
                    String codigo = this.FieldCodigo.getText();
                    String nombre = this.FieldNombre.getText();
                    String descripcion = this.TextAreaDescripcion.getText();
                    
                    LocalDate fecha = this.DateChooser.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                    String dia = String.valueOf(fecha.getDayOfMonth());
                    String mes = String.valueOf(fecha.getMonthValue());
                    String anio = String.valueOf(fecha.getYear());
                    String fecha_campana = dia + "-" + mes + "-" + anio;                  

                    JOptionPane.showMessageDialog(this, controlCampana.insertarCampana(codigo, nombre, descripcion, fecha_campana, ced_medico));
                }
            }
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(this, "Seleccione la fecha");
        }
    }//GEN-LAST:event_ButtonAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAgregar;
    private com.toedter.calendar.JDateChooser DateChooser;
    private javax.swing.JTextField FieldCedulaEncargado;
    private javax.swing.JTextField FieldCodigo;
    private javax.swing.JTextField FieldNombre;
    private javax.swing.JTextArea TextAreaDescripcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
