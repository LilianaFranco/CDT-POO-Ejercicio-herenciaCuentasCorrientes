abstract class Cuenta implements CompareTo {

    //Atributos
    private String numero;
    private Persona titular;
    protected double saldo;



    //Constructor
    public Cuenta(String numero, double saldo, Persona titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    //Getters and Setters
    public double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return numero;
    }

    //Métodos
    public void extraer(double importe) {
        if (importe <= saldo)
            saldo -= importe;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public void depositar(double importe) {
        saldo += importe;
    }

    public int hashCode() {
        int hash = 31;
        hash = hash* numero.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object o){
        if (o == null){
            return false;
        }
        if (this.getClass() != o.getClass()){
            return false;
        }else{
            Cuenta cuenta = (Cuenta)o;
            if(this.getNumero().equals(cuenta.getNumero())){
                return true;
            }else{
                return false;
            }
        }
    }

    @Override
    public String toString() {
        return "\n" + "Numero de cuenta: " + numero + ", " + "Saldo: " + saldo;
    }

    @Override
    public abstract int compareTo(Object object);
}