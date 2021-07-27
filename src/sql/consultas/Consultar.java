package sql.consultas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import show.ConstructorDeDatos;
import show.Sesion;
import sql.Conexion;
import sql.GetAndSet;
import sql.Identificador;

public class Consultar {
    public static void 
    perfil() {
        String sqlPerfilObject ="SELECT * FROM usuarios WHERE nCorreo = ? ";
        
        try {
            PreparedStatement preparedObject = Conexion.getConexion().prepareStatement(sqlPerfilObject);
            preparedObject.setString(1, GetAndSet.getCorreoObject());
            
            ResultSet resultSetObject = preparedObject.executeQuery();
            
            while (resultSetObject.next()) {
                GetAndSet.setIdObject(resultSetObject.getInt(1));
                GetAndSet.setIdentificadorObject(resultSetObject.getString(2));
                GetAndSet.setNombreObject(resultSetObject.getString(3));
                GetAndSet.setApellidoObject(resultSetObject.getString(4));
                GetAndSet.setPlataformaObject(resultSetObject.getString(7));
                GetAndSet.setFechaObject(resultSetObject.getDate(8));
                GetAndSet.setNombreDeImagenObject(resultSetObject.getString(10));
            }
        } catch (SQLException sqleObject) {
            System.out.println(sqleObject);
        } finally { 
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(Consultar.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }
    public static void 
    historial() {
        String sqlPerfilObject ="SELECT * FROM historial WHERE nUsuario=? ORDER BY nID DESC"; //ASC DESC
        
        try {
 
            PreparedStatement prepaedObject = Conexion.getConexion().prepareStatement(sqlPerfilObject);
            prepaedObject.setInt(1, GetAndSet.getIdObject());
            
            ResultSet resultSetObject = prepaedObject.executeQuery();
            
            while (resultSetObject.next()) {
                if(!resultSetObject.getString(4).equals("")) {
                    Sesion.observableListStaticType.addAll(new ConstructorDeDatos(
                        resultSetObject.getInt(1),
                        "\n\tInicio de sesion el: " + resultSetObject.getString(5) + "\n\tDesde: " + Identificador.ipv4()+"\n" + " "
                    ));  
                } else if(!resultSetObject.getString(6).equals("")) {
                    Sesion.observableListStaticType.addAll(new ConstructorDeDatos(
                        resultSetObject.getInt(1),
                        "\n\tCierre de sesion el: " + resultSetObject.getString(7) + "\n\tDesde: " + Identificador.ipv4()+"\n" + " "
                    )); 
                } else if(!resultSetObject.getString(8).equals("")) {
                    Sesion.observableListStaticType.addAll(new ConstructorDeDatos(
                        resultSetObject.getInt(1),
                        "\n\tActualización de datos el: " + resultSetObject.getString(9) + "\n\tDesde: " + Identificador.ipv4()+"\n" + " "
                    )); 
                } else {}
            }
        } catch (SQLException sqleObject) {
            System.out.println(sqleObject);
        } finally { 
            try {
                Conexion.getConexion().close();
            } catch (SQLException sqleObject) {
                Logger.getLogger(Consultar.class.getName()).log(Level.SEVERE, null, sqleObject);
            }
        }
    }
}
