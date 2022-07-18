package co.edu.unicauca.servidor.controladores;

import co.edu.unicauca.cliente.controladores.NotificacionCallbackInt;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ControladorNotificacionInt extends Remote {
    
    public boolean registrarReferenciaCliente(NotificacionCallbackInt objNotificacion) throws RemoteException;

}
