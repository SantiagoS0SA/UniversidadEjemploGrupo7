/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo;

//import java.sql.*;
//import java.time.LocalDate;
//import java.time.Month;
import universidadejemplo.AccesoaDatos.*;
import universidadejemplo.Entidades.*;

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
        
        //EJEMPLOS PARA VER SI FUNCIONA LA CONEXION DE BASE DE DATOS 
        
        //Alumno juan = new Alumno(1,123123123,"Sanches","victor", LocalDate.of(1980, 4, 25),true);
        //AlumnoData alu= new AlumnoData();
        
        //alu.listarAlumnos();
        //alu.guardarAlumno(juan);
                                  
       // alu.modificarAlumno(juan);
       
       //alu.eliminarAlumno(1);
       
       //PARTE DE PRUEBA DE MATERIA DATA
       
       //Materia matematicas = new Materia(1,"Java",2021,true);
       //MateriaData nuevo = new MateriaData();
       
       //nuevo.guardarMateria(matematicas);
       //nuevo.buscarMateria(1);
       //nuevo.modificarMateria(matematicas);
       //nuevo.eliminarMateria(1);
       
       //PARTE DE VERIFICACION DE INSCRIPCION DATA
       
       AlumnoData ad = new AlumnoData();
       MateriaData md = new MateriaData();
       InscripcionData id = new InscripcionData();
       
       Alumno victor = ad.obtenerAlumnoPorId(1);
       Materia mate = md.buscarMateria(1);
       Inscripcion insc = new Inscripcion(3,victor,mate);
       
        
        //id.guardarinscripcion(insc);
        //id.actualizarNotas(1, 1, 10);
        //id.borrarInscriptoMateriaAlumno(1, 1);
        
//        for(Inscripcion inscripto : id.obtenerInscripciones()){
//            
//            System.out.println("id "+ inscripto.getIdInscripcion());
//            System.out.println("nota "+inscripto.getNota());
//            System.out.println("idAlumno "+inscripto.getAlumno().getApellido());
//            System.out.println("idMateria "+inscripto.getMateria().getNombre());
//            
//        }

// for(Inscripcion inscripto : id.obtenerInscripcionesPorAlumno(1)){
//            
//            System.out.println("id "+ inscripto.getIdInscripcion());
//            System.out.println("nota "+inscripto.getNota());
//            System.out.println("idAlumno "+inscripto.getAlumno().getApellido());
//            System.out.println("idMateria "+inscripto.getMateria().getNombre());
//            
//        }

// for(Materia Materia : id.obtenerMateriaCursadas(1)){
//            
//            System.out.println("id "+ Materia.toString());
//            
//        }

//for(Materia alu : id.obtenerMateriasNoCursadas(1)){
//    
//    System.out.println("nombre: "+ alu.getNombre());
//
//
//}


//for(Alumno alu : id.obtenerAlumnoPorMateria(1)){
//    System.out.println(alu.toString());
//
//}
        
       //FIN DE EJEMPLOS 
       
       
       
    }
    
}
