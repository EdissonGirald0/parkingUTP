package configuraciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author edisson
 */
public class Conexion {
    public Connection getConexion(){
        
       try {
           Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/park", "root","Tirolo.6");
           System.out.println("Conexion establecida");
           return conexion;
       }catch(SQLException err){
           System.out.println(err+ " Grave");
           return null;
       }
        
    }
}
