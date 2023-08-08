package mexbank;

import java.util.Scanner;

public class MexBank {
    //Variables e instancias de objetos
    static Scanner entrada = new Scanner(System.in);
    static double montoactual = 0;
    static int opcion;
    static CuentaAhorro cuentaAhorro = new CuentaAhorro(montoactual);
    static TarjetaCredito tarjetaCredito = new TarjetaCredito(montoactual);
    static TarjetaDebito tarjetaDebito = new TarjetaDebito(montoactual);
    
    public static void main(String[] args) {
        char respuesta;
        do {            
            //Menú de las acciones que puede realizar
            System.out.println("Bienvenido al banco MexBank");
            System.out.println("Estas son las acciones que puede realizar:");
            System.out.println("1. Depositar" + "\n2. Retirar" + "\n3. Invertir" + "\n4. Mostrar saldo actual"
            + "\nEscoga una poniendo el número");
            opcion = entrada.nextInt();
        
            switch (opcion) {
                case 1:
                    Depositar();
                    break;
                case 2:
                    Retirar();
                    break;
                case 3:
                    Invertir();
                    break;
                case 4:
                    MostrarSaldo();
                    break;
            }
            System.out.println("¿Quiere volver al menú principal? (s/n)");
            respuesta = entrada.next().charAt(0);
            System.out.println("");
        } while (respuesta == 's' || respuesta == 'S');  
    }
    
    //El método Depositar esta disponible para las tres clases hijas
    public static void Depositar(){
        //Menú sobre las cuentas que hay disponibles
        System.out.println("");
        System.out.println("¿Qué tipo de cuenta tiene?:");
        System.out.println("1. Tarjeta de débito" + "\n2. Tarjeta de crédito" + "\n3. Cuenta de ahorro");
        opcion = entrada.nextInt();
        System.out.println("");
        
        switch (opcion) {
            case 1:
                System.out.println("Ingrese la cantidad:");
                montoactual = entrada.nextDouble();
                tarjetaDebito.Depositar(montoactual);
                System.out.println("La acción fue procesada correctamente. ");
                System.out.println("");
                break;
            case 2:
                System.out.println("Ingrese la cantidad:");
                montoactual = entrada.nextDouble();
                tarjetaCredito.Depositar(montoactual);
                tarjetaCredito.SumarInteres(montoactual);
                System.out.println("La acción fue procesada correctamente."); 
                System.out.println("");
                break;
            case 3:
                System.out.println("Ingrese la cantidad:");
                montoactual = entrada.nextDouble();
                cuentaAhorro.Depositar(montoactual);
                System.out.println("La acción fue procesada correctamente.");
                System.out.println("");
                break;
        }
    }
    
    //El método Retirar solo esta disponible para la clase TarjetaDebito
    public static void Retirar(){
        System.out.println("");
        System.out.println("Ingrese la cantidad:");
        montoactual = entrada.nextDouble();
        tarjetaDebito.Retirar(montoactual);        
        System.out.println("La acción fue procesada correctamente."); 
        System.out.println("");
    }
    
    //El método Invertir esta solo disponible para la clase CuentaAhorro
    public static void Invertir(){
        System.out.println("");
        System.out.println("Ingrese la cantidad:");
        montoactual = entrada.nextDouble();
        cuentaAhorro.invertir(montoactual);       
        System.out.println("La acción fue procesada correctamente.");
        System.out.println("");
    }
    
    //El métdodo MostrarSaldo esta disponibles para las tres clases hijas
    public static void MostrarSaldo(){
        //Menú sobre las cuenta para mostrar su saldo de dicha cuenta
        System.out.println("¿Qué tipo de cuenta tiene para mostrar su saldo:");
        System.out.println("1. Tarjeta de debito \n2. Tarjeta de credito \n3. Cuenta de ahorro");
        opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("" + tarjetaDebito.toString());
                break;
            case 2:
                System.out.println("" + tarjetaCredito.toString());
                break;
            case 3:
                System.out.println("" + cuentaAhorro.toString());
                break;
        }
    }
}

