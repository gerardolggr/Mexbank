package mexbank;

public class CuentaBase {
    private double montoActual;

    public CuentaBase(double montoActual) {
        this.montoActual = montoActual;
    }

    public void setMontoActual(double montoActual) {
        this.montoActual = montoActual;
    }

    public double getMontoActual() {
        return montoActual;
    }
    
    public double Depositar(double cantidad){
        montoActual = montoActual + cantidad;
        return this.montoActual;
    }

    @Override
    public String toString() {
        return "Tiene un sueldo actual de: " + montoActual;
    } 
}
