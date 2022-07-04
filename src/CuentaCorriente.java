public class CuentaCorriente extends Cuenta{
    private Double descubierto;

    public CuentaCorriente(String numero, double saldo, double descubierto) {
        super(numero, saldo);
        this.descubierto = 1000.0;
    }

    public void setDescubierto(double descubierto){
        this.descubierto = descubierto;
    }

    public double getDescubierto(){
        return descubierto;
    }

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
}
