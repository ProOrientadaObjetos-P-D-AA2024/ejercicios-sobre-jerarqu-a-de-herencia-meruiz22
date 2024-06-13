package ejecutarentradas;
public class DatosCentral extends DatosEntrada  {
     
    private int numeroL , tipo;
    private double precioN,precioA,calcularprecio;

    public DatosCentral(String nombres, String apellidos, String dni, int tipo ) {
        super(nombres, apellidos, dni);
        this.numeroL = 400;
        this.precioN = 20;
        this.precioA = 14;
        this.tipo = tipo;
        this.calcularprecio = 0;
    }  

    public int getNumeroL() {
        return numeroL;
    }

    public void setNumeroL(int numeroL) {
        this.numeroL = numeroL;
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

    public double getCalcularprecio() {
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
