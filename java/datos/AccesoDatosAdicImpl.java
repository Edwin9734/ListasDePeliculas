package datos;
import dominio.PeliculaAmpleada;
import excepciones.LecturaDatosEX;
import java.util.*;


public class AccesoDatosAdicImpl implements IAccesoDatos{
private List<PeliculaAmpleada> peliFecha = new ArrayList<PeliculaAmpleada>();
public void cargarInformacion(String nombreArchivo) throws LecturaDatosEX{


peliFecha = new ArrayList<PeliculaAmpleada();             //lista
try {
BufferedReader entrada = null;              
File archivo = new File(nombreArchivo);                   //archivo codificado
entrada = new BufferedReader(new FileReader(archivo));    //archivo en letras
String linea= null;
linea = entrada.readLine();                               //linea actual
while( linea != null ){
    String nombrePe;                                      //variables reiniciadas
    String Year;                                          //variables reiniciadas
    String [] arreglo = linea.split(";");    //split dice los elementos de la linea separados por ;
    nombrPe = arreglo();
    Year = arreglo(1);
    //sugerir como no validar  que no de errores esto
    PeliculaAmpleada pelicula = new PeliculaAmpleada(nombrePe,year);
    peliFecha.add(pelicula);
    linea = entrada.readLine();
     
}
entrada.close();
}
catch(FileNotFoundException ex){
    ex.printStackTrace(System.out);
}

catch(IOException ex){
ex.printStackTrace(System.out);
}
 
}

}

}
