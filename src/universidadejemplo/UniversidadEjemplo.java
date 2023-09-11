/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo;

import java.sql.*;
import java.time.LocalDate;
import java.time.Month;
import universidadejemplo.AccesoaDatos.AlumnoData;
import universidadejemplo.AccesoaDatos.Conexion;
import universidadejemplo.Entidades.Alumno;

/**
 *
 * @author Pc
 */
public class UniversidadEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Alumno juan = new Alumno(1,123123123,"Sanches","victor", LocalDate.of(1980, 4, 25),true);
        AlumnoData alu= new AlumnoData();
        
        //alu.guardarAlumno(juan);
        
        alu.modificarAlumno(juan);
    }
    
}
