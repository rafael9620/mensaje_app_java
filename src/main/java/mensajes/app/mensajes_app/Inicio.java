

package mensajes.app.mensajes_app;

import java.sql.Connection;

/**
 *
 * @author FranciscoR
 */
public class Inicio {
    public static void main(String[] args) {
        
        Conexion conexion = new Conexion();
        
        
        try(Connection cnx = conexion.get_connection()){
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
