package negocio;

import domain.cajeroAutomatico;
import java.util.List;

public interface Operaciones {
    
    int extraer(cajeroAutomatico saldo);
    int depositar(cajeroAutomatico saldo);
    int transferir(cajeroAutomatico saldo);
    void consulta(cajeroAutomatico saldo);
    boolean otraOp();   
}
