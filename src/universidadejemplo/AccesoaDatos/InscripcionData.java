/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo.AccesoaDatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

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
        String sql = "INSERT INTO inscripcion (alumno, materia, nota)"
                + "VALUES (?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, aluData.getDni());
            ps.setString(2, aluData.getApellido());
            ps.setString(3, aluData.getNombre());
            ps.setDate(4, matData.;
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
}
