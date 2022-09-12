/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import dominio.Pelicula;
import dominio.PeliculaFecha;
import excepciones.AccesoDatosEx;
import excepciones.EscrituraDartosEx;
import excepciones.LecturaDatosEX;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class AccesoDatosImpl  implements IAccesoDatos{

    @Override
    public boolean existe(String nombreArchivo) throws AccesoDatosEx {
      File archivo = new File(nombreArchivo);
      return archivo.exists();

    }

    @Override
    public List<Pelicula> Listar(String nombreArchivo) throws LecturaDatosEX {
        List<Pelicula> Listapeliculas = new ArrayList();
        try{
            BufferedReader entrada = null;
            File archivo = new File(nombreArchivo);
            entrada = new BufferedReader (new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            while(linea != null){
                Pelicula pelicula = new Pelicula(linea);
                Listapeliculas.add(pelicula);
                linea = entrada.readLine(); 
                }
            entrada.close();
        }catch(FileNotFoundException ex){
            System.out.println("no se encuentra el archivo");
        } catch (IOException ex) {
            System.out.println("Clavos al abrir el archivo");
        }
         return Listapeliculas;
                
    
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDartosEx {
        PrintWriter salida = null;
        try{
            File archivo = new File(nombreArchivo);
            salida = new PrintWriter ( new FileWriter(archivo,true));
            salida.println(pelicula.toString());
            salida.close();
            System.out.println("se ha escrito en el registro de pelicuals");
         }catch(Exception e){
        
         }
}
    @Override
    public String Buscar(String nombreArchivo, String buscar) throws EscrituraDartosEx {
        BufferedReader entrada = null;
        String resultado= null;
        try{
            File archivo = new File( nombreArchivo);
            entrada= new BufferedReader(new FileReader(archivo));
            String linea = null;
            int i=0;
            linea = entrada.readLine();
            while(linea != null){
                if(buscar!= null & buscar.equalsIgnoreCase(linea)){
                    resultado = "peli:" +linea+ "entrdada de la linea"+i;
                    break;
                }
                linea = entrada.readLine();
                i++;
            }
            entrada.close( );
        }catch(FileNotFoundException ex){
            System.out.println("No se encontro "+ ex.getMessage());
        }catch(IOException ex){
            System.out.println("problema ccon el archivo");
        }finally{
            try{
                entrada.close();
                
            }catch(Exception e){
                System.out.println("error");
            }
        }
        return resultado;
        
        
         
    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosEx {
        PrintWriter salida =null;
        try{
            File archivo =new File( nombreArchivo);
            salida = new PrintWriter( new FileWriter(archivo));
            salida.close();
        }catch(IOException ex){
            System.out.println("error");
            
            
        }
    }

    @Override
    public void borrar(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        archivo.delete();
        System.out.println("el arcivo elimino");
    
    }

    @Override
    public List<Pelicula> Listarf(String nombreArchivo) throws LecturaDatosEX {
 List<Pelicula> peliFecha = new ArrayList<Pelicula>();    
    peliFecha = new ArrayList<Pelicula>();                //lista
    try {  
    BufferedReader entrada = null;              
    File archivo = new File(nombreArchivo);                   //archivo codificado
    entrada = new BufferedReader(new FileReader(archivo));    //archivo en letras
    String linea= null;
    linea = entrada.readLine();                               //linea actual
    while( linea != null ){
        String nombrePe;                                      //variables reiniciadas
        //String Year;                                          //variables reiniciadas
        String [] arreglo = linea.split(";");    //split dice los elementos de la linea separados por ;
        String arrayToString = Arrays.toString(arreglo);
        //nombrePe = arreglo();
        //year = arreglo(1);
        //sugerir como no validar  que no de errores esto
        Pelicula pelicula = new Pelicula(arrayToString);
        peliFecha.add(pelicula);
        linea = entrada.readLine();

    }
    entrada.close();
    }catch(Exception e){
        System.out.println("ocurio un error");
         }    
    return peliFecha;    }

    @Override
    public void escribirf(PeliculaFecha pelicula, String nombreArchivo, boolean anaxar) throws EscrituraDartosEx {
PrintWriter salida = null;
        try{
            File archivo = new File(nombreArchivo);
            salida = new PrintWriter ( new FileWriter(archivo,true));
            salida.println(pelicula.toString());
            salida.close();
            System.out.println("se ha escrito en el registro de pelicuals");
         }catch(Exception e){
            System.out.println("error inprevisto");
         }     }
    
}
