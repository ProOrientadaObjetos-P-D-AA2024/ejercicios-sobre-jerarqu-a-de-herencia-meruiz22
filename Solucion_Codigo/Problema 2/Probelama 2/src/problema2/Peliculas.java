/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2;

import java.util.List;

public class Peliculas {

    protected String titulo;
    protected String autor;
    protected String añoedicion;
    protected List<String> idioma;
    protected double precioBase;
    protected Soporte soporte;

    public Peliculas(String titulo, String autor, String añoedicion, List<String> idioma, double precioBase, Soporte soporte) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoedicion = añoedicion;
        this.idioma = idioma;
        this.precioBase = precioBase;
        this.soporte = soporte;
    }

    public Soporte getSoporte() {
        return soporte;
    }

    public void setSoporte(Soporte soporte) {
        this.soporte = soporte;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAñoedicion() {
        return añoedicion;
    }

    public void setAñoedicion(String añoedicion) {
        this.añoedicion = añoedicion;
    }

    public List<String> getIdioma() {

        return idioma;
    }

    public void setIdioma(List<String> idioma) {
        this.idioma = idioma;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public String toString() {

        String cadena = "Alquler de Peliculas \nPelicula: " + titulo + "\nAutor: " + autor + "\nAño Edicion: "
                + añoedicion + "\nIdioma:" + idioma;

        return cadena;

    }
}
