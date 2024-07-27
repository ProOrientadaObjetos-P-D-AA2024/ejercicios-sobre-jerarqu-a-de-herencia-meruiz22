/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2;

import java.util.List;

public class VHS extends Peliculas {

    // Declarando atributos 
    private String tipoCinta;
    private double calcularPrecioVhs;

    // Contructor con atributos herredados de la clase Peliculas 
    public VHS(String titulo, String autor, String añoedicion, List<String> idioma, double precioBase, Soporte soporte, String tipoCinta) {
        super(titulo, autor, añoedicion, idioma, precioBase, soporte);
        this.tipoCinta = tipoCinta;
    }

    public double getCalcularPrecioVhs() {
        return calcularPrecioVhs;
    }

    public void calcularPrecioVhs() {
        this.calcularPrecioVhs = precioBase;
    }

    @Override
    public String toString() {

        String cadena = super.toString() + "\nTipo Cinta: "
                + tipoCinta + "\nSoporte: " + soporte.getTipo() + "\nPrecio: " + calcularPrecioVhs + "\n";

        return cadena;

    }
}
