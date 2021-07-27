package sql.inserciones;

import front.Expresion;
import front.IteradorMatematico;
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

public class Registrarse {
    public static void 
    registrarse() {
        PreparedStatement preparedStatementObject = null;
        PreparedStatement preparedStatementRegistrarseObject = null;
        PreparedStatement preparedStatementSesionObject = null;
        ResultSet resultSetCorreoObject = null;
        ResultSet resultSetSesionObject = null;
        
        GetAndSet.setNombreObject(registrarseNombreFieldObjectStatic.getText());
        GetAndSet.setApellidoObject(registrarseApellidosFieldObjectStatic.getText());
        GetAndSet.setCorreoObject(registrarseCorreoFieldObjectStatic.getText());
        GetAndSet.setPasswordObject(registrarsePasswordFieldObjectStatic.getText());

        if(!Expresion.nombre(GetAndSet.getNombreObject())) {
            registrarseErrorObjectStatic.setText("El nombre no es valido.");
        } else if(!Expresion.apellidos(GetAndSet.getApellidoObject())) {
            registrarseErrorObjectStatic.setText("El apellido no es valido.");
        } else if(!Expresion.correo(GetAndSet.getCorreoObject())) {
            registrarseErrorObjectStatic.setText("El correo no es valido.");
        } else if(!Expresion.password(GetAndSet.getPasswordObject())) {
            registrarseErrorObjectStatic.setText("La contraseña no es valida.");
        } else {
            String sqlCorreoObject = "SELECT * FROM usuarios WHERE nCorreo=? LIMIT 1";

            try {
                preparedStatementObject = Conexion.getConexion().prepareStatement(sqlCorreoObject);
                preparedStatementObject.setString(1, GetAndSet.getCorreoObject());
              
                resultSetCorreoObject = preparedStatementObject.executeQuery();
                
                if(resultSetCorreoObject.next()) {
                    registrarseErrorObjectStatic.setText("EL CORREO YA ESTA RESGISTRADO.");
                } else {
                    String sqlRegistrarseObject = "INSERT INTO usuarios "
                    + "(nIdentificador, nNombre, nApellido, nCorreo, nPassword, nPlataforma, nFecha, nNombreDeImagen) "
                    + "VALUES (?, ?, ?, ?, ?, ?, NOW(), ?)";

                    String sqlSesionObject = "SELECT * FROM usuarios WHERE nCorreo=? AND nPassword=? LIMIT 1";

                    try {
                        preparedStatementRegistrarseObject = Conexion.getConexion().prepareStatement(sqlRegistrarseObject);
                        preparedStatementRegistrarseObject.setString(1, Identificador.ipv4());
                        preparedStatementRegistrarseObject.setString(2, GetAndSet.getNombreObject());
                        preparedStatementRegistrarseObject.setString(3, GetAndSet.getApellidoObject());
                        preparedStatementRegistrarseObject.setString(4, GetAndSet.getCorreoObject());
                        preparedStatementRegistrarseObject.setString(5, GetAndSet.getPasswordObject());
                        preparedStatementRegistrarseObject.setString(6, "Software");
                        preparedStatementRegistrarseObject.setString(7, "avatar_masculino.png");
                                
                        preparedStatementRegistrarseObject.executeUpdate();
                        
                        
                        preparedStatementSesionObject = Conexion.getConexion().prepareStatement(sqlSesionObject);
                        preparedStatementSesionObject.setString(1, GetAndSet.getCorreoObject());
                        preparedStatementSesionObject.setString(2, GetAndSet.getPasswordObject());
                        
                        
                        resultSetSesionObject = preparedStatementObject.executeQuery();
                        
                        String sqlHistorialObject = "INSERT INTO historial"
                        + "(nUsuario, nHistoriador, nInicioDeSesion, nInicioDeSesionFecha, nCierreDeSesion, nCierreDeSesionFecha, "
                        + "nActualizacion, nActualizacionFecha, nHistorialEliminado, nHistorialEliminadoFecha, nPerfilEliminado, "
                        + "nPerfilEliminadoFecha) VALUES (?, ?, ?, NOW(), '', NOW(), '', NOW(), '', NOW(), '', NOW())";

                        if(resultSetSesionObject.next()) { 
                            registrarseErrorObjectStatic.setText("");
                            GetAndSet.setCorreoObject(GetAndSet.getCorreoObject());
                            Sesion sesionObject = new Sesion(); borderPaneObjectStatic.setCenter(sesionObject.sesion());
                            
                            PreparedStatement historialObject = Conexion.getConexion().prepareStatement(sqlHistorialObject);
                            historialObject.setInt(1, GetAndSet.getIdObject());
                            historialObject.setString(2, GetAndSet.getIdentificadorObject());
                            historialObject.setString( 3, "Inicio de sesion: ");

                            historialObject.executeUpdate();
                        } //else { registrarseErrorObjectStatic.setText("ERROR."); }
                    } catch (SQLException sqleObject) {
                        System.out.println(sqleObject);
                    } finally {
                        try {
                            if (Conexion.getStatement() != null) { Conexion.getStatement().close(); }
                        } catch (SQLException ex) {
                            Logger.getLogger(IteradorMatematico.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            } catch (SQLException sqleObject) { 
                registrarseErrorObjectStatic.setText("No hay conexion"); 
            } finally { 
                try {
                    Conexion.getConexion().close();
                } catch (SQLException ex) {
                    Logger.getLogger(Registrarse.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
