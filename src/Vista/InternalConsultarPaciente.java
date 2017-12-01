/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Controlador.ControlPersona;
import Controlador.ControlPaciente;
import javax.swing.JOptionPane;
/**
 *
 * @author Luis
 */
public class InternalConsultarPaciente extends javax.swing.JInternalFrame {
    ControlPersona controlPersona;
    ControlPaciente controlPaciente;    
    /**
     * Creates new form InternalBuscarPaciente
     */
    public InternalConsultarPaciente(ControlPaciente controlPaciente, ControlPersona controlPersona) {
        this.controlPersona = controlPersona;
        this.controlPaciente = controlPaciente;
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
        ButtonConsultarPaciente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Consultar paciente");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Ingrese la cedula del paciente que desea consultar");

        ButtonConsultarPaciente.setText("Consultar");
        ButtonConsultarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonConsultarPacienteActionPerformed(evt);
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
                    .addComponent(FieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonConsultarPaciente))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonConsultarPaciente)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        TextArea.setEditable(false);
        TextArea.setColumns(20);
        TextArea.setRows(5);
        jScrollPane1.setViewportView(TextArea);

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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonConsultarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonConsultarPacienteActionPerformed
        // TODO add your handling code here:
        try {
            if (this.FieldCedula.getText().trim().isEmpty()) {
                JOptionPane.showInternalMessageDialog(this, "Ingrese la cédula del paciente", "Atención", JOptionPane.WARNING_MESSAGE);
            } else {
                String cedula = this.FieldCedula.getText().trim();
                String consulta = "";
                String[] paciente = controlPaciente.consultarPaciente(cedula);
                if (paciente == null) {
                    consulta = "No existe un paciente con esa cédula en el hospital";
                } else {
                    String[] persona = controlPersona.consultarPersona(cedula);
                    
                    consulta = "DATOS PESONALES\nNombre: " + persona[1] + "\nDirección: " + persona[2] + "\nTeléfono: " + persona[3]
                            + "\n\nDATOS DEL PACIENTE\nNúmero de historia: " + paciente[1] + "\nSeguridad social: " + paciente[2] + 
                            "\nFecha de nacimiento: " + paciente[3] + "\nActividad econónica: " + paciente[4];
                }
                this.TextArea.setText(consulta);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());                   
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error desde la vista");
        }
    }//GEN-LAST:event_ButtonConsultarPacienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonConsultarPaciente;
    private javax.swing.JTextField FieldCedula;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
