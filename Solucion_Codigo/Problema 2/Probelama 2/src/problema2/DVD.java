/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2;

import java.util.List;


public class DVD extends Peliculas {
    
    // Declarando atributos 
    private String tipoCinta;
    private double calculaPrecioDVD;
    

    public DVD( String titulo, String autor, String añoedicion, List<String> idioma, double precioBase,Soporte soporte,String tipoCinta) {
        super(titulo, autor, añoedicion, idioma, precioBase,soporte);
        this.tipoCinta = tipoCinta;
    }

    public String getTipoCinta() {
        return tipoCinta;
    }

    public void setTipoCinta(String tipoCinta) {
        this.tipoCinta = tipoCinta;
    }
     public double getCalcularPrecioDVD() {
        return calculaPrecioDVD;
    }

    public void calcularPrecioDVD() {
        this.calculaPrecioDVD = (precioBase * 0.1)+precioBase;
    }
   
    @Override
    public String toString() {

        String cadena = super.toString()+"\nCapacidad: "+
               soporte.getCapacidasd()+"GB"+"\nTipo cinta: "+tipoCinta+"\nPrecio: "+calculaPrecioDVD+"\n";

        return cadena;
    }

}
