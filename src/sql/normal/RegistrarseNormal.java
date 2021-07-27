package sql.normal;

import front.IteradorMatematico;
import static front.IteradorMatematico.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import show.Sesion;
import sql.Conexion;
import sql.GetAndSet;

/**
 *
 * @author neury
 */
public class RegistrarseNormal extends IteradorMatematico {
    public static void registrarse() {
        String nombreObject   = registrarseNombreFieldObjectStatic.getText();
        String apellidoObject = registrarseApellidosFieldObjectStatic.getText();
        String correoObject   = registrarseCorreoFieldObjectStatic.getText();
        String passwordObject = registrarsePasswordFieldObjectStatic.getText();

        if(!nombreObject.isEmpty() && !apellidoObject.isEmpty() 
        && !correoObject.isEmpty() && !passwordObject.isEmpty()){  
            String sqlCorreoObject = "SELECT * FROM usuarios WHERE nCorreo='"+correoObject+"' LIMIT 1";

            try {
                ResultSet resultSetCorreoObject = Conexion.getStatement().executeQuery(sqlCorreoObject);

                if(resultSetCorreoObject.next()) {
                    registrarseErrorObjectStatic.setText("EL CORREO YA ESTA RESGISTRADO.");
                } else {
                    Conexion.getStatement().executeUpdate("INSERT INTO usuarios (nNombre, nApellido, nCorreo, nPassword, nPlataforma) " +
                    "VALUES ('"+nombreObject+"', '"+apellidoObject+"', '"+correoObject+"', '"+passwordObject+"', 'Desktop')");

                    String sqlRegistroObject = "SELECT * FROM usuarios "
                    + "WHERE nCorreo='"+correoObject+"' AND nPassword='"+passwordObject+"' LIMIT 1";

                    try {
                        ResultSet resultSetObject = Conexion.getStatement().executeQuery(sqlRegistroObject);

                        if(resultSetObject.next()) { 
                            registrarseErrorObjectStatic.setText("");
                            GetAndSet.setCorreoObject(correoObject);
                            Sesion sesionObject = new Sesion(); borderPaneObjectStatic.setCenter(sesionObject.sesion());
//                            registrarseFormObject.setDisable(false);
//                            registrarsePaneObject.setVisible(false);
//                            registrarseGridPaneObject.setManaged(false);
//                            leftVBoxObject.setPrefSize(WIDTH_SIDE, HEIGHT_SIDE);  
//                            rightVBoxObject.setPrefSize(WIDTH_SIDE, HEIGHT_SIDE);
                        } else { registrarseErrorObjectStatic.setText("El correo o la contraseña no coinciden."); }
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
            } catch (SQLException ex) {
                Logger.getLogger(IteradorMatematico.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if(nombreObject.isEmpty() && !apellidoObject.isEmpty() 
        && !correoObject.isEmpty() && !passwordObject.isEmpty()) {
            registrarseErrorObjectStatic.setText("El nombre no pueden estar vacias.");
        } else if(!nombreObject.isEmpty() && apellidoObject.isEmpty() 
        && !correoObject.isEmpty() && !passwordObject.isEmpty()) {
            registrarseErrorObjectStatic.setText("El apellido no pueden estar vacias.");
        } else if(!nombreObject.isEmpty() && !apellidoObject.isEmpty() 
        && correoObject.isEmpty() && !passwordObject.isEmpty()) {
            registrarseErrorObjectStatic.setText("El correo no pueden estar vacias.");
        } else if(!nombreObject.isEmpty() && !apellidoObject.isEmpty() 
        && !correoObject.isEmpty() && passwordObject.isEmpty()) {
            registrarseErrorObjectStatic.setText("La contraseña no pueden estar vacias.");
        } else { registrarseErrorObjectStatic.setText("No pueden dejar campos vacias."); }
    //                        else if(nombreObject.isEmpty() && apellidoObject.isEmpty() 
    //                        && correoObject.isEmpty() && passwordObject.isEmpty() || nombreObject.isEmpty() && apellidoObject.isEmpty() 
    //                        && !correoObject.isEmpty() && !passwordObject.isEmpty() || !nombreObject.isEmpty() && !apellidoObject.isEmpty() 
    //                        && correoObject.isEmpty() && passwordObject.isEmpty() || nombreObject.isEmpty() && !apellidoObject.isEmpty() 
    //                        && correoObject.isEmpty() && !passwordObject.isEmpty() || !nombreObject.isEmpty() && apellidoObject.isEmpty() 
    //                        && !correoObject.isEmpty() && passwordObject.isEmpty() || nombreObject.isEmpty() && !apellidoObject.isEmpty() 
    //                        && !correoObject.isEmpty() && passwordObject.isEmpty() || !nombreObject.isEmpty() && apellidoObject.isEmpty() 
    //                        && correoObject.isEmpty() && !passwordObject.isEmpty()){
    //                            errorObjectStatic.setText("El no pueden dejar campos vacias.");      
    //                        }
    }
    
}
