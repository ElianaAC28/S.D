package co.edu.unicauca.cliente.controladores;

import co.edu.unicauca.servidor.DTO.IndicadorDTO;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class NotificacionCallbackImpl extends UnicastRemoteObject implements NotificacionCallbackInt{

    public NotificacionCallbackImpl() throws RemoteException{
        super();
    }
    
    @Override
    public void enviarNotificacion(IndicadorDTO objIndicador) throws RemoteException {
        System.out.println("el indicador con el rango, la notificaion como tal, si esta mal se debe notificar "
                + "se sebe notificar, sino no.");
    }
    
    
    
}
