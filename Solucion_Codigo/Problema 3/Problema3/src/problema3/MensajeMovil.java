/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema3;


public class MensajeMovil {
    protected String numeroRemitente;
    protected String numeroDestinatario;
    protected String nombreRemitente;
    protected String nombreDestinatario;

    public MensajeMovil(String numeroRemitente, String numeroDestinatario, String nombreRemitente, String nombreDestinatario) {
        this.numeroRemitente = numeroRemitente;
        this.numeroDestinatario = numeroDestinatario;
        this.nombreRemitente = nombreRemitente;
        this.nombreDestinatario = nombreDestinatario;
    }

    public String getNumeroRemitente() {
        return numeroRemitente;
    }

    public void setNumeroRemitente(String numeroRemitente) {
        this.numeroRemitente = numeroRemitente;
    }

    public String getNumeroDestinatario() {
        return numeroDestinatario;
    }

    public void setNumeroDestinatario(String numeroDestinatario) {
        this.numeroDestinatario = numeroDestinatario;
    }

    public String getNombreRemitente() {
        return nombreRemitente;
    }

    public void setNombreRemitente(String nombreRemitente) {
        this.nombreRemitente = nombreRemitente;
    }

    public String getNombreDestinatario() {
        return nombreDestinatario;
    }

    public void setNombreDestinatario(String nombreDestinatario) {
        this.nombreDestinatario = nombreDestinatario;
    }
    
    public void enviarMensaje(){
        System.out.println("Enviando Mensaje"); 
    }
    
    public void visualisarMensaje() {
        System.out.println("Abrinedo Mensaje");
    }
    
   @Override
    public String toString() {
        String cadena="Mensajes\n"+"Remitente:"+nombreRemitente
                +"\nNumero remintente: "+numeroRemitente+"\n"+"Destinatario: "+nombreDestinatario
                +"\nNumero destinatario: "+numeroDestinatario;
        return cadena;
    }
   
   
   
    
    
    
    
}
