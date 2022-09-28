package datos;

import domain.cajeroAutomatico;
import excepciones.accesoDatos;

public interface accesoDatosOperaciones{
    public int extraccion(cajeroAutomatico saldo) throws accesoDatos;
    public int deposito(cajeroAutomatico saldo)throws accesoDatos;
    public int transferencia(cajeroAutomatico saldo)throws accesoDatos;
    public void consulta(cajeroAutomatico saldo)throws accesoDatos;
}
