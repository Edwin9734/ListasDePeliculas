/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;

/**
 *
 * @author Usuario
 */
public interface CatalogoPeliculas {
    public void agregarPeliculas (String nombrePelicula, String nombreArchivo);
    public void agregarPeliculas2 (String nombrePelicula,String FechaP, String nombreArchivo);
    public void listarPeliculas (String nombreArchivo);
    public void listarPeliculas2 (String nombreArchivo);
    public void buscarPeliculas (String nombreArchivo, String buscar);
    public void iniciarArchivo (String nombreArchivo);
    
}
