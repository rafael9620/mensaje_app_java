package mensajes.app.mensajes_app;


import java.util.Scanner;

/**
 *
 * @author FranciscoR
 */
public class Inicio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("-------------------");
            System.out.println("Aplicacion de mensajes");
            System.out.println("1. Crear un mensaje");
            System.out.println("2. Listar un mensaje");
            System.out.println("3. Editar un mensaje");
            System.out.println("4. Eliminar un mensaje");
            System.out.println("5. Salir de la aplicacion");
            
            //Leer las opciones que de el usuario.
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    MensajeService.crearMensaje();
                    break;
                case 2:
                    MensajeService.listarMensaje();
                    break;
                case 3:
                    MensajeService.editarMensaje();
                    break;
                case 4:
                    MensajeService.borrarMensaje();
                    break;
                default:
                    break;
            }
        } while (opcion != 5);

        
    }

}
