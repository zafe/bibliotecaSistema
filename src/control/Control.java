package control;

import java.text.SimpleDateFormat;
import prestamo.Socio;
import prestamo.Libro;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import prestamo.LibroPrest;
import prestamo.Main;
import prestamo.Prestamo;

public class Control {

    private ArrayList<Socio> socios= new ArrayList<Socio>();
    private ArrayList<Libro> libros= new ArrayList<Libro>();
    private ArrayList<Prestamo> prestamos= new ArrayList<Prestamo>();
    private Calendar calendario = Calendar.getInstance();

   
    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }


    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public ArrayList<Socio> getSocios() {
        return socios;
    }

    public void setSocios(ArrayList<Socio> socios) {
        this.socios = socios;
    }

    public int buscarSocio(long clave){
        int pos=-1;
        for(int i=0; i<socios.size();i++){
            if(socios.get(i).getDni()==clave){
                pos=i;
                break;
            }
        }
        return pos;
    }
    public int buscarPrestamos(long clave){
        int pos=-1;
        for(int i=0; i<prestamos.size(); i++){
            if(prestamos.get(i).getSocio().getDni()==clave){
                pos=i;
                break;
            }
        }
        return pos;
    }

    public int buscarLibros(String clave){
             int pos=-1;
        for(int i=0; i<libros.size(); i++){
            if(libros.get(i).getIsbn().equals(clave)== true){
                pos=i;
                break;
            }
        }
        return pos;
    }
    public String obtenerFechaActual(){
        calendario.add(Calendar.MONTH,1);
        String FechaActual = calendario.get(Calendar.DATE)+"/"+calendario.get(Calendar.MONTH)+"/"+calendario.get(Calendar.YEAR);
        return FechaActual;
    }

    public String obtenerFechaDevolucion(int dias){
        String fechadevolucion;
        //calendario.add(Calendar.MONTH,1);
        calendario.add(Calendar.DATE,dias);
        fechadevolucion = calendario.get(Calendar.DATE)+"/"+calendario.get(Calendar.MONTH)+"/"+calendario.get(Calendar.YEAR);
        return fechadevolucion;
    }

    public static void aniadirPrestamo(long claveSocio,String isbn, String nombre,String autor,String fechaprestamo,int diasprest){
    boolean encontrado=false;
    LibroPrest libroprestado = new LibroPrest();
    libroprestado.setNombre(nombre);
    libroprestado.setIsbn(isbn);
    libroprestado.setAutor(autor);
    libroprestado.setFechaprestamo(fechaprestamo);
    String fechadevolucion = Main.controlsoft.obtenerFechaDevolucion(diasprest);
    libroprestado.setFechadevolucion(fechadevolucion);
        for(int i=0;i<Main.controlsoft.getPrestamos().size();i++){
        if(Main.controlsoft.getPrestamos().get(i).getSocio().getDni() == claveSocio){
            Main.controlsoft.getPrestamos().get(i).getLibros().add(libroprestado);
            encontrado=true;
            break;
        }
    }
    if(encontrado==false){
        Prestamo prestamoadded= new Prestamo();
        int pos = Main.controlsoft.buscarSocio(claveSocio);
        prestamoadded.setSocio(Main.controlsoft.getSocios().get(pos));
        prestamoadded.getLibros().add(libroprestado);
        Main.controlsoft.getPrestamos().add(prestamoadded);
    }
    completarTablaPrestSocio(claveSocio);
    }

    public static void completarTablaPrestSocio(long claveSocio){
            int posPrestamo = Main.controlsoft.buscarPrestamos(claveSocio);
            if(posPrestamo!=-1){
                for(int i=0; i<Main.controlsoft.getPrestamos().get(posPrestamo).getLibros().size();i++){
                    Main.mPrincipal.getNprestamo().gettSocio().setValueAt(Main.controlsoft.getPrestamos().get(posPrestamo).getLibros().get(i).getNombre(), i, 0);
                    Main.mPrincipal.getNprestamo().gettSocio().setValueAt(Main.controlsoft.getPrestamos().get(posPrestamo).getLibros().get(i).getIsbn(), i, 1);
                    Main.mPrincipal.getNprestamo().gettSocio().setValueAt(Main.controlsoft.getPrestamos().get(posPrestamo).getLibros().get(i).getAutor(), i, 2);
                    Main.mPrincipal.getNprestamo().gettSocio().setValueAt(Main.controlsoft.getPrestamos().get(posPrestamo).getLibros().get(i).getFechaprestamo(), i, 3);
                    Main.mPrincipal.getNprestamo().gettSocio().setValueAt(Main.controlsoft.getPrestamos().get(posPrestamo).getLibros().get(i).getFechadevolucion(), i, 4);
                }
            }
    }
    
    public static void limpiarTablaPrestSocio(){
              for(int i=0; i<12;i++){/*Limpia solamente 12 filas*/
                  Main.mPrincipal.getNprestamo().gettSocio().setValueAt("", i, 0);
                  Main.mPrincipal.getNprestamo().gettSocio().setValueAt("", i, 1);
                  Main.mPrincipal.getNprestamo().gettSocio().setValueAt("", i, 2);
                  Main.mPrincipal.getNprestamo().gettSocio().setValueAt("", i, 3);
                  Main.mPrincipal.getNprestamo().gettSocio().setValueAt("", i, 4);
              }
    }

    public static void eliminarPrestamo(int selectedfila){
    int pos = Main.controlsoft.buscarSocio(Long.parseLong(Main.mPrincipal.getNprestamo().gettDni().getText()));
    Main.controlsoft.getPrestamos().get(pos).getLibros().remove(selectedfila);
    Main.controlsoft.completarTablaPrestSocio(Long.parseLong(Main.mPrincipal.getNprestamo().gettDni().getText()));
    }
    
    
    public static void listarPrestamos(){
        int filaIndex=0;
            for(int i=0; i<Main.controlsoft.getPrestamos().size(); i++){
            for(int j=0; j<Main.controlsoft.getPrestamos().get(i).getLibros().size();j++){
            Main.mPrincipal.getListarPrestamo().gettListaPrestamos().setValueAt(Main.controlsoft.getPrestamos().get(i).getSocio().getNombre(), filaIndex, 0);
            Main.mPrincipal.getListarPrestamo().gettListaPrestamos().setValueAt(Main.controlsoft.getPrestamos().get(i).getSocio().getDni(), filaIndex, 1);
            Main.mPrincipal.getListarPrestamo().gettListaPrestamos().setValueAt(Main.controlsoft.getPrestamos().get(i).getLibros().get(j).getNombre(), filaIndex, 2);
            Main.mPrincipal.getListarPrestamo().gettListaPrestamos().setValueAt(Main.controlsoft.getPrestamos().get(i).getLibros().get(j).getAutor(), filaIndex, 3);
            Main.mPrincipal.getListarPrestamo().gettListaPrestamos().setValueAt(Main.controlsoft.getPrestamos().get(i).getLibros().get(j).getIsbn(), filaIndex, 4);
            Main.mPrincipal.getListarPrestamo().gettListaPrestamos().setValueAt(Main.controlsoft.getPrestamos().get(i).getLibros().get(j).getFechaprestamo(), filaIndex, 5);
            Main.mPrincipal.getListarPrestamo().gettListaPrestamos().setValueAt(Main.controlsoft.getPrestamos().get(i).getLibros().get(j).getFechadevolucion(), filaIndex, 6);
            filaIndex++;
            }
            }
        }
    
    
}
