
package co.edu.unicauca.servidor.controladores;

import co.edu.unicauca.cliente.controladores.NotificacionCallbackInt;
import co.edu.unicauca.servidor.DTO.IndicadorDTO;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class ControladorGestorIndicadoresImpl extends UnicastRemoteObject implements ControladorGestorIndicadoresInt{

    private final ControladorNotificacionImpl objNotificacion;
    public ControladorGestorIndicadoresImpl(ControladorNotificacionImpl objNotificacion) throws RemoteException {
        super();
        this.objNotificacion = objNotificacion;
    }

    @Override
    public boolean enviarIndicadores(IndicadorDTO objIndicadorDTO) throws RemoteException {
        this.objNotificacion.notificarClientes(objIndicadorDTO);
        return true;
    }

    
}
