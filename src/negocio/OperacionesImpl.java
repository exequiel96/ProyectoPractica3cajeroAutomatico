package negocio;

import datos.accesoDatosOperacionesImpl;
import domain.cajeroAutomatico;
import java.util.Scanner;


public class OperacionesImpl implements Operaciones{
    
    
    
    private accesoDatosOperacionesImpl datos;
    
    public OperacionesImpl(){
        this.datos= new accesoDatosOperacionesImpl();
    }

    @Override
    public int extraer(cajeroAutomatico saldo) {
        int extraccion=datos.extraccion(saldo);
        return extraccion;
    }

    @Override
    public int depositar(cajeroAutomatico saldo) {
        int deposito= datos.deposito(saldo);
        return deposito;
    }

    @Override
    public int transferir(cajeroAutomatico saldo) {
        int transferencia= datos.transferencia(saldo);
        return transferencia;
    }
    
    @Override
    public void consulta(cajeroAutomatico saldo){
        datos.consulta(saldo);
    }
    
    @Override
    public boolean otraOp(){
        boolean salir = false;
        var sc= new Scanner(System.in);
        System.out.println("¿Desea realizar otra operacion?  SI / NO");
        System.out.println("-----------------------");
        String desicion= sc.nextLine();
        if(desicion.equalsIgnoreCase("si")){
            salir= false;
        }
        else if(desicion.equalsIgnoreCase("no")){
            System.out.println("Muchas gracias por usar el Cajero Automatico\n"
                    + "¡¡Adios!!");
            salir= true;
        }
        else{
            System.out.println("El valor introducido es incorrecto\n"
                    + "Ingresa SI / NO");
            desicion= sc.nextLine();
        }
        return salir;
        
    }
}
