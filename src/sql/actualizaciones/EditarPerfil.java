package sql.actualizaciones;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import show.Sesion;
import sql.Conexion;
import sql.GetAndSet;
import sql.Identificador;

public class EditarPerfil {
    public static void 
    editarPerfil() {
        int usuario = 1;
        String datosMatriz[] = { "", "", "", "" };  
        
        String sqlHistorialObject = "INSERT INTO historial"
        + "(nUsuario, nHistoriador, nInicioDeSesion, nInicioDeSesionFecha, nCierreDeSesion, nCierreDeSesionFecha, "
        + "nActualizacion, nActualizacionFecha, nHistorialEliminado, nHistorialEliminadoFecha, nPerfilEliminado, "
        + "nPerfilEliminadoFecha) VALUES (?, ?, '', NOW(), '', NOW(), ?, NOW(), '', NOW(), '', NOW())";

        try {
            PreparedStatement historialObject = Conexion.getConexion().prepareStatement(sqlHistorialObject);
            historialObject.setInt(1, GetAndSet.getIdObject());
            historialObject.setString(2, Identificador.ipv4());
            
            switch (usuario) {
                case 1:  
                    if(!Sesion.editarNombreObjectStatic.getText().equals(GetAndSet.getNombreObject())) {
                        datosMatriz[0] = Sesion.editarNombreObjectStatic.getText();
                    } else { datosMatriz[0] = ""; }
//              break;
                case 2:  
                    if(!Sesion.editarApellidoObjectStatic.getText().equals(GetAndSet.getApellidoObject())) { 
                        datosMatriz[1] = Sesion.editarApellidoObjectStatic.getText();
                    } else { datosMatriz[1] = ""; }
//              break;
                case 3:  
                    if(!Sesion.editarPasswordObjectStatic.getText().equals(GetAndSet.getPasswordObject())) {
                        datosMatriz[2] = Sesion.editarPasswordObjectStatic.getText();
                    } else { datosMatriz[2] = ""; }
                break;
                default: datosMatriz[3] = "Invalid update";
                break;
            }
            
            historialObject.setString( 3,
                "Nombre: "      + datosMatriz[0] + "\n" +
                "Apellido: "    + datosMatriz[1] + "\n" +
                "Contraseña: "  + datosMatriz[2]
            );
            
            historialObject.executeUpdate();
        
            String sqlObject ="UPDATE usuarios "
            + "SET nNombre=?, nApellido=?, nPassword=?, nImagen=?, nNombreDeImagen=? WHERE nCorreo=?";

            try {
                PreparedStatement preparedObject = Conexion.getConexion().prepareStatement(sqlObject);
                preparedObject.setString(1, Sesion.editarNombreObjectStatic.getText());
                preparedObject.setString(2, Sesion.editarApellidoObjectStatic.getText());
                preparedObject.setString(3, Sesion.editarPasswordObjectStatic.getText());
                preparedObject.setBinaryStream(4 , GetAndSet.getImagenObject(), GetAndSet.getLongitudDeImagenObject());
                preparedObject.setString(5, GetAndSet.getNombreDeImagenObject());
                preparedObject.setString(6, Sesion.editarCorreoObjectStatic.getText());
                preparedObject.executeUpdate();
            } catch (SQLException sqleObject) {
                Logger.getLogger(Sesion.class.getName()).log(Level.SEVERE, null, sqleObject);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EditarPerfil.class.getName()).log(Level.SEVERE, null, ex);
        } finally { 
                try {
                    Conexion.getConexion().close();
                } catch (SQLException ex) {
                    Logger.getLogger(EditarPerfil.class.getName()).log(Level.SEVERE, null, ex);
                }
            } 
    }
}
