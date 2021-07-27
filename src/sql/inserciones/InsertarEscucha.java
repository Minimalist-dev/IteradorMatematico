package sql.inserciones;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sql.Conexion;
import sql.Identificador;

public class InsertarEscucha {
    public static void 
    movido(String movidoObject) {
        try {
            String sql = "INSERT INTO navegacion"
            + "(nNavegador, nPC, nIPLocal, nIdioma, nOrigen, nIPv4, nIPv6, nMACNombre, nDondeFue, nDondeFueFecha) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, NOW())";

            PreparedStatement preparedObject = Conexion.getConexion().prepareStatement(sql);
            preparedObject.setString(1, Identificador.usuario());
            preparedObject.setString(2, Identificador.pc());
            preparedObject.setString(3, Identificador.ipLocal());
            preparedObject.setString(4, Identificador.idioma());
            preparedObject.setString(5, Identificador.origen());
            preparedObject.setString(6, Identificador.ipv4());
            preparedObject.setString(7, Identificador.ipv6());
            preparedObject.setString(8, Identificador.macName());
            preparedObject.setString(9, movidoObject);


            preparedObject.execute();
        } catch (SQLException sqleObject) {
            Logger.getLogger(InsertarEscucha.class.getName()).log(Level.SEVERE, null, sqleObject);
        } finally { 
            try {
                Conexion.getConexion().close();
            } catch (SQLException sqleObject) {
                Logger.getLogger(InsertarEscucha.class.getName()).log(Level.SEVERE, null, sqleObject);
            }
        }
    }
    public static void 
    ingreso(String ingresoObject) {
        try {
            String sql = "INSERT INTO navegacion"
            + "(nNavegador, nPC, nIPLocal, nIdioma, nOrigen, nIPv4, nIPv6, nMACNombre, nDondeFue, nDondeFueFecha) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, NOW())";

            PreparedStatement preparedObject = Conexion.getConexion().prepareStatement(sql);
            preparedObject.setString(1, Identificador.usuario());
            preparedObject.setString(2, Identificador.pc());
            preparedObject.setString(3, Identificador.ipLocal());
            preparedObject.setString(4, Identificador.idioma());
            preparedObject.setString(5, Identificador.origen());
            preparedObject.setString(6, Identificador.ipv4());
            preparedObject.setString(7, Identificador.ipv6());
            preparedObject.setString(8, Identificador.macName());
            preparedObject.setString(9, ingresoObject);


            preparedObject.execute();
        } catch (SQLException sqleObject) {
            Logger.getLogger(InsertarEscucha.class.getName()).log(Level.SEVERE, null, sqleObject);
        } finally { 
            try {
                Conexion.getConexion().close();
            } catch (SQLException sqleObject) {
                Logger.getLogger(InsertarEscucha.class.getName()).log(Level.SEVERE, null, sqleObject);
            }
        }
    }
    public static void 
    salido(String salidoObject) {
        try {
            String sql = "INSERT INTO navegacion"
            + "(nNavegador, nPC, nIPLocal, nIdioma, nOrigen, nIPv4, nIPv6, nMACNombre, nDondeFue, nDondeFueFecha) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, NOW())";

            PreparedStatement preparedObject = Conexion.getConexion().prepareStatement(sql);
            preparedObject.setString(1, Identificador.usuario());
            preparedObject.setString(2, Identificador.pc());
            preparedObject.setString(3, Identificador.ipLocal());
            preparedObject.setString(4, Identificador.idioma());
            preparedObject.setString(5, Identificador.origen());
            preparedObject.setString(6, Identificador.ipv4());
            preparedObject.setString(7, Identificador.ipv6());
            preparedObject.setString(8, Identificador.macName());
            preparedObject.setString(9, salidoObject);


            preparedObject.execute();
        } catch (SQLException sqleObject) {
            Logger.getLogger(InsertarEscucha.class.getName()).log(Level.SEVERE, null, sqleObject);
        } finally { 
            try {
                Conexion.getConexion().close();
            } catch (SQLException sqleObject) {
                Logger.getLogger(InsertarEscucha.class.getName()).log(Level.SEVERE, null, sqleObject);
            }
        }
    }
    public static void 
    hizoClic(String hizoClicObject) {
        try {
            String sql = "INSERT INTO navegacion"
            + "(nNavegador, nPC, nIPLocal, nIdioma, nOrigen, nIPv4, nIPv6, nMACNombre, nDondeClickio, nDondeClickioFecha) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, NOW())";

            PreparedStatement preparedObject = Conexion.getConexion().prepareStatement(sql);
            preparedObject.setString(1, Identificador.usuario());
            preparedObject.setString(2, Identificador.pc());
            preparedObject.setString(3, Identificador.ipLocal());
            preparedObject.setString(4, Identificador.idioma());
            preparedObject.setString(5, Identificador.origen());
            preparedObject.setString(6, Identificador.ipv4());
            preparedObject.setString(7, Identificador.ipv6());
            preparedObject.setString(8, Identificador.macName());
            preparedObject.setString(9, hizoClicObject);


            preparedObject.execute();
        } catch (SQLException sqleObject) {
            Logger.getLogger(InsertarEscucha.class.getName()).log(Level.SEVERE, null, sqleObject);
        } finally { 
            try {
                Conexion.getConexion().close();
            } catch (SQLException sqleObject) {
                Logger.getLogger(InsertarEscucha.class.getName()).log(Level.SEVERE, null, sqleObject);
            }
        }
    }
    public static void 
    presiono(String presionadoObject) {
        try {
            String sql = "INSERT INTO navegacion"
            + "(nNavegador, nPC, nIPLocal, nIdioma, nOrigen, nIPv4, nIPv6, nMACNombre, nDondeClickio, nDondeClickioFecha) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, NOW())";

            PreparedStatement preparedObject = Conexion.getConexion().prepareStatement(sql);
            preparedObject.setString(1, Identificador.usuario());
            preparedObject.setString(2, Identificador.pc());
            preparedObject.setString(3, Identificador.ipLocal());
            preparedObject.setString(4, Identificador.idioma());
            preparedObject.setString(5, Identificador.origen());
            preparedObject.setString(6, Identificador.ipv4());
            preparedObject.setString(7, Identificador.ipv6());
            preparedObject.setString(8, Identificador.macName());
            preparedObject.setString(9, presionadoObject);


            preparedObject.execute();
        } catch (SQLException sqleObject) {
            Logger.getLogger(InsertarEscucha.class.getName()).log(Level.SEVERE, null, sqleObject);
        } finally { 
            try {
                Conexion.getConexion().close();
            } catch (SQLException sqleObject) {
                Logger.getLogger(InsertarEscucha.class.getName()).log(Level.SEVERE, null, sqleObject);
            }
        }
    }
    public static void 
    liberado(String liberadoObject) {
        try {
            String sql = "INSERT INTO navegacion"
            + "(nNavegador, nPC, nIPLocal, nIdioma, nOrigen, nIPv4, nIPv6, nMACNombre, nDondeClickio, nDondeClickioFecha) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, NOW())";

            PreparedStatement preparedObject = Conexion.getConexion().prepareStatement(sql);
            preparedObject.setString(1, Identificador.usuario());
            preparedObject.setString(2, Identificador.pc());
            preparedObject.setString(3, Identificador.ipLocal());
            preparedObject.setString(4, Identificador.idioma());
            preparedObject.setString(5, Identificador.origen());
            preparedObject.setString(6, Identificador.ipv4());
            preparedObject.setString(7, Identificador.ipv6());
            preparedObject.setString(8, Identificador.macName());
            preparedObject.setString(9, liberadoObject);


            preparedObject.execute();
        } catch (SQLException sqleObject) {
            Logger.getLogger(InsertarEscucha.class.getName()).log(Level.SEVERE, null, sqleObject);
        } finally { 
            try {
                Conexion.getConexion().close();
            } catch (SQLException sqleObject) {
                Logger.getLogger(InsertarEscucha.class.getName()).log(Level.SEVERE, null, sqleObject);
            }
        }
    }
    public static void 
    movidoBottom(String movidoObject) {
        try {
            String sql = "INSERT INTO uso"
            + "(nUsador, nPC, nIPLocal, nIdioma, nOrigen, nIPv4, nIPv6, nMACNombre, nKeUso, nKeUsoFecha) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, NOW())";

            PreparedStatement preparedObject = Conexion.getConexion().prepareStatement(sql);
            preparedObject.setString(1, Identificador.usuario());
            preparedObject.setString(2, Identificador.pc());
            preparedObject.setString(3, Identificador.ipLocal());
            preparedObject.setString(4, Identificador.idioma());
            preparedObject.setString(5, Identificador.origen());
            preparedObject.setString(6, Identificador.ipv4());
            preparedObject.setString(7, Identificador.ipv6());
            preparedObject.setString(8, Identificador.macName());
            preparedObject.setString(9, movidoObject);


            preparedObject.execute();
        } catch (SQLException sqleObject) {
            Logger.getLogger(InsertarEscucha.class.getName()).log(Level.SEVERE, null, sqleObject);
        } finally { 
            try {
                Conexion.getConexion().close();
            } catch (SQLException sqleObject) {
                Logger.getLogger(InsertarEscucha.class.getName()).log(Level.SEVERE, null, sqleObject);
            }
        }
    }
    public static void 
    ingresoBottom(String ingresoObject) {
        try {
            String sql = "INSERT INTO uso"
            + "(nUsador, nPC, nIPLocal, nIdioma, nOrigen, nIPv4, nIPv6, nMACNombre, nKeUso, nKeUsoFecha) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, NOW())";

            PreparedStatement preparedObject = Conexion.getConexion().prepareStatement(sql);
            preparedObject.setString(1, Identificador.usuario());
            preparedObject.setString(2, Identificador.pc());
            preparedObject.setString(3, Identificador.ipLocal());
            preparedObject.setString(4, Identificador.idioma());
            preparedObject.setString(5, Identificador.origen());
            preparedObject.setString(6, Identificador.ipv4());
            preparedObject.setString(7, Identificador.ipv6());
            preparedObject.setString(8, Identificador.macName());
            preparedObject.setString(9, ingresoObject);


            preparedObject.execute();
        } catch (SQLException sqleObject) {
            Logger.getLogger(InsertarEscucha.class.getName()).log(Level.SEVERE, null, sqleObject);
        } finally { 
            try {
                Conexion.getConexion().close();
            } catch (SQLException sqleObject) {
                Logger.getLogger(InsertarEscucha.class.getName()).log(Level.SEVERE, null, sqleObject);
            }
        }
    }
    public static void 
    salidoBottom(String salidoObject) {
        try {
            String sql = "INSERT INTO uso"
            + "(nUsador, nPC, nIPLocal, nIdioma, nOrigen, nIPv4, nIPv6, nMACNombre, nKeUso, nKeUsoFecha) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, NOW())";

            PreparedStatement preparedObject = Conexion.getConexion().prepareStatement(sql);
            preparedObject.setString(1, Identificador.usuario());
            preparedObject.setString(2, Identificador.pc());
            preparedObject.setString(3, Identificador.ipLocal());
            preparedObject.setString(4, Identificador.idioma());
            preparedObject.setString(5, Identificador.origen());
            preparedObject.setString(6, Identificador.ipv4());
            preparedObject.setString(7, Identificador.ipv6());
            preparedObject.setString(8, Identificador.macName());
            preparedObject.setString(9, salidoObject);


            preparedObject.execute();
        } catch (SQLException sqleObject) {
            Logger.getLogger(InsertarEscucha.class.getName()).log(Level.SEVERE, null, sqleObject);
        } finally { 
            try {
                Conexion.getConexion().close();
            } catch (SQLException sqleObject) {
                Logger.getLogger(InsertarEscucha.class.getName()).log(Level.SEVERE, null, sqleObject);
            }
        }
    }
    public static void 
    hizoClicBottom(String hizoClicObject) {
        try {
            String sql = "INSERT INTO uso"
            + "(nUsador, nPC, nIPLocal, nIdioma, nOrigen, nIPv4, nIPv6, nMACNombre, nKeUso, nKeUsoFecha) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, NOW())";

            PreparedStatement preparedObject = Conexion.getConexion().prepareStatement(sql);
            preparedObject.setString(1, Identificador.usuario());
            preparedObject.setString(2, Identificador.pc());
            preparedObject.setString(3, Identificador.ipLocal());
            preparedObject.setString(4, Identificador.idioma());
            preparedObject.setString(5, Identificador.origen());
            preparedObject.setString(6, Identificador.ipv4());
            preparedObject.setString(7, Identificador.ipv6());
            preparedObject.setString(8, Identificador.macName());
            preparedObject.setString(9, hizoClicObject);


            preparedObject.execute();
        } catch (SQLException sqleObject) {
            Logger.getLogger(InsertarEscucha.class.getName()).log(Level.SEVERE, null, sqleObject);
        } finally { 
            try {
                Conexion.getConexion().close();
            } catch (SQLException sqleObject) {
                Logger.getLogger(InsertarEscucha.class.getName()).log(Level.SEVERE, null, sqleObject);
            }
        }
    }
    public static void 
    presionoBottom(String presionadoObject) {
        try {
            String sql = "INSERT INTO uso"
            + "(nUsador, nPC, nIPLocal, nIdioma, nOrigen, nIPv4, nIPv6, nMACNombre, nKeUso, nKeUsoFecha) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, NOW())";

            PreparedStatement preparedObject = Conexion.getConexion().prepareStatement(sql);
            preparedObject.setString(1, Identificador.usuario());
            preparedObject.setString(2, Identificador.pc());
            preparedObject.setString(3, Identificador.ipLocal());
            preparedObject.setString(4, Identificador.idioma());
            preparedObject.setString(5, Identificador.origen());
            preparedObject.setString(6, Identificador.ipv4());
            preparedObject.setString(7, Identificador.ipv6());
            preparedObject.setString(8, Identificador.macName());
            preparedObject.setString(9, presionadoObject);


            preparedObject.execute();
        } catch (SQLException sqleObject) {
            Logger.getLogger(InsertarEscucha.class.getName()).log(Level.SEVERE, null, sqleObject);
        } finally { 
            try {
                Conexion.getConexion().close();
            } catch (SQLException sqleObject) {
                Logger.getLogger(InsertarEscucha.class.getName()).log(Level.SEVERE, null, sqleObject);
            }
        }
    }
    public static void 
    liberadoBottom(String liberadoObject) {
        try {
            String sql = "INSERT INTO uso"
            + "(nUsador, nPC, nIPLocal, nIdioma, nOrigen, nIPv4, nIPv6, nMACNombre, nKeUso, nKeUsoFecha) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, NOW())";

            PreparedStatement preparedObject = Conexion.getConexion().prepareStatement(sql);
            preparedObject.setString(1, Identificador.usuario());
            preparedObject.setString(2, Identificador.pc());
            preparedObject.setString(3, Identificador.ipLocal());
            preparedObject.setString(4, Identificador.idioma());
            preparedObject.setString(5, Identificador.origen());
            preparedObject.setString(6, Identificador.ipv4());
            preparedObject.setString(7, Identificador.ipv6());
            preparedObject.setString(8, Identificador.macName());
            preparedObject.setString(9, liberadoObject);


            preparedObject.execute();
        } catch (SQLException sqleObject) {
            Logger.getLogger(InsertarEscucha.class.getName()).log(Level.SEVERE, null, sqleObject);
        } finally { 
            try {
                Conexion.getConexion().close();
            } catch (SQLException sqleObject) {
                Logger.getLogger(InsertarEscucha.class.getName()).log(Level.SEVERE, null, sqleObject);
            }
        }
    }
    public static void 
    iso(String isoObject) {
        try {
            String sql = "INSERT INTO uso"
            + "(nUsador, nPC, nIPLocal, nIdioma, nOrigen, nIPv4, nIPv6, nMACNombre, nKeIso, nKeIsoFecha) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, NOW())";

            PreparedStatement preparedObject = Conexion.getConexion().prepareStatement(sql);
            preparedObject.setString(1, Identificador.usuario());
            preparedObject.setString(2, Identificador.pc());
            preparedObject.setString(3, Identificador.ipLocal());
            preparedObject.setString(4, Identificador.idioma());
            preparedObject.setString(5, Identificador.origen());
            preparedObject.setString(6, Identificador.ipv4());
            preparedObject.setString(7, Identificador.ipv6());
            preparedObject.setString(8, Identificador.macName());
            preparedObject.setString(9, isoObject);


            preparedObject.execute();
        } catch (SQLException sqleObject) {
            Logger.getLogger(InsertarEscucha.class.getName()).log(Level.SEVERE, null, sqleObject);
        } finally { 
            try {
                Conexion.getConexion().close();
            } catch (SQLException sqleObject) {
                Logger.getLogger(InsertarEscucha.class.getName()).log(Level.SEVERE, null, sqleObject);
            }
        }
    }
}
