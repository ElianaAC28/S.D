package co.edu.unicauca.cliente.controladores;

import co.edu.unicauca.servidor.DTO.NotificacionDTO;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface NotificacionCallbackInt extends Remote {

    public void notificar(NotificacionDTO objNotificacion) throws RemoteException;
}