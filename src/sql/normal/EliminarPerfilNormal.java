package sql.normal;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import show.Sesion;
import static show.Sesion.editarCorreoObjectStatic;
import sql.Conexion;

/**
 *
 * @author neury
 */
public class EliminarPerfilNormal {
    public static void eliminarPerfil() {
        try {
            Conexion.getStatement().executeUpdate("DELETE FROM usuarios WHERE nCorreo='"+editarCorreoObjectStatic.getText()+"'");
        } catch (SQLException ex) {
            Logger.getLogger(Sesion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
