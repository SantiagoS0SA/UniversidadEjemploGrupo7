/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo.Vistas;

import java.awt.Color;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import universidadejemplo.AccesoaDatos.AlumnoData;
import universidadejemplo.Entidades.Alumno;

/**
 *
 * @author Pc
 */
public class VistaMenuAlumnos extends javax.swing.JInternalFrame {
    private Alumno alumno = new Alumno();
    private AlumnoData alu = new AlumnoData();
    /**
     * Creates new form VistaMenuAlumnos
     */
    public VistaMenuAlumnos() {
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

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jAgregar = new javax.swing.JButton();
        jEliminar = new javax.swing.JButton();
        jActualizar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jBuscar = new javax.swing.JButton();
        jDni = new javax.swing.JTextField();
        jApellido = new javax.swing.JTextField();
        jNombre = new javax.swing.JTextField();
        jBoolean = new javax.swing.JRadioButton();
        jDateN = new com.toedter.calendar.JDateChooser();
        jError = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jidAlumno = new javax.swing.JTextField();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setBackground(new java.awt.Color(0, 102, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("Alumno");

        jLabel2.setText("Documento:");

        jLabel3.setText("Apellido:");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Estado:");

        jLabel6.setText("Fecha de Nacimiento:");

        jAgregar.setText("Agregar");
        jAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgregarActionPerformed(evt);
            }
        });

        jEliminar.setText("Eliminar");

        jActualizar.setText("Actualizar");

        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jBuscar.setText("Buscar");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDniActionPerformed(evt);
            }
        });

        jError.setText("Errores encontrado : 0");

        jLabel7.setText("IdAlumno:");

        jLabel8.setText("Deseas buscar un alumno ? Ingresa su id");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jBoolean)
                                        .addComponent(jApellido)
                                        .addComponent(jNombre)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jError)
                                            .addGap(156, 156, 156))
                                        .addComponent(jDni)
                                        .addComponent(jidAlumno)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 266, Short.MAX_VALUE)
                        .addComponent(jActualizar)
                        .addGap(29, 29, 29)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBuscar)
                    .addComponent(jButton4))
                .addGap(77, 77, 77))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jAgregar)
                        .addGap(26, 26, 26)
                        .addComponent(jEliminar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jDateN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel4))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(174, 174, 174)
                            .addComponent(jLabel1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jidAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jAgregar)
                            .addComponent(jEliminar)
                            .addComponent(jActualizar)
                            .addComponent(jButton4)))
                    .addComponent(jBoolean))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgregarActionPerformed
        // TODO add your handling code here:
        try {
            int dni = Integer.parseInt(jDni.getText());
            String apellido = jApellido.getText();
            String nombre = jNombre.getText();
            boolean boton = jBoolean.isSelected();
            LocalDate fechaN = jDateN.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            
            if(alu.ValidacionDni(dni)){
                jError.setForeground(Color.RED);
                jError.setText("Errores encontrados: 1");
                
                jNombre.setText("");
                jApellido.setText("");
                jDateN.setDate(null);
                jDni.setText("");
            }else{
             alumno.setDni(dni);
            alumno.setApellido(apellido);
            alumno.setNombre(nombre);
            alumno.setFechaNac(fechaN);
            alumno.setActivo(boton);
            
            alu.guardarAlumno(alumno);
            
            jError.setForeground(Color.GREEN);
            jError.setText("No se encontro errores");
            
            
                jNombre.setText("");
                jApellido.setText("");
                jDateN.setDate(null);
                jDni.setText("");
           
            } 
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Numero de Dni no valido, profavor chequear el dni ingresado"+ e);
        }
      
        
       
    }//GEN-LAST:event_jAgregarActionPerformed

    private void jDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDniActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new VistaMenuAlumnos().dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        // TODO add your handling code here:
       try{
           int id = Integer.parseInt(jidAlumno.getText());
           Alumno alumn = alu.obtenerAlumnoPorId(id);
           
           if(alumn != null){
           
               jDni.setText(String.valueOf(alumn.getDni()));
               jApellido.setText(alumn.getApellido());
               jNombre.setText(alumn.getNombre());
               
               LocalDate fch = alumn.getFechaNac();
               Date fc = Date.from(fch.atStartOfDay(ZoneId.systemDefault()).toInstant());
               
               jDateN.setDate(fc);
               
               jBoolean.setSelected(alumn.isActivo());
               
           }else{
               JOptionPane.showMessageDialog(null, "Alumno no encontrado");
               
                jDni.setText("");
                jNombre.setText("");
                jApellido.setText("");
                jDateN.setDate(null);
                jBoolean.setSelected(false);
           }
       }catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "id no encontrado");
       }
    }//GEN-LAST:event_jBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jActualizar;
    private javax.swing.JButton jAgregar;
    private javax.swing.JTextField jApellido;
    private javax.swing.JRadioButton jBoolean;
    private javax.swing.JButton jBuscar;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateN;
    private javax.swing.JTextField jDni;
    private javax.swing.JButton jEliminar;
    private javax.swing.JLabel jError;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jNombre;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JTextField jidAlumno;
    // End of variables declaration//GEN-END:variables
}
