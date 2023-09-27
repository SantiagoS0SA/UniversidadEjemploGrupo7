package universidadejemplo.Vistas;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadejemplo.AccesoaDatos.AlumnoData;
import universidadejemplo.AccesoaDatos.Conexion;
import universidadejemplo.AccesoaDatos.InscripcionData;
import universidadejemplo.AccesoaDatos.MateriaData;
import universidadejemplo.Entidades.Alumno;
import universidadejemplo.Entidades.Inscripcion;
import universidadejemplo.Entidades.Materia;

public class VistaMenuActualizacionNotas extends javax.swing.JInternalFrame {

    Conexion con= new Conexion();
    private ArrayList<Materia> listaM;
    private ArrayList<Alumno> listaA;
    
    private InscripcionData inscData;
    private MateriaData mData;
    private AlumnoData aData;
    
   private DefaultTableModel modelo = new DefaultTableModel(){
        
        @Override
        public boolean isCellEditable(int fila, int columna){
            if(columna == 2) {
                return true;
            }
            return false;
        }
    
    };

    public VistaMenuActualizacionNotas() {
        initComponents();
        aData = new AlumnoData();
        listaA = (ArrayList<Alumno>)aData.listarAlumnos();
        
        inscData = new InscripcionData();
        mData = new MateriaData();
        
        cargaAlumnos();
        armarCabeceraTabla();
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jnotas = new javax.swing.JTable();
        jGuardarN = new javax.swing.JButton();
        jSalirM = new javax.swing.JButton();
        jcbListaAlumnos = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(0, 102, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("Carga de notas");

        jLabel2.setText("Seleccione un alumno:");

        jnotas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jnotas);

        jGuardarN.setText("Guardar");
        jGuardarN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarNActionPerformed(evt);
            }
        });

        jSalirM.setText("Salir");
        jSalirM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirMActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcbListaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jGuardarN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addComponent(jSalirM)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbListaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jGuardarN)
                    .addComponent(jSalirM))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSalirMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirMActionPerformed
           dispose();
    }//GEN-LAST:event_jSalirMActionPerformed

    private void jcbListaAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbListaAlumnosActionPerformed
        // TODO add your handling code here:
        cargaDatosInscriptas();
    }//GEN-LAST:event_jcbListaAlumnosActionPerformed

    private void jGuardarNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarNActionPerformed
        // TODO add your handling code here:
        Materia nuevaNota = new Materia();
        nuevaNota.getIdMateria();
        
        Actualizardatos();
    }//GEN-LAST:event_jGuardarNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jGuardarN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jSalirM;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Alumno> jcbListaAlumnos;
    private javax.swing.JTable jnotas;
    // End of variables declaration//GEN-END:variables

    private void cargaAlumnos() {
        for(Alumno item: listaA){
            jcbListaAlumnos.addItem(item);
        }
    }

    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("Codigo");
        filaCabecera.add("Nombre");
        filaCabecera.add("Nota");
        for(Object it: filaCabecera){
            modelo.addColumn(it);
        }
        jnotas.setModel(modelo);
    }
    
    private void cargaDatosInscriptas(){
        //borrarFilaTabla();
        Alumno selec= (Alumno)jcbListaAlumnos.getSelectedItem();
        modelo.setRowCount(0);
        
        listaM = (ArrayList<Materia>) inscData.obtenerMateriaCursadas(selec.getIdAlumno());
        
        if(!listaM.isEmpty()){
            for(Materia m: listaM){
                modelo.addRow(new Object[] {m.getIdMateria(), m.getNombre(), m.getI().getNota()});
            }
        }else{
            JOptionPane.showMessageDialog(null, "Alumno Seleccionado, pero no esta inscripto en la ninguna materia");
        
        }
    }
    
    public void Actualizardatos(){
        int fila = jnotas.getSelectedRow();
        
        if(fila <0 || fila>= jnotas.getRowCount()){
            System.out.println("mal");
        
        }
        
        int idmateria = (int) jnotas.getValueAt(fila, 0);
        
        Materia mat = mData.buscarMateria(idmateria);
        Alumno selec = (Alumno) jcbListaAlumnos.getSelectedItem();
        double nto = Double.parseDouble(jnotas.getValueAt(fila, 2).toString());
        
        try {
            Inscripcion ins = new Inscripcion();
            
            ins.setNota(nto);
            ins.setAlumno(aData.obtenerAlumnoPorId(selec.getIdAlumno()));
            ins.setMateria(mat);
            
           int idAlumno = selec.getIdAlumno();

            inscData.actualizarNotas(idAlumno, idmateria, nto);
       
            jnotas.setValueAt(nto, fila, 2);
            
            JOptionPane.showMessageDialog(null, "nota del alumno: "+ selec.getApellido()+ " fue Actualizada con exito");

        } catch (ClassCastException e) {
        JOptionPane.showMessageDialog(null, "Error al actualizar la nota: " + e.getLocalizedMessage());
        } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Error: la nota ingresada debe ser un número válido");
        } catch (NullPointerException e) {
        JOptionPane.showMessageDialog(null, "Error: la materia no pudo ser encontrada en la base de datos");
        }
    }
}
