package co.edu.unicauca.cliente.controladores;

import co.edu.unicauca.servidor.DTO.IndicadorDTO;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface NotificacionCallbackInt extends Remote {

    public void enviarNotificacion(IndicadorDTO objIndicador) throws RemoteException;
}