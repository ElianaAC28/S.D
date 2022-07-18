package co.edu.unicauca.cliente.controladores;

import java.rmi.Remote;
import java.rmi.RemoteException;
import co.edu.unicauca.servidor.DTO.IndicadorDTO;

public interface NotificacionCallbackInt extends Remote {

    public void enviarNotificacion(IndicadorDTO objIndicador) throws RemoteException;
    
    
}