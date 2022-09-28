package datos;

import domain.cajeroAutomatico;
import java.util.Scanner;

public class accesoDatosOperacionesImpl implements accesoDatosOperaciones {

    @Override
    public int extraccion(cajeroAutomatico saldo) {
        int saldoFinal = 0;
        var sc = new Scanner(System.in);
        cajeroAutomatico saldoReal = new cajeroAutomatico(saldo.getSaldo());
        System.out.println("-----------------------");
        System.out.println("¿Cuanto desea extraer?");
        System.out.println("-----------------------");
        int extraccion = sc.nextInt();
        System.out.println("-----------------------");
        if (extraccion > saldoReal.getSaldo()) {
            System.out.println("No hay saldo suficiente");
            System.out.println("Consulte su saldo e intente de nuevo");
            saldoFinal= saldoReal.getSaldo();
            System.out.println("-----------------------");
        } else {
            saldoFinal = saldoReal.getSaldo() - extraccion;
            System.out.println("La extraccion se realizo con exito\n"
                    + "Has retirado $" + extraccion + " de tu cuenta");
            System.out.println("-----------------------");
        }
        return saldoFinal;

    }

    @Override
    public int deposito(cajeroAutomatico saldo) {
        int saldoFinal;
        var sc = new Scanner(System.in);
        cajeroAutomatico saldoReal = new cajeroAutomatico(saldo.getSaldo());
        System.out.println("-----------------------");
        System.out.println("¿Cuanto desea depositar?");
        int deposito = sc.nextInt();
        System.out.println("-----------------------");
        saldoFinal = saldoReal.getSaldo() + deposito;
        System.out.println("Se han depositado con exito $" + deposito + " a su cuenta");
        System.out.println("-----------------------");
        return saldoFinal;
    }

    @Override
    public int transferencia(cajeroAutomatico saldo) {
        int saldoFinal;
        cajeroAutomatico saldoReal = new cajeroAutomatico(saldo.getSaldo());
        var sc = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.println("Ingrese la cuenta a donde transferir");
        System.out.println("-----------------------");
        String cuenta = sc.nextLine();
        System.out.println("-----------------------");
        System.out.println("Ingrese la cantidad de dinero que quiera transferir");
        System.out.println("-----------------------");
        int transferencia = sc.nextInt();
        System.out.println("-----------------------");
        if (transferencia > saldoReal.getSaldo()) {
            System.out.println("No hay saldo suficiente");
            System.out.println("Consulte su saldo e intente de nuevo");
            saldoFinal = saldoReal.getSaldo();
            System.out.println("-----------------------");
        } else {
            saldoFinal = saldoReal.getSaldo() - transferencia;
            System.out.println("La transferencia se realizo con exito\n"
                    + "Se han transferido $" + transferencia + " a " + cuenta);
            System.out.println("-----------------------");
        }

        return saldoFinal;
    }

    @Override
    public void consulta(cajeroAutomatico saldo) {
        int consulta = saldo.getSaldo();
        System.out.println("-----------------------");
        System.out.println("Su saldo actual es de $" + consulta);
        System.out.println("-----------------------");
    }
    
}
