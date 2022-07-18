package co.edu.unicauca.cliente.servicios;

import co.edu.unicauca.cliente.controladores.ControladorGestorIndicadorImpl;
import co.edu.unicauca.cliente.controladores.ControladorGestorIndicadorInt;
import co.edu.unicauca.cliente.utilidades.UtilidadesRegistroC;
import java.rmi.RemoteException;

public class ClienteDeObjetos {

    private static ControladorGestorIndicadorInt objRemoto;

    public static void main(String[] args) throws RemoteException {

        int numPuertoRMIRegistry = 0;
        String direccionIpRMIRegistry = "";

        System.out.println("Cual es el la dirección ip donde se encuentra  el rmiregistry ");
        direccionIpRMIRegistry = co.edu.unicauca.cliente.utilidades.UtilidadesConsola.leerCadena();
        System.out.println("Cual es el número de puerto por el cual escucha el rmiregistry ");
        numPuertoRMIRegistry = co.edu.unicauca.cliente.utilidades.UtilidadesConsola.leerEntero();
        System.out.println("probando");
        objRemoto = (ControladorGestorIndicadorInt) UtilidadesRegistroC.obtenerObjRemoto(direccionIpRMIRegistry, numPuertoRMIRegistry, "objIndicador");

        ControladorGestorIndicadorImpl objRemotoNotificacion = new ControladorGestorIndicadorImpl();

        
        System.out.println("funciona");
        System.exit(0);
    }

}
