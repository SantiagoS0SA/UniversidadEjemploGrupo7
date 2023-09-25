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
import java.util.ArrayList;
import java.util.List;


import javax.swing.JOptionPane;
import universidadejemplo.Entidades.*;
import universidadejemplo.Entidades.Inscripcion;

/**
 *
 * @author sergi y juan Ignacio
 */
public class InscripcionData {
    private Connection con = null;
    private MateriaData mateData = new MateriaData();
    private AlumnoData alumData = new AlumnoData();

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
    
    public List<Inscripcion> obtenerInscripciones(){
        
        ArrayList<Inscripcion> cursadas = new ArrayList<>();
    
        String sql = "SELECT * FROM inscripción";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            
                Inscripcion insc = new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripto"));insc.setNota(rs.getDouble("nota"));
                Alumno alu = alumData.obtenerAlumnoPorId(rs.getInt("idAlumno"));
                Materia mate = mateData.buscarMateria(rs.getInt("idMateria"));
                insc.setAlumno(alu);
                insc.setMateria(mate);
                insc.setNota(rs.getDouble("nota"));
                cursadas.add(insc);
            }
            ps.close();
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla al Inscripcion"+ ex);
        }
        return cursadas;
    }
    
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno){
        
        ArrayList<Inscripcion> cursadas = new ArrayList<>();
    
        String sql = "SELECT * FROM inscripción WHERE idAlumno = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            
                Inscripcion insc = new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripto"));insc.setNota(rs.getDouble("nota"));
                Alumno alu = alumData.obtenerAlumnoPorId(rs.getInt("idAlumno"));
                Materia mate = mateData.buscarMateria(rs.getInt("idMateria"));
                insc.setAlumno(alu);
                insc.setMateria(mate);
                insc.setNota(rs.getDouble("nota"));
                cursadas.add(insc);
            }
            ps.close();
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla al Inscripcion"+ ex);
        }
        return cursadas;
    }
    
    public List<Materia> obtenerMateriaCursadas(int idAlumno){
    
        ArrayList<Materia> materia = new ArrayList<>();
        
        String sql = "SELECT inscripción.idMateria, nombre, año FROM inscripción, "
                + " materia WHERE inscripción.idMateria = materia.idMateria"
                + " AND inscripción.idAlumno = ?;";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            
                Materia mate = new Materia();
                
                mate.setIdMateria(rs.getInt("idMateria"));
                mate.setNombre(rs.getString("nombre"));
                mate.setAnioMateria(rs.getInt("año"));
                materia.add(mate);
            
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla al Inscripcion"+ ex);
        }
        return materia;
    
    }
    
    public List<Materia> obtenerMateriasNoCursadas(int idAlumno){
    
        ArrayList<Materia> materias =new ArrayList<>();
        
        String sql = "SELECT * FROM materia WHERE estado = 1 AND idMateria NOT IN "
                + " (SELECT idMateria FROM inscripción WHERE idAlumno = ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            
                Materia mate = new Materia();
                
                mate.setIdMateria(rs.getInt("idMateria"));
                mate.setNombre(rs.getString("nombre"));
                mate.setAnioMateria(rs.getInt("año"));
                materias.add(mate);
            
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla al Inscripcion"+ ex);
        }
        return materias;
    }
    
    public List<Alumno> obtenerAlumnoPorMateria(int idMateria){
    
        ArrayList <Alumno> alumnosMateria = new ArrayList<>();
        
        String sql = "SELECT a.idAlumno, dni, nombre, apellido, fechaNacimiento, estado "
                + "FROM inscripción i,alumno a WHERE i.idAlumno = a.idAlumno AND idMateria = ? AND a.estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            
                Alumno alu = new Alumno();
                alu.setIdAlumno(rs.getInt("idAlumno"));
                alu.setDni(rs.getInt("dni"));
                alu.setApellido(rs.getString("apellido"));
                alu.setNombre(rs.getString("nombre"));
                alu.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alu.setActivo(rs.getBoolean("estado"));
                
                alumnosMateria.add(alu);
            
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla al Inscripcion"+ ex);
        }
        
        return alumnosMateria;
    }
    
}
