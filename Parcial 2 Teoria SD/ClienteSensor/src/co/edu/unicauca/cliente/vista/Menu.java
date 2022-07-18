
package co.edu.unicauca.cliente.vista;

import javax.swing.JFrame;


public class Menu  extends JFrame{

    public Menu() {
        
        setSize(500, 500);
        
        //Cuando se cierre la ventanda, programa finaliza
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //centrar ventana
        setLocationRelativeTo(null);
        
        //Titulo
        setTitle("Notificación");
    }
    
}
