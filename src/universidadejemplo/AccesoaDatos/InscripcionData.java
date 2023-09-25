/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo.AccesoaDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadejemplo.Entidades.Inscripcion;

/**
 *
 * @author sergi
 */
public class InscripcionData {
    private Connection con = null;
    private MateriaData matData;
    private AlumnoData aluData;

    public InscripcionData() {
        con = Conexion.getConexion();
    }
    
    public void guardarinscripcion(Inscripcion insc){
        //PreparedStatement ps = null;
        //System.out.println(insc.toString());
        String sql = "INSERT INTO inscripción(nota, idAlumno, idMateria)"
                + " VALUES (?, ?, ?)";
        try {
            try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                ps.setDouble(1, insc.getNota());
                ps.setInt(2, insc.getAlumno().getIdAlumno());
                ps.setInt(3, insc.getMateria().getIdMateria());
                
                ps.executeUpdate();
                
                ResultSet rs = ps.getGeneratedKeys();
                
                if(rs.next()){
                    
                    insc.setIdInscripcion(rs.getInt(1));
                    
                    JOptionPane.showMessageDialog(null,"Inscripcion Registrada");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla al Inscripcion"+ ex);
        }/*finally{
            try{
                if(ps != null){
                    ps.close();
                }
                if(con != null){
                    String conCbCla = "SET FOREIGN_KEY_CHECKS=1;";
                    ps = con.prepareStatement(conCbCla);
                    ps.execute();
                    
                }
            }catch(SQLException e){
            
                 JOptionPane.showMessageDialog(null, "Error al reactivar las comprobaciones de clave externa: "+e);
            }
        
        }*/
        
    }
    
    public void actualizarNotas(int idAlumno, int idMateria, double nota){
    
        String sql = "UPDATE inscripción SET nota = ? WHERE idAlumno = ? and idMateria = ? ";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int fila = ps.executeUpdate();
            
            if(fila >0){
                
                JOptionPane.showMessageDialog(null, "Nota Actualizada");
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla al Inscripcion"+ ex);
        }
    }
    
    public void borrarInscriptoMateriaAlumno(int idAlumno, int idMateria){
    
        String sql = "DELETE FROM inscripción WHERE idAlumno = ? AND idMateria = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            
            int fila = ps.executeUpdate();
            
            if(fila >0){
                JOptionPane.showMessageDialog(null, "Fila eliminada con exito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla al Inscripcion"+ ex);
        }
    }
    
    
}
