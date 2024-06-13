/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema3;

/**
 *
 * @author Usuario
 */
public class MMS extends MensajeMovil {

    

    private String nombreImagen;

    public MMS(String numeroRemitente, String numeroDestinatario, String nombreRemitente,
            String nombreDestinatario, String nombreImagen) {
        super(numeroRemitente, numeroDestinatario, nombreRemitente, nombreDestinatario);
        this.nombreImagen = nombreImagen;
    }
    
    public String getNombreImagen() {
        return nombreImagen;
    }

    public void setNombreImagen(String nombreImagen) {
        this.nombreImagen = nombreImagen;
    }
    
    public void enviarMensaje(){
        super.enviarMensaje();
        System.out.println("Imagen enviada: "+nombreImagen);
    }
    
      public void visualisarMensaje(){
          super.visualisarMensaje();
          System.out.println("Imagen: "+nombreImagen);
    }
    
     @Override
    public String toString() {

        String cadena =  super.toString() + "\nTipo Mensaje: MMS\n ";
        return cadena;

    }  
      
      

}
