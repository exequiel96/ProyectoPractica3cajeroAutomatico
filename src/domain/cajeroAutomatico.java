package domain;


public class cajeroAutomatico {
    private int saldo; 
    public cajeroAutomatico(){
    }   
    
    public cajeroAutomatico(int saldo){
        this.saldo= saldo;
    }
    
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.saldo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final cajeroAutomatico other = (cajeroAutomatico) obj;
        return this.saldo == other.saldo;
    }
    
    

    @Override
    public String toString() {
        return "cajeroAutomatico{" + "saldo=" + saldo + '}';
    }
    
    
    
    
   
    

        
}
