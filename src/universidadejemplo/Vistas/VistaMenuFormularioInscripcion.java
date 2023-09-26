/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo.Vistas;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadejemplo.AccesoaDatos.AlumnoData;
import universidadejemplo.AccesoaDatos.Conexion;
import universidadejemplo.AccesoaDatos.InscripcionData;
import universidadejemplo.AccesoaDatos.MateriaData;
import universidadejemplo.Entidades.Alumno;
import universidadejemplo.Entidades.Inscripcion;
import universidadejemplo.Entidades.Materia;

/**
 *
 * @author Pc
 */
public class VistaMenuFormularioInscripcion extends javax.swing.JInternalFrame {
    Conexion con= new Conexion();
    private ArrayList<Materia> listaM;
    private ArrayList<Alumno> listaA;
    
    private InscripcionData inscData;
    private MateriaData mData;
    private AlumnoData aData;
    
    private DefaultTableModel modelo;
    /**
     * Creates new form VistaMenuFormularioInscripcion
     */
    public VistaMenuFormularioInscripcion() {
        //cargarComb("alumnos","dni",jcbListaAlumnos);
        initComponents();
        aData = new AlumnoData();
        listaA = (ArrayList<Alumno>)aData.listarAlumnos();
        modelo = new DefaultTableModel();
        inscData = new InscripcionData();
        mData = new MateriaData();
        
        cargaAlumnos();
        armarCabeceraTabla();
        jAnularInscripcion.setEnabled(false);
        jInscribir.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMateriasInscrip = new javax.swing.JRadioButton();
        jMateriasNoInscrip = new javax.swing.JRadioButton();
        jInscribir = new javax.swing.JButton();
        jAnularInscripcion = new javax.swing.JButton();
        jSalirMF = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jcbListaAlumnos = new javax.swing.JComboBox<>();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenuItem1.setText("jMenuItem1");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setBackground(new java.awt.Color(204, 204, 204));
        setForeground(new java.awt.Color(0, 153, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("Formulario de Inscripcion");

        jLabel2.setText("Seleccione un alumno:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("Listado de Materias");

        jMateriasInscrip.setText("Materias Inscriptas");
        jMateriasInscrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMateriasInscripActionPerformed(evt);
            }
        });

        jMateriasNoInscrip.setText("Materias no Inscriptas");
        jMateriasNoInscrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMateriasNoInscripActionPerformed(evt);
            }
        });

        jInscribir.setText("Inscribir");
        jInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInscribirActionPerformed(evt);
            }
        });

        jAnularInscripcion.setText("Anular Inscripcion");
        jAnularInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAnularInscripcionActionPerformed(evt);
            }
        });

        jSalirMF.setText("Salir");
        jSalirMF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirMFActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jcbListaAlumnos.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jcbListaAlumnosComponentAdded(evt);
            }
        });
        jcbListaAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbListaAlumnosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jInscribir)
                        .addGap(68, 68, 68)
                        .addComponent(jAnularInscripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSalirMF)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jMateriasInscrip)
                        .addGap(50, 50, 50)
                        .addComponent(jMateriasNoInscrip))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addComponent(jLabel1))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(20, 20, 20))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(33, 33, 33)
                                    .addComponent(jcbListaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbListaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jMateriasInscrip)
                    .addComponent(jMateriasNoInscrip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jInscribir)
                    .addComponent(jAnularInscripcion)
                    .addComponent(jSalirMF))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMateriasInscripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMateriasInscripActionPerformed
    
        borrarFilaTabla();
        jMateriasNoInscrip.setSelected(false);
        cargaDatosInscriptas();
        jAnularInscripcion.setEnabled(true);
        jInscribir.setEnabled(false);
    }//GEN-LAST:event_jMateriasInscripActionPerformed

    private void jcbListaAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbListaAlumnosActionPerformed
        
    }//GEN-LAST:event_jcbListaAlumnosActionPerformed

    private void jcbListaAlumnosComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jcbListaAlumnosComponentAdded
        
    }//GEN-LAST:event_jcbListaAlumnosComponentAdded

    private void jSalirMFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirMFActionPerformed
        
        dispose();
    }//GEN-LAST:event_jSalirMFActionPerformed

    private void jMateriasNoInscripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMateriasNoInscripActionPerformed
        
        borrarFilaTabla();
        jMateriasInscrip.setSelected(false);
        cargaDatosNoInscriptas();
        jInscribir.setEnabled(true);
        jAnularInscripcion.setEnabled(false);
    }//GEN-LAST:event_jMateriasNoInscripActionPerformed

    private void jInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInscribirActionPerformed
        int filaSeleccionada=jTable1.getSelectedRow();
        if(filaSeleccionada!=-1){
            Alumno a=(Alumno)jcbListaAlumnos.getSelectedItem();
            
            int idMateria=(Integer)modelo.getValueAt(filaSeleccionada,0);
            String nombre=(String)modelo.getValueAt(filaSeleccionada,1);
            int año=(int)modelo.getValueAt(filaSeleccionada,2);
            Materia m=new Materia(idMateria,nombre,año,true);
            
            Inscripcion i=new Inscripcion(0,a,m);
            inscData.guardarinscripcion(i);
            borrarFilaTabla();
        }
        
    }//GEN-LAST:event_jInscribirActionPerformed

    private void jAnularInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAnularInscripcionActionPerformed
        int filaSeleccionada=jTable1.getSelectedRow();
        if(filaSeleccionada!=-1){
            Alumno a=(Alumno)jcbListaAlumnos.getSelectedItem();
            
            int idMateria=(Integer)modelo.getValueAt(filaSeleccionada,0);
            inscData.borrarInscriptoMateriaAlumno(a.getIdAlumno(),idMateria);
            borrarFilaTabla();
        }
    }//GEN-LAST:event_jAnularInscripcionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAnularInscripcion;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JButton jInscribir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JRadioButton jMateriasInscrip;
    private javax.swing.JRadioButton jMateriasNoInscrip;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JButton jSalirMF;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<Alumno> jcbListaAlumnos;
    // End of variables declaration//GEN-END:variables

    private void cargaAlumnos() {
        for(Alumno item: listaA){
            jcbListaAlumnos.addItem(item);
        }
    }

    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("Nombre");
        filaCabecera.add("Año");
        for(Object it: filaCabecera){
            modelo.addColumn(it);
        }
        jTable1.setModel(modelo);
    }

    private void borrarFilaTabla(){
        int indice = modelo.getRowCount() -1;
        
        for (int i = indice;i>=0;i--){
            modelo.removeRow(i);
        }
    }
    
    private void cargaDatosNoInscriptas(){
        //borrarFilaTabla();
        Alumno selec = (Alumno)jcbListaAlumnos.getSelectedItem();
        listaM = (ArrayList<Materia>) inscData.obtenerMateriasNoCursadas(selec.getIdAlumno());
        for(Materia m: listaM){
            modelo.addRow(new Object[] {m.getIdMateria(), m.getNombre(), m.getAnioMateria()});
        }
    }
    
    private void cargaDatosInscriptas(){
        //borrarFilaTabla();
        Alumno selec= (Alumno)jcbListaAlumnos.getSelectedItem();
        listaM = (ArrayList<Materia>) inscData.obtenerMateriaCursadas(selec.getIdAlumno());
        for(Materia m: listaM){
            modelo.addRow(new Object[] {m.getIdMateria(), m.getNombre(), m.getAnioMateria()});
        }
    }
}
