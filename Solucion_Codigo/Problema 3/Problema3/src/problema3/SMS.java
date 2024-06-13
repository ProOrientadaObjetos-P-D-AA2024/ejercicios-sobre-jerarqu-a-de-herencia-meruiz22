/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema3;

/**
 *
 * @author Usuario
 */
public class SMS extends MensajeMovil {

    private String mensajeTexto;

    public SMS(String mensajeTexto, String numeroRemitente, String numeroDestinatario, String nombreRemitente, String nombreDestinatario) {
        super(numeroRemitente, numeroDestinatario, nombreRemitente, nombreDestinatario);
        this.mensajeTexto = mensajeTexto;
    }

    public String getMensajeTexto() {
        return mensajeTexto;
    }

    public void setMensajeTexto(String mensajeTexto) {
        this.mensajeTexto = mensajeTexto;
    }

    public void enviarMensaje() {
        super.enviarMensaje();
        System.out.println("Imagen enviada: " + mensajeTexto);
    }

    public void visualisarMensaje() {
        super.visualisarMensaje();
        System.out.println("Imagen: " + mensajeTexto);
    }

    @Override
    public String toString() {

        String cadena = super.toString() + "\nTipo Mensaje: SMS\n ";
        return cadena;

    }

}
