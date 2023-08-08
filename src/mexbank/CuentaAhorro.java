package mexbank;

public class CuentaAhorro extends CuentaBase{
    
    public CuentaAhorro(double montoActual) {
        super(montoActual);
    }
    
    public void invertir(double cantidad){
        double resultado = 0;
        resultado = getMontoActual() * .10;
        setMontoActual(getMontoActual() + resultado); //Le asignamos un nuevo valor a montoActual
        System.out.println("Ha invertido: " + resultado);
    }

    @Override
    public String toString() {
        return "Su saldo es de: " + getMontoActual();
    }
    
    
}
