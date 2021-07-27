package sql.inserciones;

import front.Expresion;
import static front.IteradorMatematico.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sql.Conexion;
import sql.GetAndSet;
import sql.Identificador;

public class Insertar {
    public static void 
    cierreDeSesion() {
        try {
            String sqlHistorialObject = "INSERT INTO historial"
            + "(nUsuario, nHistoriador, nInicioDeSesion, nInicioDeSesionFecha, nCierreDeSesion, nCierreDeSesionFecha, "
            + "nActualizacion, nActualizacionFecha, nHistorialEliminado, nHistorialEliminadoFecha, nPerfilEliminado, "
            + "nPerfilEliminadoFecha) VALUES (?, ?, '', NOW(), ?, NOW(), '', NOW(), '', NOW(), '', NOW())";
            
            PreparedStatement historialObject = Conexion.getConexion().prepareStatement(sqlHistorialObject);
            historialObject.setInt(1, GetAndSet.getIdObject());
            historialObject.setString(2, Identificador.ipv4());
            historialObject.setString( 3, "Cierre de sesion: ");
            
            historialObject.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Insertar.class.getName()).log(Level.SEVERE, null, ex);
        } finally { 
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(Insertar.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }
    public static void 
    sugerencias() {
        PreparedStatement preparedStatementObject = null;
        
        String sqlEditarPerfilObject ="INSERT INTO "
        + "sugerencias (nNombre, nAsunto, nCorreo, nMensaje, nFecha) VALUES (?, ?, ?, ?, NOW())";
        
        GetAndSet.setAliasObject(sugerenciasNombreObjectStatic.getText());
        GetAndSet.setAsuntoObject(sugerenciasAsuntoObjectStatic.getText());
        GetAndSet.setEmailObject(sugerenciasCorreoObjectStatic.getText());
        GetAndSet.setMensajeObject(sugerenciasMensajeObjectStatic.getText());
        
        if(!Expresion.nombre(GetAndSet.getAliasObject())) {
            sugerenciasErrorObjectStatic.setText("El nombre no es valido.");
        } else if(!Expresion.correo(GetAndSet.getEmailObject())) {
            sugerenciasErrorObjectStatic.setText("El correo no es valido.");
        } else if(GetAndSet.getMensajeObject().isEmpty()) {
            sugerenciasErrorObjectStatic.setText("El mensaje no pueden estar vacias.");
        } else {
            try {
                sugerenciasErrorObjectStatic.setId("n-error-null-form");
                sugerenciasErrorObjectStatic.setText("Su Sugerencias a sido enviada.");

                preparedStatementObject = Conexion.getConexion().prepareStatement(sqlEditarPerfilObject);
                preparedStatementObject.setString(1, GetAndSet.getAliasObject());
                preparedStatementObject.setString(2, GetAndSet.getAsuntoObject());
                preparedStatementObject.setString(3, GetAndSet.getEmailObject());
                preparedStatementObject.setString(4, GetAndSet.getMensajeObject());
            
                preparedStatementObject.executeUpdate();
            } catch (SQLException sqleObject) { 
                sugerenciasErrorObjectStatic.setId("n-error-form");
                sugerenciasErrorObjectStatic.setText("No hay conexion"); 
            } finally { 
                try {
                    Conexion.getConexion().close();
                } catch (SQLException ex) {
                    Logger.getLogger(Insertar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }     
        }
    }
}
