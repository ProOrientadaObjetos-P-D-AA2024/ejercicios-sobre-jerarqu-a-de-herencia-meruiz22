package ejecutartrabajadores;
public class trabajadoresPorhoras extends Trabajadores {
    
    private double precioHoras;
    private int horasTrabajadas;
    private double calcularsueldo;

    public trabajadoresPorhoras( String nombres, String apellidos, String direccion, String dni, double precioHoras, int horasTrabajadas) {
        super(nombres, apellidos, direccion, dni);
        this.precioHoras = precioHoras;
        this.horasTrabajadas = horasTrabajadas;
        this.calcularsueldo = precioHoras *horasTrabajadas ;
    }

    public double getPrecioHoras() {
        return precioHoras;
    }

    public void setPrecioHoras(double precioHoras) {
        this.precioHoras = precioHoras;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    } 

    public double getCalcularsueldo() {
        return calcularsueldo;
    }

    public void Calcularsueldo(double calcularsueldo) {
        this.calcularsueldo = precioHoras *horasTrabajadas ;
    }
}
