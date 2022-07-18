package co.edu.unicauca.servidor.DTO;

public class IndicadorDTO {
    
    private int numHabitacion;
    private double freCardiaca;
    private double[] tensionArterial;
    private double freRespiratoria;
    private double temperatura;
    private double satOxigeno;
    
    public IndicadorDTO(){
        //Constructor vacio
    }

    public IndicadorDTO(int numHabitacion, double freCardiaca, double[] tensionArterial, double freRespiratoria, double temperatura, double satOxigeno) {
        this.numHabitacion = numHabitacion;
        this.freCardiaca = freCardiaca;
        this.tensionArterial = tensionArterial;
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

    public double getFreCardiaca() {
        return freCardiaca;
    }

    public void setFreCardiaca(double freCardiaca) {
        this.freCardiaca = freCardiaca;
    }

    public double[] getTensionArterial() {
        return tensionArterial;
    }

    public void setTensionArterial(double[] tensionArterial) {
        this.tensionArterial = tensionArterial;
    }

    public double getFreRespiratoria() {
        return freRespiratoria;
    }

    public void setFreRespiratoria(double freRespiratoria) {
        this.freRespiratoria = freRespiratoria;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getSatOxigeno() {
        return satOxigeno;
    }

    public void setSatOxigeno(double satOxigeno) {
        this.satOxigeno = satOxigeno;
    }
}

