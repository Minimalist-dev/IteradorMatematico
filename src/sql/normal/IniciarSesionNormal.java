package sql.normal;

import static front.IteradorMatematico.*;
import java.sql.SQLException;
import show.Sesion;
import sql.Conexion;
import sql.GetAndSet;

/**
 *
 * @author neury
 */
public class IniciarSesionNormal {
    public static void iniciarSesion() {
        if(!iniciarSesionCorreoObjectStatic.getText().isEmpty()
        &&  !iniciarSesionPasswordObjectStatic.getText().isEmpty()) {  
            String sqlObject = "SELECT * FROM usuarios "
            + "WHERE nCorreo='"+iniciarSesionCorreoObjectStatic.getText()+"' "
            + "AND nPassword='"+iniciarSesionPasswordObjectStatic.getText()+"' LIMIT 1";

            try {
                if(Conexion.setResultSet(sqlObject).next()) { 
//                    iniciarSesionFormObject.setDisable(false);
//                    iniciarSesionPaneObject.setVisible(false);
//                    leftVBoxObject.setPrefSize(WIDTH_SIDE, HEIGHT_SIDE); 
//                    rightVBoxObject.setPrefSize(WIDTH_SIDE, HEIGHT_SIDE);
                    iniciarSesionErrorObjectStatic.setText("");
                    GetAndSet.setCorreoObject(iniciarSesionCorreoObjectStatic.getText());
                    Sesion sesionObject = new Sesion(); borderPaneObjectStatic.setCenter(sesionObject.sesion()); 
                } else { iniciarSesionErrorObjectStatic.setText("El correo o la contraseña no coinciden."); }
            } catch (SQLException sqleObject) {
                System.out.println(sqleObject);
            } 
        } else if(iniciarSesionCorreoObjectStatic.getText().isEmpty()
        && !iniciarSesionPasswordObjectStatic.getText().isEmpty()) {
            iniciarSesionErrorObjectStatic.setText("El correo no pueden estar vacias.");
        } else if(!iniciarSesionCorreoObjectStatic.getText().isEmpty()
        && iniciarSesionPasswordObjectStatic.getText().isEmpty()) {
            iniciarSesionErrorObjectStatic.setText("La contraseña no pueden estar vacias.");
        } else {
            iniciarSesionErrorObjectStatic.setText("El correo y la contraseña no pueden estar vacias.");      
        }
    }
}
