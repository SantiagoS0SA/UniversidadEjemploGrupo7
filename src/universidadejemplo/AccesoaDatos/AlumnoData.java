
package universidadejemplo.AccesoaDatos;

import java.sql.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import universidadejemplo.Entidades.Alumno;

/**
 *
 * @author IgnacioBenavides
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
                
                JOptionPane.showMessageDialog(null,"Alumno agregado");
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
                JOptionPane.showMessageDialog(null,"Alumno Modificado");
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
    
    public boolean ValidacionDni(int dni){
    
    String sql = "SELECT COUNT(*) FROM alumnos WHERE dni = ?";
    
    try{
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, dni);
        ResultSet rs = ps.executeQuery();
        
        if(rs.next()){
            int count = rs.getInt(1);
            return count > 0;
        }
        
        
    }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla al Alumno");    
    }
    
    return  false;
    
    }
    
    public Alumno obtenerAlumnoPorId(int idAlumno){
    
        String sql = "SELECT * FROM alumnos WHERE idAlumno = ?";
        Alumno alumno = null;
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                int id = rs.getInt("idAlumno");
                int dni = rs.getInt("dni");
                String apellido = rs.getString("apellido");
                String nombre = rs.getString("nombre");
                Date fechaND = rs.getDate("fechaNacimiento");
                LocalDate fechaN = fechaND.toLocalDate();
                boolean estado = rs.getBoolean("estado");
                
                alumno = new Alumno();
                alumno.setIdAlumno(idAlumno);
                alumno.setDni(dni);
                alumno.setApellido(apellido);
                 alumno.setNombre(nombre);
                alumno.setFechaNac(fechaN);
                alumno.setActivo(estado);
                
            }
            
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla al Alumno");
        }
        return alumno;
    }
}
