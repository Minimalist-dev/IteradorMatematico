package x.ficheros;

import front.Expresion;
import static front.IteradorMatematico.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sql.Conexion;
import sql.GetAndSet;

/**
 *
 * @author neury
 */
public class Sugerencias {
//    public static void 
//    sugerencias() {
//        PreparedStatement preparedStatementObject = null;
//        
//        String sqlEditarPerfilObject ="INSERT INTO "
//        + "sugerencias (nNombre, nAsunto, nCorreo, nMensaje, nFecha) VALUES (?, ?, ?, ?, NOW())";
//        
//        GetAndSet.setAliasObject(sugerenciasNombreObjectStatic.getText());
//        GetAndSet.setAsuntoObject(sugerenciasAsuntoObjectStatic.getText());
//        GetAndSet.setEmailObject(sugerenciasCorreoObjectStatic.getText());
//        GetAndSet.setMensajeObject(sugerenciasMensajeObjectStatic.getText());
//        
//        if(!Expresion.nombre(GetAndSet.getAliasObject())) {
//            sugerenciasErrorObjectStatic.setText("El nombre no es valido.");
//        } else if(!Expresion.correo(GetAndSet.getEmailObject())) {
//            sugerenciasErrorObjectStatic.setText("El correo no es valido.");
//        } else if(GetAndSet.getMensajeObject().isEmpty()) {
//            sugerenciasErrorObjectStatic.setText("El mensaje no pueden estar vacias.");
//        } else {
//            try {
//                sugerenciasErrorObjectStatic.setId("n-error-null-form");
//                sugerenciasErrorObjectStatic.setText("Su Sugerencias a sido enviada.");
//
//                preparedStatementObject = Conexion.getConexion().prepareStatement(sqlEditarPerfilObject);
//                preparedStatementObject.setString(1, GetAndSet.getAliasObject());
//                preparedStatementObject.setString(2, GetAndSet.getAsuntoObject());
//                preparedStatementObject.setString(3, GetAndSet.getEmailObject());
//                preparedStatementObject.setString(4, GetAndSet.getMensajeObject());
//            
//                preparedStatementObject.executeUpdate();
//            } catch (SQLException sqleObject) { 
//                sugerenciasErrorObjectStatic.setId("n-error-form");
//                sugerenciasErrorObjectStatic.setText("No hay conexion"); 
//            } finally { 
//                try {
//                    Conexion.getConexion().close();
//                } catch (SQLException ex) {
//                    Logger.getLogger(Registrarse.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }     
//        }
//    }
}
