public class CuentaCorriente extends Cuenta{

    //Atributos
    private Double descubierto;

    //Constructor
    public CuentaCorriente(String numero, double saldo, Persona titular, double descubierto) {
        super(numero, saldo, titular);
        this.descubierto = 1000.0;
    }

    //Get and Set
    public void setDescubierto(double descubierto){
        this.descubierto = descubierto;
    }

    public double getDescubierto(){
        return descubierto;
    }

    //Métodos
    @Override
    public void extraer(double importe){
        if (importe<saldo+descubierto){
            this.saldo = saldo - importe;
        }
    }

    public void depositar(double importe){
        this.saldo = saldo + importe;
    }

    public void extraer() {
        if (1000.0 < saldo + descubierto) {
            this.saldo = saldo - 1000.0;
        }
    }
    @Override
    public int compareTo(Object object) {
        return 0;
    }
}
