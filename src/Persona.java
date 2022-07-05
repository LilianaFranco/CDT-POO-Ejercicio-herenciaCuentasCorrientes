import java.util.List;

public class Persona {

    //Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private List<CuentaCorriente> cuentas;

    //Constructor
    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<CuentaCorriente> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<CuentaCorriente> cuentas) {
        this.cuentas = cuentas;
    }

    //Métodos
    public String getNombreCompleto(){
        return (this.nombre + this.apellido);
    }

    public boolean esMayorEdad(){
        if (this.edad > 60){
            return true;
        }
        return false;
    }

    public double getSaldoTotal(){
        double saldo = 0;
        for (Object o: cuentas){
            saldo = saldo + 1000; //Cómo entrar a ver el saldo de cada item de la lista?
        }
        return saldo;
    }

    public void mostrarCuentas(){
        for (Object o: cuentas){
            System.out.println(this.cuentas);
        }
    }
}
