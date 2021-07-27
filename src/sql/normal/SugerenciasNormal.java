package sql.normal;

import front.IteradorMatematico;
import static front.IteradorMatematico.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sql.Conexion;

/**
 *
 * @author neury
 */
public class SugerenciasNormal {
    public static void sugerencias() {
        String aliasObject   = sugerenciasNombreObjectStatic.getText();
        String asuntoObject  = sugerenciasAsuntoObjectStatic.getText();
        String emailObject   = sugerenciasCorreoObjectStatic.getText();
        String mensajeObject = sugerenciasMensajeObjectStatic.getText();

        if(!aliasObject.isEmpty() && !emailObject.isEmpty() && !mensajeObject.isEmpty()){  
            try {
                sugerenciasErrorObjectStatic.setId("n-error-null-form");
                sugerenciasErrorObjectStatic.setText("Su Sugerencias a sido enviada.");

                Conexion.getStatement().executeUpdate("INSERT INTO sugerencias (nNombre, nAsunto, nCorreo, nMensaje) " +
                "VALUES ('"+aliasObject+"', '"+asuntoObject+"', '"+emailObject+"', '"+mensajeObject+"')");
            } catch (SQLException ex) {
                Logger.getLogger(IteradorMatematico.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if(aliasObject.isEmpty()
        && !emailObject.isEmpty() && !mensajeObject.isEmpty()) {
            sugerenciasErrorObjectStatic.setText("El nombre no pueden estar vacias.");
        } else if(!aliasObject.isEmpty()
        && emailObject.isEmpty() && !mensajeObject.isEmpty()) {
            sugerenciasErrorObjectStatic.setText("El correo no pueden estar vacias.");
        } else if(!aliasObject.isEmpty()
        && !emailObject.isEmpty() && mensajeObject.isEmpty()) {
            sugerenciasErrorObjectStatic.setText("El mensaje no pueden estar vacias.");
        } else { sugerenciasErrorObjectStatic.setText("NO DEJE CAMPOS VACIOS."); }
    }
}
