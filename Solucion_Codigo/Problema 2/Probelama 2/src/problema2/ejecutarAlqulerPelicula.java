/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import java.util.Arrays;

public class ejecutarAlqulerPelicula {

    public static void main(String[] args) {

        Soporte dvd = new Soporte(16);
        Soporte Vhs = new Soporte("Poliester");

        DVD d = new DVD("Titanes del pacifico", "Guillermo del Toro",
                "2014", Arrays.asList("Español", "Ingles"), 16.50, dvd, "Dvd");
        VHS v = new VHS("Titanes del pacifico", "Guillermo del Toro",
                "2014", Arrays.asList("Español", "Ingles"), 16.50, Vhs, "VHS");

        dvd.getCapacidasd();
        Vhs.getTipo();
        d.calcularPrecioDVD();
        d.toString();
        v.calcularPrecioVhs();
        v.toString();

        System.out.println(d);
        System.out.println(v);
    }

}
