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

    public static void crearMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es el mensaje que quiere escribir");
        String mensaje = sc.nextLine();

        System.out.println("Cual es el autor");
        String autor = sc.nextLine();

        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutorMensaje(autor);
        MensajesDAO.crearMensajeDb(registro);
    }

    public static void listarMensaje() {
        MensajesDAO.leerMensajeDb();
    }

    public static void borrarMensaje() {
        System.out.println("---------------------------------------");
        System.out.println("Estos son los mensajes que puede borrar");
        MensajesDAO.leerMensajeDb();
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es el ID del mensaje que quiere eliminar?");
        int id_mensaje = sc.nextInt();
        MensajesDAO.borrarMensajeDb(id_mensaje);
        System.out.println("---------------------------------------");
    }

    public static void editarMensaje() {
        System.out.println("---------------------------------------");
        System.out.println("Estos son los mensajes que puede editar");
        MensajesDAO.leerMensajeDb();
        System.out.println("---------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el id del mensaje que quiere editat");
        int idNuevoMensaje = Integer.parseInt(sc.nextLine());
        System.out.println("Escribe el nuevo mensaje");
        String nuevoMensaje = sc.nextLine();        
        
        Mensajes update = new Mensajes();
        update.setMensaje(nuevoMensaje);
        update.setIdMensaje(idNuevoMensaje);
        MensajesDAO.actualizarMensajeDb(update);
        System.out.println("---------------------------------------");
        ;
        
    }

}
