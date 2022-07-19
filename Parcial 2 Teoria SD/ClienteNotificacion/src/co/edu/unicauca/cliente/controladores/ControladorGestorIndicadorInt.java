package co.edu.unicauca.cliente.controladores;

import co.edu.unicauca.servidor.DTO.IndicadorDTO;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ControladorGestorIndicadorInt extends Remote {

    public boolean enviarIndicadores(IndicadorDTO objIndicador) throws RemoteException;
}