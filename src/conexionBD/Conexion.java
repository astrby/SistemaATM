package conexionBD;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anthony
 */
public class Conexion {
    
    //Variables de base de datos.
    private static String usuario="root";
    private static String contraseña="administrador";
    private static String URL = "jdbc:mysql://localhost:3306/";
    private static String nombreBD = "sistema_atm";
    private static String driver = "com.mysql.cj.jdbc.Driver";
    public Connection cn = null;
    
    //Método para conectar a base de datos.
    public Connection conectar(){
        try{
            Class.forName(driver);
            cn = DriverManager.getConnection(URL+nombreBD, usuario, contraseña);
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("Error en conexión a base de datos.");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cn;
    }
    
    //Método para desconectar a base de datos.
    public void desconectar(){
        try{
            cn.close();
        }catch(SQLException ex){
            System.out.println("No se pudo desconectar la base de datos.");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
