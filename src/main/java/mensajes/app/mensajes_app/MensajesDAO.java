/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensajes.app.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author FranciscoR
 */
public class MensajesDAO {
    
    

    public static void crearMensajeDb(Mensajes mensaje) {
        Conexion dbConnect = new Conexion();

        try ( Connection conexion = dbConnect.get_connection()) {

            PreparedStatement ps = null;

            try {
                String query = "INSERT INTO mensajes (mensaje, autor_mensajes) VALUES (?, ?)";
                ps = conexion.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, mensaje.getAutorMensaje());
                ps.executeUpdate();
                System.out.println("Funciono la consulta");
                System.out.println("---------------------------------------");

            } catch (SQLException ex) {
                System.out.println(ex);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void leerMensajeDb() {
        Conexion dbConnect = new Conexion();

        try ( Connection conexion = dbConnect.get_connection()) {

            PreparedStatement ps = null;
            ResultSet rs = null;

            try {
                String query = "SELECT * FROM mensajes";
                ps = conexion.prepareStatement(query);
                rs = ps.executeQuery();

                while (rs.next()) {
                    System.out.println("ID: " + rs.getInt("id_mensaje") + " Mensaje: " + rs.getString("mensaje") + " Autor: "+ rs.getString("autor_mensajes"));
                    System.out.println("Fecha: " + rs.getString("fecha"));
                    System.out.println("");
                    System.out.println("---------------------------------------");

                }

            } catch (SQLException ex) {
                System.out.println(ex);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void borrarMensajeDb(int id_mensaje) {
        Conexion dbConnect = new Conexion();

        try ( Connection conexion = dbConnect.get_connection()) {

            PreparedStatement ps = null;

            try {
                String query = "DELETE FROM mensajes WHERE (id_mensaje = ?)";
                ps = conexion.prepareStatement(query);
                ps.setInt(1, id_mensaje);
                ps.executeUpdate();
                System.out.println("El mensaje fue borrado");
                

            } catch (Exception e) {
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

    public static void actualizarMensajeDb(Mensajes mensaje) {
        Conexion dbConnect = new Conexion();

        try ( Connection conexion = dbConnect.get_connection()) {

            PreparedStatement ps = null;

            try {
                String query ="UPDATE mensajes SET mensaje = ? WHERE (id_mensaje = ?)";
                ps = conexion.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setInt(2, mensaje.getIdMensaje());
                ps.executeUpdate();
                System.out.println("El Mensaje fue actualizado");
                
                

            } catch (SQLException e) {
                System.out.println("El mensaje no se actualizo, error "+e);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }

        
    }
}
