
package prestamo;



public class Socio {

    private String nombre;
    private String domicilio;
    private long telefono;
    private long dni;

    public Socio(){

    }

    public Socio(String nombre,long telefono, long dni, String domicilio){
        this.nombre=nombre;
        this.domicilio=domicilio;
        this.dni=dni;
        this.telefono=telefono;

    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }



}
