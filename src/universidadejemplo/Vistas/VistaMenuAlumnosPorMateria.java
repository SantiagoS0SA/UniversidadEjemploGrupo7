/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo.Vistas;


import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadejemplo.AccesoaDatos.InscripcionData;
import universidadejemplo.AccesoaDatos.MateriaData;
import universidadejemplo.Entidades.*;

/**
 *
 * @author Pc
 */
public class VistaMenuAlumnosPorMateria extends javax.swing.JInternalFrame {
     private Materia mate = new Materia();
     private MateriaData materias = new MateriaData();
     private InscripcionData incs = new InscripcionData();
     
     private List<Materia> listaM;
     private List<Alumno> listaA;
     
     private DefaultTableModel modelo;
    /**
     * Creates new form VistaMenuAlumnosPorMateria
     */
    public VistaMenuAlumnosPorMateria() {
        
        initComponents();
        
        listaM = materias.listarMateria();
        modelo = new DefaultTableModel();
        CargarMateria();
        armarCabeceraTabla();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAlumnos = new javax.swing.JTable();
        jalumnoMs = new javax.swing.JButton();
        jMateria = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(0, 102, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("Listado de Alumnos por Materia");

        jLabel2.setText("Seleccione una materia:");

        jtAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtAlumnos);

        jalumnoMs.setText("Salir");
        jalumnoMs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jalumnoMsActionPerformed(evt);
            }
        });

        jMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMateriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addGap(72, 72, 72)
                                .addComponent(jMateria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabel1)))
                        .addGap(0, 153, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jalumnoMs)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jalumnoMs)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jalumnoMsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jalumnoMsActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jalumnoMsActionPerformed

    private void jMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMateriaActionPerformed
        // TODO add your handling code here:
        obteneralumnosdeMateriaElegida();
    }//GEN-LAST:event_jMateriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<Materia> jMateria;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jalumnoMs;
    private javax.swing.JTable jtAlumnos;
    // End of variables declaration//GEN-END:variables
    
    private void CargarMateria(){
        
        for(Materia mate : listaM){
        
        jMateria.addItem(mate);
        
        }
    }
    
    private void armarCabeceraTabla(){
    
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("DNI");
        filaCabecera.add("Apellido");
        filaCabecera.add("Nombre");
        
        for(Object it : filaCabecera){
        
            modelo.addColumn(it);
        }
        jtAlumnos.setModel(modelo);
    }
    
    private void obteneralumnosdeMateriaElegida(){
        Materia meteSeleccionada = (Materia)jMateria.getSelectedItem();// se obtiene una materia
        
         modelo.setRowCount(0); //limpia el modelo de la tabla actual
         
        if(meteSeleccionada != null){//verifica que si o si traiga una materia
             int idMateria = meteSeleccionada.getIdMateria();//se obtiene el idMateria
             listaA = incs.obtenerAlumnoPorMateria(idMateria);//se obtiene los alumnos inscriptos en dicha materia
             
            if(!listaA.isEmpty()){//cerifica que listaA no este vacia
               
                for(Alumno alumno : listaA){//se hace el recorrido para obtener todos los datos del alumno
            
                    modelo.addRow(new Object []{//se coloca en la tabla los datos del alumno
                
                        alumno.getIdAlumno(),
                        alumno.getDni(),
                        alumno.getApellido(),
                        alumno.getNombre()
                
                    });
                    
                }
                 
            }else{
                JOptionPane.showMessageDialog(null, "No hay alumnos inscriptos en esta materia");
            }
        }
    }
}
