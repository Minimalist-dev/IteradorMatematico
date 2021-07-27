package sql.normal;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import show.Sesion;
import static show.Sesion.*;
import sql.Conexion;

/**
 *
 * @author neury
 */
public class EditarPerfilNormal {
    public static void editarPerfil() {
        try {
            Conexion.getStatement().executeUpdate("UPDATE usuarios "
            + "SET nNombre ='"+editarNombreObjectStatic.getText()+"', nApellido = '"+editarApellidoObjectStatic.getText()+"',"
            + " nCorreo = '"+editarCorreoObjectStatic.getText()+"', nPassword = '"+editarPasswordObjectStatic.getText()+"' "
            + "WHERE nCorreo = '"+editarCorreoObjectStatic.getText()+"'");
        } catch (SQLException ex) {
            Logger.getLogger(Sesion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
