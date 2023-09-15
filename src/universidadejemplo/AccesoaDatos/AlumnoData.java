
package universidadejemplo.AccesoaDatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
    
    public Alumno buscarAlumno(int id){
        Alumno alumno=null;
        
        String sql="SELECT dni,apellido,nombre,FechaNac FROM alumno WHERE idAlumno=? AND estado=1";
        
        PreparedStatement ss=null;
        
        try {
            ss=con.prepareStatement(sql);
            ss.setInt(1,id);
            ResultSet rs=ss.executeQuery();
            
            if (rs.next()){
                alumno=new Alumno();
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("FechaNac").toLocalDate());
                alumno.setActivo(true);
            }else{
                JOptionPane.showMessageDialog(null,"No existe el alumno");
                ss.close();
            }
        } catch (SQLException xx){
            JOptionPane.showMessageDialog(null,"Error alacceder a la tabla alumno "+xx.getMessage());
        }
        return alumno;
    }

    public Alumno buscarAlumnoDni(int dni){
        Alumno alumna=null;
        
        String sql="SELECT idAlumno,dni,apellido,nombre,FechaNac FROM alumno WHERE dni=? AND estado=1";
        
        PreparedStatement ss=null;
        
        try {
            ss=con.prepareStatement(sql);
            ss.setInt(1,dni);
            ResultSet rs=ss.executeQuery();
            
            if (rs.next()){
                alumna=new Alumno();
                alumna.setIdAlumno(rs.getInt("idAlumno"));
                alumna.setDni(rs.getInt("dni"));
                alumna.setApellido(rs.getString("apellido"));
                alumna.setNombre(rs.getString("nombre"));
                alumna.setFechaNac(rs.getDate("FechaNac").toLocalDate());
                alumna.setActivo(true);
            }else{
                JOptionPane.showMessageDialog(null,"No existe el alumno");
                ss.close();
            }
        } catch (SQLException xx){
            JOptionPane.showMessageDialog(null,"Error alacceder a la tabla alumno "+xx.getMessage());
        }
        return alumna;
    }
/*
    public List[Alumno] listarAlumnos(){
        List[Alumno] alumnos = new ArrayList[]();
        try {
            String sql="SELECT * FROM alumno Where activo=1";
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                Alumno alumn=new Alumno();
                alumn.setIdAlumno(rs.getInt("idAlumno"));
                alumn.setDni(rs.getInt("dni"));
                alumn.setApellido(rs.getString("apellido"));
                alumn.setNombre(rs.getString("nombre"));
                alumn.setFechaNac(rs.getDate("FechaNac").toLocalDate());
                alumn.setActivo(rs.getBoolean("activo"));
                alumnos.add(alumn);
            }
            ps.close();
        }catch (SQLException exe){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia"+exe.getMessage());
        }
        return alumnos;
        }
  */  
   
    public void modificarAlumno(Alumno alumno){
    
        String sql = "UPDATE alumnos SET dni= ?, apellido= ?, nombre= ?,fechaNacimiento= ?, estado = ?"
                + " WHERE idAlumno=?";
    
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(5, alumno.isActivo());
            ps.setInt(6, alumno.getIdAlumno());
            
            
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
