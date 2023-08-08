package mexbank;

public class TarjetaDebito extends CuentaBase{
    
    public TarjetaDebito(double montoActual){
        super(0);
    }
    
    public void Retirar(double cantidad){
        double resultado = 0;
        resultado = getMontoActual() - cantidad;
        setMontoActual(resultado); //Le asignamos un nuevo valor a montoActual
        resultado = cantidad;
        System.out.println("Ha retirado " + resultado);
    }

    @Override
    public String toString() {
        return "Su saldo es de: " + getMontoActual();
    }
    
    
    
}
