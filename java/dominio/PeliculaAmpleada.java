    package dominio;
    public class PeliculaAmpleada {//debio ser heredado de pelicula
    private String nombre;
    private String Fproduccion;

    
    public PeliculaAmpleada(String nombre_peli, String fecha_produccion){ //esta es la clase edicioada
    this.nombre = nombre_peli;
    this.Fproduccion = fecha_produccion;
    }   
        
    public String getNombre() {
    return nombre;
    }
    
    public void setNombre(String nombre) {
    this.nombre = nombre;
    }
     
    public String getFproduccion() {
    return Fproduccion;
    }
 
    public void setFproduccion(String Fproduccion) {
    this.Fproduccion = Fproduccion;
    }

    @Override
    public String toString() {
    return nombre + ";" + Fproduccion ;
    }
    
}
