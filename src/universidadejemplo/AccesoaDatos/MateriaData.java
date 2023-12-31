/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo.AccesoaDatos;

import java.sql.Connection;
import java.util.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import universidadejemplo.Entidades.Materia;

/**
 *
 * @author sergi
 */
public class MateriaData {
    private Connection con = null;

    public MateriaData() {
        con = Conexion.getConexion();
    }
    
    public void guardarMateria(Materia materia){
        
        String sal = "INSERT INTO materia (nombre, año, estado)"
                + "VALUES (?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sal, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isActivo());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
            
                materia.setIdMateria(rs.getInt(1));
                
                JOptionPane.showMessageDialog(null,"Materia agregada");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla la materia");
        }
        
    }

    public Materia buscarMateria(int id){
        Materia materia=null;

        String sql="Select nombre,año FROM materia WHERE idMateria=? AND estado=1";

        PreparedStatement ps=null;
        
        try{
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs=ps.executeQuery();
            
            if (rs.next()){
                materia=new Materia();
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.setActivo(true);
                
                }else{
                    JOptionPane.showMessageDialog(null, "No existe el alumno");
                    ps.close();
                }
            //JOptionPane.showMessageDialog(null, materia.toString());
            }catch (SQLException ex){
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");

            }
            return materia;
    }

    public void modificarMateria(Materia materia){
        String sql = "UPDATE materia SET nombre= ?, año= ?, estado= ?"
                + " WHERE idMateria=?";
        
          try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isActivo());
            ps.setInt(4,materia.getIdMateria());
            
            
            int exito = ps.executeUpdate();
            
            if(exito == 1){
                JOptionPane.showMessageDialog(null,"Materia Modificada");
            }
            }catch (SQLException ee){
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
            }
    }

    public void eliminarMateria(int id){
        try {
            String sql= "UPDATE materia SET estado=0 WHERE idMateria=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila=ps.executeUpdate();
            
            if (fila==1){
                JOptionPane.showMessageDialog(null, "Se elimino la materia");
            }
            ps.close();
        }catch (SQLException xx){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
    }

    public List<Materia> listarMateria(){
        List<Materia> materias = new ArrayList<>();
        try {
            String sql="SELECT * FROM materia WHERE estado=1";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                Materia materia=new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.setActivo(rs.getInt("estado")==1);
                materias.add(materia);
            }
            ps.close();
        }catch (SQLException exe){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia"+exe.getMessage());
        }
    return materias;
    }
}

