package ejecutartrabajadores;
public class trabajadorJefe extends Trabajadores {
    
    private double sueldo;

    public trabajadorJefe( String nombres, String apellidos, String direccion, String dni) {
        super(nombres, apellidos, direccion, dni);
        this.sueldo = 10000;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void Sueldo() {
        this.sueldo = 1000;
    }
}
