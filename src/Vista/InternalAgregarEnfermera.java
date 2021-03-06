/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis
 */
public class InternalAgregarEnfermera extends javax.swing.JInternalFrame {

    ControlPersona controlPersona;
    ControlEmpleado controlEmpleado;
    ControlEnfermera controlEnfermera;

    /**
     * Creates new form InternalBorrarEnfermera
     */
    public InternalAgregarEnfermera(ControlEnfermera controlEnfermera, ControlEmpleado controlEmpleado, ControlPersona controlPersona) {
        this.controlEnfermera = controlEnfermera;
        this.controlEmpleado = controlEmpleado;
        this.controlPersona = controlPersona;
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
        FieldNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FieldCedula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        FieldDireccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        FieldTelefono = new javax.swing.JTextField();
        ButtonAgregarPersona = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        FieldCargo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        FieldSalario = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        FieldEmail = new javax.swing.JTextField();
        FieldCedulaJefe = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        FieldArea = new javax.swing.JTextField();
        ButtonAgregarEmpleado = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        FieldExperiencia = new javax.swing.JTextField();
        ButtonAgregarEnfermera = new javax.swing.JButton();

        setIconifiable(true);
        setTitle("Agregar enfermera");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos personales", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        FieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldNombreActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Cédula");

        jLabel3.setText("Dirección");

        jLabel4.setText("Teléfono");

        FieldTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldTelefonoActionPerformed(evt);
            }
        });

        ButtonAgregarPersona.setText("Registrar Datos Personales");
        ButtonAgregarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgregarPersonaActionPerformed(evt);
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
                        .addGap(24, 24, 24)
                        .addComponent(FieldNombre))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FieldTelefono)
                            .addComponent(FieldCedula)
                            .addComponent(FieldDireccion))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(ButtonAgregarPersona)
                .addGap(0, 88, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(FieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(FieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(FieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(FieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonAgregarPersona)
                .addGap(18, 18, 18))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos empleado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        jLabel9.setText("Cargo");

        FieldCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldCargoActionPerformed(evt);
            }
        });

        jLabel10.setText("Salario");

        FieldSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldSalarioActionPerformed(evt);
            }
        });

        jLabel11.setText("Email");

        FieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldEmailActionPerformed(evt);
            }
        });

        FieldCedulaJefe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldCedulaJefeActionPerformed(evt);
            }
        });

        jLabel12.setText("Cédula Jefe");

        jLabel13.setText("Código área");

        FieldArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldAreaActionPerformed(evt);
            }
        });

        ButtonAgregarEmpleado.setText("Registrar Datos Empleado");
        ButtonAgregarEmpleado.setEnabled(false);
        ButtonAgregarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgregarEmpleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FieldCedulaJefe))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FieldArea))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FieldEmail)
                            .addComponent(FieldSalario)
                            .addComponent(FieldCargo))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addComponent(ButtonAgregarEmpleado)
                .addGap(77, 77, 77))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(FieldCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(FieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(FieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(FieldArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(FieldCedulaJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonAgregarEmpleado)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos enfermera", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        jLabel5.setText("Años experiencia");

        ButtonAgregarEnfermera.setText("Registrar Datos Enfermera");
        ButtonAgregarEnfermera.setEnabled(false);
        ButtonAgregarEnfermera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgregarEnfermeraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FieldExperiencia)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(ButtonAgregarEnfermera)
                .addGap(43, 43, 43))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(FieldExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ButtonAgregarEnfermera)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldNombreActionPerformed

    private void FieldCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldCargoActionPerformed

    private void FieldSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldSalarioActionPerformed

    private void FieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldEmailActionPerformed

    private void FieldCedulaJefeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldCedulaJefeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldCedulaJefeActionPerformed

    private void FieldAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldAreaActionPerformed

    private void ButtonAgregarEnfermeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgregarEnfermeraActionPerformed
        // TODO add your handling code here:
        try {
            if (this.FieldExperiencia.getText().trim().isEmpty()) {
                JOptionPane.showInternalMessageDialog(this, "Ingreselos años de experiencia.", "Atención", JOptionPane.WARNING_MESSAGE);
            } else {
                String cedula = this.FieldCedula.getText();
                int exp = Integer.parseInt(this.FieldExperiencia.getText());

                String mensaje = controlEnfermera.insertarEnfermera(cedula, exp);
                JOptionPane.showMessageDialog(this, mensaje);
                if (mensaje.equals("Enfermera creada correctamente")) {
                    this.dispose();
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Asegurese de ingresar los años con formato numérico");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error al capturar los datos");
            System.out.println(e);
        }
    }//GEN-LAST:event_ButtonAgregarEnfermeraActionPerformed

    private void ButtonAgregarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgregarPersonaActionPerformed
        // TODO add your handling code here:
        try {
            if (this.FieldCedula.getText().trim().isEmpty() || this.FieldNombre.getText().trim().isEmpty()) {
                JOptionPane.showInternalMessageDialog(this, "Existen casillas vacias.", "Atención", JOptionPane.WARNING_MESSAGE);
            } else {
                String nombre = this.FieldNombre.getText();
                String cedula = this.FieldCedula.getText();
                String direccion = this.FieldDireccion.getText();
                String telefono = this.FieldTelefono.getText();

                String mensaje = controlPersona.insertarPersona(cedula, nombre, direccion, telefono);
                if (mensaje.equals("Persona creada correctamente")) {
                    this.ButtonAgregarEmpleado.setEnabled(true);
                    this.ButtonAgregarPersona.setEnabled(false);
                    this.FieldCedula.setEditable(false);
                }
                JOptionPane.showMessageDialog(this, mensaje);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error al capturar los datos");
            System.out.println(e);
        }
    }//GEN-LAST:event_ButtonAgregarPersonaActionPerformed

    private void ButtonAgregarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgregarEmpleadoActionPerformed
        // TODO add your handling code here:
        try {
            if (this.FieldCargo.getText().trim().isEmpty() || this.FieldSalario.getText().trim().isEmpty()
                    || this.FieldEmail.getText().trim().isEmpty() || this.FieldArea.getText().trim().isEmpty()) {
                JOptionPane.showInternalMessageDialog(this, "Existen casillas vacias.", "Atención", JOptionPane.WARNING_MESSAGE);
            } else {
                String cedula = this.FieldCedula.getText();

                String cargo = this.FieldCargo.getText();
                float salario = Float.parseFloat(this.FieldSalario.getText());
                String email = this.FieldEmail.getText();
                String area = this.FieldArea.getText();                
                String id_jefe;
                if (this.FieldCedulaJefe.getText().equals("")) {
                    id_jefe = null;
                } else {
                    id_jefe = this.FieldCedulaJefe.getText();
                }

                String mensaje = controlEmpleado.insertarEmpleado(cedula, cargo, salario, email, area, id_jefe);
                JOptionPane.showMessageDialog(this, mensaje);
                switch (mensaje) {
                    case "Empleado creado correctamente":
                        this.ButtonAgregarEmpleado.setEnabled(false);
                        this.ButtonAgregarEnfermera.setEnabled(true);
                        break;
                    case "Ya existe un empleado con esa cédula":
                        this.dispose();
                        break;
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Asegurese de ingresar un salario de tipo numérico");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error al capturar los datos");
            System.out.println(e);
        }
    }//GEN-LAST:event_ButtonAgregarEmpleadoActionPerformed

    private void FieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldTelefonoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAgregarEmpleado;
    private javax.swing.JButton ButtonAgregarEnfermera;
    private javax.swing.JButton ButtonAgregarPersona;
    private javax.swing.JTextField FieldArea;
    private javax.swing.JTextField FieldCargo;
    private javax.swing.JTextField FieldCedula;
    private javax.swing.JTextField FieldCedulaJefe;
    private javax.swing.JTextField FieldDireccion;
    private javax.swing.JTextField FieldEmail;
    private javax.swing.JTextField FieldExperiencia;
    private javax.swing.JTextField FieldNombre;
    private javax.swing.JTextField FieldSalario;
    private javax.swing.JTextField FieldTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
