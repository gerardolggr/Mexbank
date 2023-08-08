package mexbank;

public class TarjetaCredito extends CuentaBase{
    
    public TarjetaCredito(double montoActual) {
        super(montoActual);
    }
        
    public void SumarInteres(double cantidad){
        double resultado = getMontoActual() * .15; 
        setMontoActual(getMontoActual() + resultado); //Le asigno un nuevo valor a montoActual
    }

    @Override
    public String toString() {
        return "Tiene una deuda de: " + getMontoActual() ;
    }
    
    
}
