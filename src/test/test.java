package test;

import domain.cajeroAutomatico;
import java.util.Scanner;
import negocio.Operaciones;
import negocio.OperacionesImpl;

public class test {

    public static void main(String[] args) {
        
        boolean salir= false;
        var sc = new Scanner(System.in);
        Operaciones saldo = new OperacionesImpl();
        cajeroAutomatico miSaldo = new cajeroAutomatico();
        int saldoFinal;

        do {
            System.out.println("Ingrese su saldo: ");
            int saldoIngresado = sc.nextInt();
            miSaldo.setSaldo(saldoIngresado);

        } while (saldo == null);
        do {

            System.out.println("---------CAJERO AUTOMATICO---------");
            System.out.println("Bienvenido al Cajero Automatico\n"
                    + "¿Que operacion desea realizar?\n"
                    + "1. Extraccion\n"
                    + "2. Deposito\n"
                    + "3. Transferencia\n"
                    + "4. Consultar Saldo\n"
                    + "5. Salir\n"
                    + "-----------------------");
            var numero = sc.nextInt();
            switch (numero) {
                case 1:
                    saldoFinal = saldo.extraer(miSaldo);
                    miSaldo.setSaldo(saldoFinal);
                    salir= saldo.otraOp();
                    break;
                case 2:
                    saldoFinal = saldo.depositar(miSaldo);
                    miSaldo.setSaldo(saldoFinal);
                    salir= saldo.otraOp();
                    break;
                case 3:
                    saldoFinal = saldo.transferir(miSaldo);
                    miSaldo.setSaldo(saldoFinal);
                    salir= saldo.otraOp();
                    break;
                case 4:
                    saldo.consulta(miSaldo);
                    break;
                case 5:
                    System.out.println("-----------------------");
                    System.out.println("Muchas gracias por usar el Cajero Automatico");
                    System.out.println("Adios!!");
                    salir = true;
                    break;
                default:
                    System.out.println("Has introducido un numero no valido.");
                    System.out.println("Ingrese un valor entre 1 y 5");
                    salir = false;    
            }
        } while (salir != true);

    }
}
