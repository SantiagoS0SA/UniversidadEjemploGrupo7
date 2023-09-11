
package universidadejemplo.AccesoaDatos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadejemplo.Entidades.Alumno;

/**
 *
 * @author Usuario
 */
public class AlumnoData {
    private Connection con = null;
    
    public AlumnoData(){
    
        con = Conexion.getConexion();
        
    }
    
    public void guardarAlumno(Alumno alumno){
        
        String squl = "INSERT INTO alumnos (dni, apellido,nombre, fechaNacimiento,estado)"
                + "VALUES (?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(squl, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(5, alumno.isActivo());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
            
                alumno.setIdAlumno(rs.getInt(1));
                
                JOptionPane.showMessageDialog(null,"Alumno agregado"+ rs);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla al Alumno"+ ex);
        }
        
    }
   
    public void modificarAlumno(Alumno alumno){
    
        String sql = "UPDATE alumnos SET dni= ?, apellido= ?, nombre= ?,fechaNacimiento= ?"
                + "WHERE idAlumno=?";
    
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setInt(5, alumno.getIdAlumno());
            
            int exito = ps.executeUpdate();
            
            if(exito==1){
                JOptionPane.showMessageDialog(null,"Alumno Modificado"+ps);
            }
            
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla al Alumno"+ ex);
        }
    }
    
    public void eliminarAlumno(int id){
        String sql = "UPDATE alumnos SET estado = 0 WHERE idAlumno = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito =ps.executeUpdate();
            
            if (exito ==1) {
                JOptionPane.showMessageDialog(null, "Alumno Borrado");
            }
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla al Alumno"+ ex);
        }
    
    }
    
    
}
