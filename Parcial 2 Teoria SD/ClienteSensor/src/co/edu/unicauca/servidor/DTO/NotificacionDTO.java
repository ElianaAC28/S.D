package co.edu.unicauca.servidor.DTO;

import java.io.Serializable;

public class NotificacionDTO implements Serializable {

    private IndicadorDTO objIndicador;
    private boolean fueraRangoFreCardiaca;
    private boolean fueraRangoTensionArterialSist;
    private boolean fueraRangoTensionArterialDiast;
    private boolean fueraRangoFreRespiratoria;
    private boolean fueraRangoTemperatura;
    private boolean fueraRangoSatOxigeno;
    
    public NotificacionDTO() {
        // Constructor vacio
    }
    
    public NotificacionDTO(IndicadorDTO objIndicador, boolean fueraRangoFreCardiaca, boolean fueraRangoTensionArterialSist, boolean fueraRangoTensionArterialDiast, boolean fueraRangoFreRespiratoria, boolean fueraRangoTemperatura, boolean fueraRangoSatOxigeno) {
        this.objIndicador = objIndicador;
        this.fueraRangoFreCardiaca = fueraRangoFreCardiaca;
        this.fueraRangoTensionArterialSist = fueraRangoTensionArterialSist;
        this.fueraRangoTensionArterialDiast = fueraRangoTensionArterialDiast;
        this.fueraRangoFreRespiratoria = fueraRangoFreRespiratoria;
        this.fueraRangoTemperatura = fueraRangoTemperatura;
        this.fueraRangoSatOxigeno = fueraRangoSatOxigeno;
    }

    public IndicadorDTO getObjIndicador() {
        return objIndicador;
    }

    public void setObjIndicador(IndicadorDTO objIndicador) {
        this.objIndicador = objIndicador;
    }

    public boolean isFueraRangoFreCardiaca() {
        return fueraRangoFreCardiaca;
    }

    public void setFueraRangoFreCardiaca(boolean fueraRangoFreCardiaca) {
        this.fueraRangoFreCardiaca = fueraRangoFreCardiaca;
    }

    public boolean isFueraRangoTensionArterialSist() {
        return fueraRangoTensionArterialSist;
    }

    public void setFueraRangoTensionArterialSist(boolean fueraRangoTensionArterialSist) {
        this.fueraRangoTensionArterialSist = fueraRangoTensionArterialSist;
    }

    public boolean isFueraRangoTensionArterialDiast() {
        return fueraRangoTensionArterialDiast;
    }

    public void setFueraRangoTensionArterialDiast(boolean fueraRangoTensionArterialDiast) {
        this.fueraRangoTensionArterialDiast = fueraRangoTensionArterialDiast;
    }

    public boolean isFueraRangoFreRespiratoria() {
        return fueraRangoFreRespiratoria;
    }

    public void setFueraRangoFreRespiratoria(boolean fueraRangoFreRespiratoria) {
        this.fueraRangoFreRespiratoria = fueraRangoFreRespiratoria;
    }

    public boolean isFueraRangoTemperatura() {
        return fueraRangoTemperatura;
    }

    public void setFueraRangoTemperatura(boolean fueraRangoTemperatura) {
        this.fueraRangoTemperatura = fueraRangoTemperatura;
    }

    public boolean isFueraRangoSatOxigeno() {
        return fueraRangoSatOxigeno;
    }

    public void setFueraRangoSatOxigeno(boolean fueraRangoSatOxigeno) {
        this.fueraRangoSatOxigeno = fueraRangoSatOxigeno;
    }
    
}