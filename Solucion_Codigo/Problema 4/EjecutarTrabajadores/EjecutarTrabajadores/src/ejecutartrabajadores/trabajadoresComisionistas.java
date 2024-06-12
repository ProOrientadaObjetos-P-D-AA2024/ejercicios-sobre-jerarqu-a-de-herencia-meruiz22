package ejecutartrabajadores;
public class trabajadoresComisionistas extends Trabajadores {
    
    private int ventasRealizadas;
    private double porcentajeVentas;
    private double calcularsueldo;
    public trabajadoresComisionistas( String nombres, String apellidos, String direccion, String dni, int ventasRealizadas, double porcentajeVentas) {
        super(nombres, apellidos, direccion, dni);
        this.ventasRealizadas = ventasRealizadas;
        this.porcentajeVentas = porcentajeVentas;
        this.calcularsueldo = porcentajeVentas*ventasRealizadas;
    }

    public int getVentasRealizadas() {
        return ventasRealizadas;
    }

    public void setVentasRealizadas(int ventasRealizadas) {
        this.ventasRealizadas = ventasRealizadas;
    }

    public double getPorcentajeVentas() {
        return porcentajeVentas;
    }

    public void setPorcentajeVentas(double porcentajeVentas) {
        this.porcentajeVentas = porcentajeVentas;
    }

    public double getCalcularsueldo() {
        return calcularsueldo;
    }

    public void Calcularsueldo() {
        this.calcularsueldo = (porcentajeVentas*ventasRealizadas);
    }
    
    

}
