/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Usuario
 */
public class PeliculaFecha   {
    
    private String fecha;
    private String nombre;
    
    public PeliculaFecha(String nombrep,String Fecha ){
            this.nombre= nombrep;
            this.fecha= Fecha;
            }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
      //  return "PeliculaFecha{" + "fecha=" + fecha + ", nombre=" + nombre + '}';
        return  nombre +";"+ fecha ;
    }
    
    

    
    
    
    
    
}

