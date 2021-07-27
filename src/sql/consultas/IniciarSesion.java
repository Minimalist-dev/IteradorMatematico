package sql.consultas;

import front.Expresion;
import static front.IteradorMatematico.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import show.Sesion;
import sql.Conexion;
import sql.GetAndSet;
import sql.Identificador;

public class IniciarSesion {
    public static boolean 
    iniciarSesion() {
        GetAndSet.setCorreoObject(iniciarSesionCorreoObjectStatic.getText());
        GetAndSet.setPasswordObject(iniciarSesionPasswordObjectStatic.getText());
        
        if (!Expresion.correo(GetAndSet.getCorreoObject())){
            iniciarSesionErrorObjectStatic.setText("El correo no es valido.");
        } else if (!Expresion.password(GetAndSet.getPasswordObject())) {
            iniciarSesionErrorObjectStatic.setText("La contraseña no es valida.");
        } else {
            String sql = "SELECT nCorreo, nPassword FROM usuarios WHERE nCorreo = ? AND nPassword = ? LIMIT 1";
            
            try {
                PreparedStatement preparedObject = Conexion.getConexion().prepareStatement(sql);
                preparedObject.setString(1, GetAndSet.getCorreoObject());
                preparedObject.setString(2, GetAndSet.getPasswordObject());
                ResultSet resultSetObject = preparedObject.executeQuery();
                
                String sqlHistorialObject = "INSERT INTO historial"
                + "(nUsuario, nHistoriador, nInicioDeSesion, nInicioDeSesionFecha, nCierreDeSesion, nCierreDeSesionFecha, "
                + "nActualizacion, nActualizacionFecha, nHistorialEliminado, nHistorialEliminadoFecha, nPerfilEliminado, "
                + "nPerfilEliminadoFecha) VALUES (?, ?, ?, NOW(), '', NOW(), '', NOW(), '', NOW(), '', NOW())";
                
                if (resultSetObject.next()) {
                    if (GetAndSet.getCorreoObject().equals(resultSetObject.getString(1)) 
                    && GetAndSet.getPasswordObject().equals(resultSetObject.getString(2))) {
                        iniciarSesionErrorObjectStatic.setText("");
                        GetAndSet.setCorreoObject(GetAndSet.getCorreoObject());
                        Sesion sesionObject = new Sesion(); borderPaneObjectStatic.setCenter(sesionObject.sesion());
                        
                        PreparedStatement historialObject = Conexion.getConexion().prepareStatement(sqlHistorialObject);
                        historialObject.setInt(1, GetAndSet.getIdObject());
                        historialObject.setString(2, Identificador.ipv4());
                        historialObject.setString( 3, "Inicio de sesion: ");

                        historialObject.executeUpdate();
                        
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    iniciarSesionErrorObjectStatic.setText("Los datos son incorrectos");
                }
                
                return false;
            } catch (SQLException sqleObject) {
                iniciarSesionErrorObjectStatic.setText("No hay conexion"); return false; 
            } finally { 
                try {
                    Conexion.getConexion().close();
                } catch (SQLException sqleObject) {
                    Logger.getLogger(IniciarSesion.class.getName()).log(Level.SEVERE, null, sqleObject);
                }
            }
        }
        
        return false;   
    }
}
