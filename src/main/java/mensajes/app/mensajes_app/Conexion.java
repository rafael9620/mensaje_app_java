/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensajes.app.mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author FranciscoR
 */
public class Conexion {

    public Connection get_connection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3380/mensajes_app", "root", "admin");
            if (connection != null) {
                //System.out.println("OK");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return connection;
    }

}
