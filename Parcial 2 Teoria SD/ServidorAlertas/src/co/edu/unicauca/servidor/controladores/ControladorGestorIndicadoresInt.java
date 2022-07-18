
package co.edu.unicauca.servidor.controladores;

import co.edu.unicauca.servidor.DTO.IndicadorDTO;
import java.rmi.Remote;
import java.rmi.RemoteException;



public interface ControladorGestorIndicadoresInt extends Remote{
    
    
    public boolean enviarIndicadores(IndicadorDTO objIndicadorDTO) throws RemoteException;
    
}
