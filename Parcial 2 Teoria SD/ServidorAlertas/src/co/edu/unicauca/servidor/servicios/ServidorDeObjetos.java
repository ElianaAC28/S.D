package co.edu.unicauca.servidor.servicios;

import co.edu.unicauca.servidor.controladores.ControladorGestorIndicadoresImpl;
import co.edu.unicauca.servidor.controladores.ControladorNotificacionImpl;
import co.edu.unicauca.servidor.utilidades.UtilidadesRegistroS;
import java.rmi.RemoteException;

public class ServidorDeObjetos {

    public static void main(String[] args) throws RemoteException {

        int numPuertoRMIRegistry = 0;
        String direccionIpRMIRegistry = "";
        int numPuertoRMIRegistryR = 0;
        String direccionIpRMIRegistryR = "";

        System.out.println("Cual es el la dirección ip donde se encuentra  el rmiRegistry Canciones");
        direccionIpRMIRegistry = co.edu.unicauca.servidor.utilidades.UtilidadesConsola.leerCadena();
        System.out.println("Cual es el número de puerto por el cual escucha el rmiRegistry Canicones");
        numPuertoRMIRegistry = co.edu.unicauca.servidor.utilidades.UtilidadesConsola.leerEntero();

        ControladorNotificacionImpl objNotificacion = new ControladorNotificacionImpl();
        //obj remoto para indicadores
        ControladorGestorIndicadoresImpl objRemotoGestionAdministradores = new ControladorGestorIndicadoresImpl(objNotificacion);

        try {
            UtilidadesRegistroS.arrancarNS(numPuertoRMIRegistry);
            UtilidadesRegistroS.RegistrarObjetoRemoto(objNotificacion, direccionIpRMIRegistry, numPuertoRMIRegistry, "objNotificacion");
            UtilidadesRegistroS.RegistrarObjetoRemoto(objNotificacion, direccionIpRMIRegistry, numPuertoRMIRegistry, "objIndicador");

        } catch (Exception e) {
            System.err.println("No fue posible Arrancar el NS o Registrar el objeto remoto" + e.getMessage());
        }
        System.out.println("Servidor de alertas encendido...");
    }
}
