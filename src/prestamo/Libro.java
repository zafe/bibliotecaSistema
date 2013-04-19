
package prestamo;

public class Libro {

    private String isbn;
    private String nombre;
    private String autor;

    public Libro(){

    }

    public Libro(String isbn, String nombre, String autor){
        this.isbn=isbn;
        this.nombre=nombre;
        this.autor=autor;

    }


    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



}
