/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package datos;

import dominio.Pelicula;
import dominio.PeliculaFecha;
import excepciones.AccesoDatosEx;
import excepciones.EscrituraDartosEx;
import excepciones.LecturaDatosEX;
import java.util.List;


public interface IAccesoDatos  { //si hay clavos llamar a la clase de escepciones
    boolean existe(String nombreArchivo)throws AccesoDatosEx;
    public List<Pelicula> Listar(String nombreArchivo) throws LecturaDatosEX;
    public List<Pelicula> Listarf(String nombreArchivo) throws LecturaDatosEX;
    void escribir (Pelicula pelicula,String nombreArchivo, boolean anaxar)throws EscrituraDartosEx;
    void escribirf (PeliculaFecha pelicula, String nombreArchivo, boolean anaxar) throws EscrituraDartosEx;
    public String Buscar(String nombreArchivo,String buscar)throws EscrituraDartosEx;
    public void crear(String nombreArchivo)throws AccesoDatosEx;
    public void borrar (String nombreArchivo)throws AccesoDatosEx;

    
    


}
