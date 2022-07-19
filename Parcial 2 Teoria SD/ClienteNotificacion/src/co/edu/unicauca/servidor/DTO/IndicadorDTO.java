package co.edu.unicauca.servidor.DTO;

import java.io.Serializable;

public class IndicadorDTO implements Serializable {
    
    private int numHabitacion;
    private float freCardiaca;
    private float tensionArterialSist;
    private float tensionArterialDiast;
    private float freRespiratoria;
    private float temperatura;
    private float satOxigeno;
    
    public IndicadorDTO(){
        //Constructor vacio
    }

    public IndicadorDTO(int numHabitacion, float freCardiaca, float tensionArterialSist, float tensionArterialDiast, float freRespiratoria, float temperatura, float satOxigeno) {
        this.numHabitacion = numHabitacion;
        this.freCardiaca = freCardiaca;
        this.tensionArterialSist = tensionArterialSist;
        this.tensionArterialDiast = tensionArterialDiast;
        this.freRespiratoria = freRespiratoria;
        this.temperatura = temperatura;
        this.satOxigeno = satOxigeno;
    }

    public int getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(int numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public float getFreCardiaca() {
        return freCardiaca;
    }

    public void setFreCardiaca(float freCardiaca) {
        this.freCardiaca = freCardiaca;
    }

    public float getTensionArterialSist() {
        return tensionArterialSist;
    }

    public void setTensionArterialSist(float tensionArterialSist) {
        this.tensionArterialSist = tensionArterialSist;
    }

    public float getTensionArterialDiast() {
        return tensionArterialDiast;
    }

    public void setTensionArterialDiast(float tensionArterialDiast) {
        this.tensionArterialDiast = tensionArterialDiast;
    }

    public float getFreRespiratoria() {
        return freRespiratoria;
    }

    public void setFreRespiratoria(float freRespiratoria) {
        this.freRespiratoria = freRespiratoria;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getSatOxigeno() {
        return satOxigeno;
    }

    public void setSatOxigeno(float satOxigeno) {
        this.satOxigeno = satOxigeno;
    }
    
}