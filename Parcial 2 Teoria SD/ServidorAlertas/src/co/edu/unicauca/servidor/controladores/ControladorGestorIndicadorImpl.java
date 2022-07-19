package co.edu.unicauca.servidor.controladores;

import co.edu.unicauca.servidor.DTO.IndicadorDTO;
import co.edu.unicauca.servidor.DTO.NotificacionDTO;
import co.edu.unicauca.servidor.utilidades.UtilidadesRegistroC;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ControladorGestorIndicadorImpl extends UnicastRemoteObject implements ControladorGestorIndicadorInt {

    ControladorNotificacionInt objRemotoNotificacion;
    
    public ControladorGestorIndicadorImpl() throws RemoteException {
        super();
    }

    @Override
    public boolean enviarIndicadores(IndicadorDTO objIndicadorDTO) throws RemoteException {
        // this.objNotificacion.notificarClientes(objIndicadorDTO);
        
        NotificacionDTO notificacion = new NotificacionDTO();
        int contFueraRango = 0;
        boolean indicadores = false;
        
        if (objIndicadorDTO.getFreCardiaca() < 60 || objIndicadorDTO.getFreCardiaca() > 80) {
           notificacion.setFueraRangoFreCardiaca(false);
            contFueraRango++;
        } else {
            notificacion.setFueraRangoFreCardiaca(true);
        }
        
        if (objIndicadorDTO.getTensionArterialSist() < 110 || objIndicadorDTO.getTensionArterialSist() > 140) {
            notificacion.setFueraRangoTensionArterialSist(false);
            contFueraRango++;
        } else {
            notificacion.setFueraRangoTensionArterialSist(true);
        }
        
        if (objIndicadorDTO.getTensionArterialDiast() < 70 || objIndicadorDTO.getTensionArterialDiast() > 90) {
            notificacion.setFueraRangoTensionArterialDiast(false);
            contFueraRango++;
        } else {
            notificacion.setFueraRangoTensionArterialDiast(true);
        }
        
        if (objIndicadorDTO.getFreRespiratoria() < 12 || objIndicadorDTO.getFreRespiratoria() > 20) {
            notificacion.setFueraRangoFreRespiratoria(false);
            contFueraRango++;
        } else {
            notificacion.setFueraRangoFreRespiratoria(true);
        }
        
        if (objIndicadorDTO.getTemperatura() < 36.2 || objIndicadorDTO.getTemperatura() > 37.2){
            notificacion.setFueraRangoTemperatura(false);
            contFueraRango++;
        } else {
            notificacion.setFueraRangoTemperatura(true);
        }
        
        if (objIndicadorDTO.getSatOxigeno() < 95 || objIndicadorDTO.getSatOxigeno() > 100) {
            notificacion.setFueraRangoSatOxigeno(false);
            contFueraRango++;
        } else {
            notificacion.setFueraRangoSatOxigeno(true);
        }
        
        if (contFueraRango >= 2) {
            String direccionIp = "localhost";
            int puerto = 2020;
            objRemotoNotificacion = (ControladorNotificacionInt) UtilidadesRegistroC.obtenerObjRemoto(direccionIp, puerto, "gestionNotificacion");
            if (objRemotoNotificacion != null) {
                
            }
            indicadores = true;
        }
        
        return indicadores;
    }
}
