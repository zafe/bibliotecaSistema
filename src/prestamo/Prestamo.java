
package prestamo;

import java.util.ArrayList;

public class Prestamo {

    private Socio socio;
    private ArrayList<LibroPrest> libros = new ArrayList<LibroPrest>();

    public Prestamo(){

    }

    public Prestamo(Socio socio, ArrayList<LibroPrest> libros){
    this.socio=socio;
    this.libros=libros;
    }

    public ArrayList<LibroPrest> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<LibroPrest> libros) {
        this.libros = libros;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }


}
