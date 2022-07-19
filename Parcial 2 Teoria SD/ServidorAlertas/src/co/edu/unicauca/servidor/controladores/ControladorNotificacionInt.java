package co.edu.unicauca.servidor.controladores;

import co.edu.unicauca.cliente.controladores.NotificacionCallbackInt;
import co.edu.unicauca.servidor.DTO.NotificacionDTO;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ControladorNotificacionInt extends Remote {
    
    public boolean registrarReferenciaCliente(NotificacionCallbackInt objNotificacion) throws RemoteException;
    public void enviarNotificacion(NotificacionDTO objNotificacion) throws RemoteException;
}
