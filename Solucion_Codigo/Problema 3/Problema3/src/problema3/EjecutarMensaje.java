/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import java.util.Scanner;


public class EjecutarMensaje {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número del remitente: ");
        String numeroRemitente = scanner.nextLine();
        System.out.print("Ingrese el nombre del remitente (opcional): ");
        String nombreRemitente = scanner.nextLine();
        
        if (nombreRemitente.equals("")) {
            nombreRemitente="Anonimo";
        }

        System.out.print("Ingrese el número del destinatario: ");
        String numeroDestinatario = scanner.nextLine();
        System.out.print("Ingrese el nombre del destinatario: ");
        String nombreDestinatario = scanner.nextLine();
        

        System.out.print("Ingrese el tipo de mensaje (sms/mms): ");
        String tipoMensaje = scanner.nextLine().trim().toLowerCase();

        
        if (tipoMensaje.equals("sms")) {
            System.out.print("Ingrese el mensaje de texto: ");
            String mensajeTexto = scanner.nextLine();
            SMS s = new SMS(numeroRemitente, numeroDestinatario,
                    nombreRemitente, nombreDestinatario, mensajeTexto);
            s.enviarMensaje();
            s.toString();
            System.out.println(s);
            s.visualisarMensaje();
            
        } else if (tipoMensaje.equals("mms")) {
            System.out.print("Ingrese el nombre del fichero de imagen: ");
            String nombreFicheroImagen = scanner.nextLine();
            MMS m = new MMS(numeroRemitente, numeroDestinatario, nombreRemitente, 
                    nombreDestinatario, nombreFicheroImagen);
            m.enviarMensaje();
            m.toString();
            System.out.println(m);
            m.visualisarMensaje();
            
        } else {
            System.out.println("Tipo de mensaje no válido");
            scanner.close();
            return;
        }
        
    }
    
}
