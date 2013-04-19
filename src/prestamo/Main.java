
package prestamo;

import UI.MenuPrincipal;
import control.Control;
import javax.swing.UIManager;

public class Main {
public static MenuPrincipal mPrincipal;
public static Control controlsoft;

    public static void main(String[] args) {
        
    try
    {
   UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    }
    catch (Exception e)
    {
     e.printStackTrace();
    }
    new UI.PantallaCargandoMain();
    controlsoft = new Control();
    Socio socio = new Socio("Fapencio", 123213, 1, "Direccion");
    Socio socio2 = new Socio("Fuckens", 21332, 2, "Dir 2");
    Libro libro = new Libro("1", "JK ROWLING", "Harry Potter");
    Libro libro2 = new Libro("2", "Fontaine", "El legado");
    controlsoft.getSocios().add(socio);
    controlsoft.getSocios().add(socio2);
    controlsoft.getLibros().add(libro);
    controlsoft.getLibros().add(libro2);
    mPrincipal = new MenuPrincipal();
    mPrincipal.setTitle("Biblioteca System");
    mPrincipal.setLocationRelativeTo(null);
    mPrincipal.setResizable(false);
    mPrincipal.setVisible(true);

    }

}
