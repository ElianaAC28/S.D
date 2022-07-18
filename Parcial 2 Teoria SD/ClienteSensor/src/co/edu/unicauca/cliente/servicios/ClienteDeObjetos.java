package co.edu.unicauca.cliente.servicios;

import co.edu.unicauca.cliente.controladores.NotificacionCallbackImpl;
import co.edu.unicauca.cliente.utilidades.UtilidadesRegistroC;
import co.edu.unicauca.cliente.vista.Menu;
import co.edu.unicauca.servidor.controladores.ControladorNotificacionInt;
import java.rmi.RemoteException;

public class ClienteDeObjetos {

    private static ControladorNotificacionInt objRemoto;
    
    public static void main(String[] args) throws RemoteException {
        
        int numPuertoRMIRegistry = 0;
            String direccionIpRMIRegistry = "";        
               
            System.out.println("Cual es el la dirección ip donde se encuentra  el rmiregistry ");
            direccionIpRMIRegistry = co.edu.unicauca.cliente.utilidades.UtilidadesConsola.leerCadena();
            System.out.println("Cual es el número de puerto por el cual escucha el rmiregistry ");
            numPuertoRMIRegistry = co.edu.unicauca.cliente.utilidades.UtilidadesConsola.leerEntero(); 
           
            objRemoto = (ControladorNotificacionInt) UtilidadesRegistroC.obtenerObjRemoto(direccionIpRMIRegistry,numPuertoRMIRegistry, "objNotificacion");
            NotificacionCallbackImpl objRemotoNotificacion = new NotificacionCallbackImpl();
            objRemoto.registrarReferenciaCliente(objRemotoNotificacion);
            
           
            Menu objMenu = new Menu();
            objMenu.setVisible(true);
                 
             System.out.println("funciona");
            
           /* Menu objMenu= new Menu(objRemoto);
            objMenu.ejecutarMenuPrincipal();*/
    }
    
}
