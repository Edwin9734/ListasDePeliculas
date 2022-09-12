/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import datos.AccesoDatosImpl;
import datos.IAccesoDatos;
import dominio.Pelicula;
import dominio.PeliculaFecha;
import excepciones.AccesoDatosEx;
import excepciones.EscrituraDartosEx;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class CatalogoPeliculasImpl implements CatalogoPeliculas{
    private final IAccesoDatos datos;
    public CatalogoPeliculasImpl(){
        this.datos= new AccesoDatosImpl();
    }
    
    
    @Override
    public void agregarPeliculas(String nombrePelicula, String nombreArchivo) {
        Pelicula pelicula =new Pelicula(nombrePelicula);
        boolean anexar = false;
        try{
            anexar = datos.existe (nombreArchivo);
            datos.escribir(pelicula, nombreArchivo,anexar);
            
        }catch(AccesoDatosEx ex){
            System.out.println("error al accerdr al datos");
        }
    }

    @Override
    public void listarPeliculas(String nombreArchivo) {
        try{
            List<Pelicula> pelicula = datos.Listar(nombreArchivo);
            System.out.println("========listar peliculas");
        for(Pelicula peli : pelicula) {
            System.out.println("peli:  "+ peli);
        }
        }catch(Exception ex){
            System.out.println("clavos con accesos");
}}

    @Override
    public void buscarPeliculas(String nombreArchivo, String buscar) {
        String resultado = "";
        try {
            resultado = datos.Buscar(nombreArchivo, buscar);
       
        } catch (EscrituraDartosEx ex) {
            System.out.println("Errro al bucar la peli");
       }
        System.out.println("Resultado ="+resultado);
    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {
        try {
            if(datos.existe(nombreArchivo)){
                //si existe lo borra
                datos.borrar(nombreArchivo);
            } else {
                //creamos el archivo
                datos.crear(nombreArchivo);
            }
        } catch (AccesoDatosEx e) {
            System.out.println("Error de acceso a datos");
        }
    }

    @Override
    public void agregarPeliculas2(String nombrePelicula, String FechaP, String nombreArchivo) {
PeliculaFecha pelicula =new PeliculaFecha(nombrePelicula,FechaP);//PeliculFecha pelicula = new Pelicula(nombrePelicula,fechaPelicula) guardado en memoria
        boolean anexar = false;
        try{
            anexar = datos.existe (nombreArchivo);
            datos.escribirf(pelicula, nombreArchivo,anexar);//guarda la pelicula en arhivos
            
        }catch(AccesoDatosEx ex){
            System.out.println("error al accerdr al datos");
        }    }

    @Override
    public void listarPeliculas2(String nombreArchivo) {
        try{
        //List<PeliculaFecha> pelicula = datos.Listarf(nombreArchivo);
        List<Pelicula> pelicula = datos.Listarf(nombreArchivo);
            System.out.println("========listar peliculas");
        for(Pelicula peli : pelicula) {
            System.out.println("peli:  "+ peli);
        }
        }catch(Exception ex){
            System.out.println("clavos con accesos");
        }       }
    
}
