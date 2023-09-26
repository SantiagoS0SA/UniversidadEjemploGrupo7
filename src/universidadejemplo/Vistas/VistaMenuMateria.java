package universidadejemplo.Vistas;

import javax.swing.JOptionPane;
import universidadejemplo.AccesoaDatos.MateriaData;
import universidadejemplo.Entidades.Materia;

public class VistaMenuMateria extends javax.swing.JInternalFrame {
private Materia materia= new Materia();
private MateriaData mat= new MateriaData() ;

    public VistaMenuMateria() {
        initComponents();
    }

       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlMateria = new javax.swing.JLabel();
        jlCodigo = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jlAnno = new javax.swing.JLabel();
        jlEstado = new javax.swing.JLabel();
        jbNuevo = new javax.swing.JButton();
        jbELiminar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jtCodigo = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtAnno = new javax.swing.JTextField();
        jrEstado = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(0, 102, 0));

        jlMateria.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlMateria.setText("Materia");

        jlCodigo.setText("Codigo:");

        jlNombre.setText("Nombre:");

        jlAnno.setText("Año:");

        jlEstado.setText("Estado:");

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbELiminar.setText("Eliminar");
        jbELiminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbELiminarActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jlMateria))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jbNuevo))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jlCodigo))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jlNombre))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jlAnno))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jlEstado)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrEstado)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jbELiminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtAnno))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbGuardar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbSalir))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jtCodigo)
                                        .addComponent(jtNombre))
                                    .addGap(23, 23, 23)
                                    .addComponent(jbBuscar))))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlMateria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCodigo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbBuscar)
                        .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlNombre)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlAnno)
                    .addComponent(jtAnno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlEstado)
                    .addComponent(jrEstado))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbELiminar)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        
         if (jtNombre.getText().isEmpty()|| jtAnno.getText().isEmpty() ){
             
           JOptionPane.showInternalMessageDialog(this, "los campos no deben estas vaciosssssssss");  
           return; 
         }  
         
         String nom=jtNombre.getText();
         int anno= Integer.parseInt(jtAnno.getText());
         if(!(jrEstado.isSelected())){
         JOptionPane.showMessageDialog(this, "Debe activar el estado de la materia");
         }else{
         boolean boton = jrEstado.isSelected();
         
         materia.setNombre(nom);
         materia.setAnioMateria(anno);
         materia.setActivo(boton);
            
         mat.guardarMateria(materia);
         
         limpiarDatos();
         
         }
             
            
        
                
        
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbELiminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbELiminarActionPerformed
    
    int codE=Integer.parseInt(jtCodigo.getText()); 
      
    mat.eliminarMateria(codE);
    
    limpiarDatos();
    }//GEN-LAST:event_jbELiminarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        try{
          int codigob= Integer.parseInt(jtCodigo.getText());
          Materia materiabuscada= mat.buscarMateria(codigob);
          if(materiabuscada.isActivo()){
        
             jtNombre.setText(materiabuscada.getNombre());
             jtAnno.setText(materiabuscada.getAnioMateria()+"");
           } else{
              JOptionPane.showMessageDialog(this, "La materia no existe en la Base de Datos");
             } 
        }catch(NumberFormatException nf){
           JOptionPane.showInternalMessageDialog(this, "el codigo a buscar debe ser un entero");
        } 
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        
        
        try{
          Integer codigo=Integer.parseInt(jtCodigo.getText());
          String nombre=jtNombre.getText();
          int anno=Integer.parseInt(jtAnno.getText());
          if( nombre.isEmpty()){
          
           JOptionPane.showInternalMessageDialog(this, "Los camops no deben estar vacios");
          
          }
          boolean estado=jrEstado.isSelected();
          
        }catch(NumberFormatException  nfe){
           
            JOptionPane.showInternalMessageDialog(this, "debe entrar un codido de materia");
        
        }
        
        Integer codigo=Integer.parseInt(jtCodigo.getText());
        if (jtCodigo.getText().isEmpty()){
        JOptionPane.showInternalMessageDialog(this, "debe entrar un codido de materia");
        limpiarDatos();
        return;
        
        }else{           
       
        
        Materia materiaModificada= new Materia();
        int cod=Integer.parseInt(jtCodigo.getText());
        String nombre=jtNombre.getText();
        int anno=Integer.parseInt(jtAnno.getText());
        boolean estado=jrEstado.isSelected();
                 
        materiaModificada.setNombre(nombre);
        materiaModificada.setAnioMateria(anno);
        materiaModificada.setActivo(estado);
        
        mat.modificarMateria(materiaModificada);
        limpiarDatos();
      }
           
               
               
    }//GEN-LAST:event_jbGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbELiminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlAnno;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlMateria;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JRadioButton jrEstado;
    private javax.swing.JTextField jtAnno;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables

private void limpiarDatos(){

  jtNombre.setText("");
  jtAnno.setText("");
  jrEstado.setSelected(false);
  jtCodigo.setText("");
}






}
