package sql.normal;

import java.sql.ResultSet;
import java.sql.SQLException;
import sql.Conexion;
import sql.GetAndSet;

/**
 *
 * @author neury
 */
public class PerfilNormal { 
    public static void 
    perfilConsulta() {
        String sqlPerfilObject ="SELECT * FROM usuarios WHERE nCorreo='"+GetAndSet.getCorreoObject()+"'";

        try {
            ResultSet resultSetObject = Conexion.getStatement().executeQuery(sqlPerfilObject);

            while (resultSetObject.next()) {
                GetAndSet.setNombreObject(resultSetObject.getString(1));
                GetAndSet.setApellidoObject(resultSetObject.getString(2));
                GetAndSet.setCorreoObject(resultSetObject.getString(3));
                GetAndSet.setPasswordObject(resultSetObject.getString(4));
            }
        } catch (SQLException sqleObject) {
            System.out.println(sqleObject);
        }
    } 
}
