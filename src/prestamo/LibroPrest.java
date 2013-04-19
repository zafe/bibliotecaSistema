
package prestamo;

import java.util.Date;
import java.util.Locale;

public class LibroPrest extends Libro{

    private String fechaprestamo;
    private String fechadevolucion;
    
    public LibroPrest(){
        
    }
    
    public LibroPrest(String nombre, String isbn, String autor, String fechaprestamo, String fechadevolucion ){
        super(nombre,isbn,autor);
        this.fechaprestamo=fechaprestamo;
        this.fechadevolucion=fechadevolucion;
    }
    public String getFechadevolucion() {
        return fechadevolucion;
    }

    public void setFechadevolucion(String fechadevolucion) {
        this.fechadevolucion = fechadevolucion;
    }

    public String getFechaprestamo() {
        return fechaprestamo;
    }

    public void setFechaprestamo(String fechaprestamo) {
        this.fechaprestamo = fechaprestamo;
    }



}
