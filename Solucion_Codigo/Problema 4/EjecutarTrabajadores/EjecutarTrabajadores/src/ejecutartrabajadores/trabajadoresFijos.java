package ejecutartrabajadores;
public class trabajadoresFijos extends Trabajadores {
    

     private double CalcularSueldo;

    public trabajadoresFijos( String nombres, String apellidos, String direccion, String dni) {
       super(nombres, apellidos, direccion, dni);
       this.CalcularSueldo= 450;
    }

    public double getCalcularSueldo() {
        return CalcularSueldo;
    }

    public void CalcularSueldo() {
        this.CalcularSueldo = 450;
    }
     
}
