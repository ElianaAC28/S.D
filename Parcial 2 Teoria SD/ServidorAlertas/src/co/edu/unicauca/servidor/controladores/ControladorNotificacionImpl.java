
package co.edu.unicauca.servidor.controladores;

import co.edu.unicauca.cliente.controladores.NotificacionCallbackInt;
import co.edu.unicauca.servidor.DTO.IndicadorDTO;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class ControladorNotificacionImpl  extends UnicastRemoteObject implements ControladorNotificacionInt{

    private final ArrayList<NotificacionCallbackInt> listaNoti;
    public ControladorNotificacionImpl() throws  RemoteException{
        super();
        listaNoti = new ArrayList<NotificacionCallbackInt>();
    }

    @Override
    public boolean registrarReferenciaCliente(NotificacionCallbackInt objNotificacion) throws RemoteException {
          listaNoti.add(objNotificacion);
          return true;
    }
    
    public void notificarClientes(IndicadorDTO objNoti) throws RemoteException{
        for (NotificacionCallbackInt obj : listaNoti) {
            obj.enviarNotificacion(objNoti);
        }
    }
    
    
    
}
