import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        Persona clienteUno = new Persona("Liliana", "Franco", 37);
        CuentaCorriente cuentaUno = new CuentaCorriente("123", 1000, clienteUno, 500);
        CuentaCorriente cuentaDos = new CuentaCorriente("456", 1200, clienteUno, 500);
        CuentaCorriente cuentaTres = new CuentaCorriente("789", 800, clienteUno, 500);

        List cuentasClienteUno = new ArrayList();
        cuentasClienteUno.add(cuentaUno);
        cuentasClienteUno.add(cuentaDos);
        cuentasClienteUno.add(cuentaTres);

        System.out.println("Bienvenido, " + clienteUno.getNombreCompleto());
        System.out.println(clienteUno.getCuentas());
        clienteUno.setCuentas(cuentasClienteUno);
        System.out.println(clienteUno.getCuentas());
    }
}