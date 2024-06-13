package ejecutarentradas;
public class DatosPrincipal extends DatosEntrada {
    
    private int numeroL,tipo ;
    private double precioN,precioA, calcularprecio;

    public DatosPrincipal(String nombres, String apellidos, String dni, int tipo) {
        super(nombres, apellidos, dni);
        this.numeroL = 200;
        this.precioN = 25;
        this.precioA = 17.5;
        this.tipo = tipo;
        this.calcularprecio = 0;
    }

    public double getPrecioN() {
        return precioN;
    }

    public void setPrecioN(double precioN) {
        this.precioN = precioN;
    }

    public double getPrecioA() {
        return precioA;
    }

    public void setPrecioA(double precioA) {
        this.precioA = precioA;
    }

    public double getcalcularprecio() {
        return calcularprecio;
    }

    public void calcularprecio() {
        if (tipo == 1){
            this.calcularprecio = precioN ;
        }
        
        if(tipo == 2 ){
            this.calcularprecio = precioA;
        }
        
        if(tipo == 3){
            this.calcularprecio =  precioN - (precioN * 0.15) ;
        }
    }
}
