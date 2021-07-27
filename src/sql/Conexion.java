package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author neury
 */
public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/iterador";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";

    static public Connection
    getConexion() throws SQLException {
        Connection setConexionObject = DriverManager.getConnection(URL, USUARIO, PASSWORD); 
        return setConexionObject;
    }
    static public Statement 
    getStatement() throws SQLException {
        Statement setStatementObject = Conexion.getConexion().createStatement();
        return setStatementObject;
    }
    static public ResultSet 
    setResultSet(String sqlObject) throws SQLException {
        ResultSet getResultSetObject = Conexion.getStatement().executeQuery(sqlObject);
        return getResultSetObject;
    }
}
