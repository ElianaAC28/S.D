
package co.edu.unicauca.cliente.controladores;

import co.edu.unicauca.servidor.DTO.IndicadorDTO;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class ControladorGestorIndicadorImpl extends UnicastRemoteObject implements ControladorGestorIndicadorInt{

    public ControladorGestorIndicadorImpl() throws RemoteException {
        super();
    }

    @Override
    public void enviarIndicadores(IndicadorDTO objIndicador) throws RemoteException {
        System.out.println("Enviar indicadores, buenos, malos como sea");
    }
    
    
}
