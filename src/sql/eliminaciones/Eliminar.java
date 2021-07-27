package sql.eliminaciones;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import show.Sesion;
import sql.Conexion;
import sql.GetAndSet;

public class Eliminar {
    public static void 
    fila() {
        String sqlEliminarHistorieliminarFilaObject ="DELETE FROM historial WHERE nID=? AND nUsuario=?";

        try {
            PreparedStatement preparedObject = Conexion.getConexion().prepareStatement(sqlEliminarHistorieliminarFilaObject);
            preparedObject.setObject(1, Sesion.TABLE_VIEW.getSelectionModel().getSelectedItem().getFila());
            preparedObject.setInt(2, GetAndSet.getIdObject());
            preparedObject.executeUpdate();

            Sesion.observableListStaticType.remove(Sesion.TABLE_VIEW.getSelectionModel().getSelectedIndex());
            Sesion.campoDeFilaObejctStatic.setText("");
        } catch (SQLException sqleObject) {
            Logger.getLogger(Eliminar.class.getName()).log(Level.SEVERE, null, sqleObject);
        } finally { 
            try {
                Conexion.getConexion().close();
            } catch (SQLException sqleObject) {
                Logger.getLogger(Eliminar.class.getName()).log(Level.SEVERE, null, sqleObject);
            }
        }
    }
    public static void 
    historial() {
        String sqlEliminarHistorialObject ="DELETE FROM historial WHERE nUsuario=?";

        try {
            PreparedStatement preparedObject = Conexion.getConexion().prepareStatement(sqlEliminarHistorialObject);
            preparedObject.setInt(1, GetAndSet.getIdObject());
            preparedObject.executeUpdate();
        } catch (SQLException sqleObject) {
            Logger.getLogger(Eliminar.class.getName()).log(Level.SEVERE, null, sqleObject);
        } finally { 
            try {
                Conexion.getConexion().close();
            } catch (SQLException sqleObject) {
                Logger.getLogger(Eliminar.class.getName()).log(Level.SEVERE, null, sqleObject);
            }
        }
    }
    public static void 
    perfil() {   
        String sqlHistorialObject = "INSERT INTO historial"
        + "(nUsuario, nHistoriador, nInicioDeSesion, nInicioDeSesionFecha, nCierreDeSesion, nCierreDeSesionFecha, "
        + "nActualizacion, nActualizacionFecha, nHistorialEliminado, nHistorialEliminadoFecha, nPerfilEliminado, "
        + "nPerfilEliminadoFecha) VALUES (?, ?, '', NOW(), '', NOW(), '', NOW(), '', NOW(), ?, NOW())";

        try {
            PreparedStatement historialObject = Conexion.getConexion().prepareStatement(sqlHistorialObject);
            historialObject.setInt(1, GetAndSet.getIdObject());
            historialObject.setString(2, GetAndSet.getIdentificadorObject());
            historialObject.setString( 3, 
                "Nombre: "      + GetAndSet.getNombreObject()     + "\n" +
                "Apellido: "    + GetAndSet.getApellidoObject()   + "\n" +
                "Correo: "      + GetAndSet.getCorreoObject()     + "\n" +
                "Contraseña: "  + GetAndSet.getPasswordObject()   + "\n" +
                "Plataforma: "  + GetAndSet.getPlataformaObject() + "\n" +
                "Fecha: "       + GetAndSet.getFechaObject()      
            );
            
            historialObject.executeUpdate();

            String sqlEliminarPerfilObject ="DELETE FROM usuarios WHERE nCorreo=?";

            try {
                PreparedStatement preparedObject = Conexion.getConexion().prepareStatement(sqlEliminarPerfilObject);
                preparedObject.setString(1, GetAndSet.getCorreoObject());

                preparedObject.executeUpdate();
            } catch (SQLException sqleObject) {
                Logger.getLogger(Eliminar.class.getName()).log(Level.SEVERE, null, sqleObject);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Eliminar.class.getName()).log(Level.SEVERE, null, ex);
        } finally { 
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(Eliminar.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }
}
