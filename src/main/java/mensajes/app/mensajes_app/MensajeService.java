/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensajes.app.mensajes_app;

import java.util.Scanner;

/**
 *
 * @author FranciscoR
 */
public class MensajeService {
    
    public static void crearMensaje(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Cual es el mensaje que quiere escribir");
        String mensaje = sc.nextLine();
        
        System.out.println("Cual es el autor");
        String autor = sc.nextLine();
        
        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutorMensaje(autor);
        MensajesDAO.crearMensajeDb(registro);
    }
    
    public static void listarMensaje(){
        MensajesDAO.leerMensajeDb();
    }
    
    public static void borrarMensaje(){
    }
    
    public static void editarMensaje(){
    }
    
}
