package configuraciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author edisson
 */
public class Conexion {
    public Connection getConexion(){
        
       try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/park", "root","Tirolo.6");
           System.out.println("Conexion establecida");
           return conexion;
       }catch(SQLException err){
           System.out.println(err+ " Grave");
           return null;
       } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
}
