package modelos.dao;

import configuraciones.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelos.vo.Parqueadero;

/**
 *
 * @author ediss
 */
public class ParqueaderoDAO {
    Connection conexion;

    public ParqueaderoDAO() {
        Conexion coon = new Conexion();
        conexion = coon.getConexion();
    }
    public List<Parqueadero> listaParqueaderos(){
        PreparedStatement ps;
        ResultSet rs;
        List<Parqueadero> lista = new ArrayList<>();
        try {
            ps = conexion.prepareStatement("SELECT idp, disponible, relacion FROM parqueadero WHERE disponible=TRUE");
            rs = ps.executeQuery();
            while (rs.next()) {                
                int idp =rs.getInt("idp");
                boolean disponible =rs.getBoolean("disponible");
                int relacion =rs.getInt("relacion");
                Parqueadero parqueadero =new Parqueadero(idp, disponible, relacion);
                lista.add(parqueadero);
            }
            return lista;
        } catch (SQLException e) {
        }
        return null;
        
    }
    public Parqueadero idParqueaderos(int _id){
        PreparedStatement ps;
        ResultSet rs;
        Parqueadero parqueadero = null;
        try {
            ps = conexion.prepareStatement("SELECT idp, disponible, relacion FROM parqueadero WHERE idp=?");
            ps.setInt(1, _id);
            rs = ps.executeQuery();
            while (rs.next()) {                
                int idp =rs.getInt("idp");
                boolean disponible =rs.getBoolean("disponible");
                int relacion =rs.getInt("relacion");
                parqueadero =new Parqueadero(idp, disponible, relacion);
                
            }
            return parqueadero;
        } catch (SQLException e) {
        }
        return null;
        
    }
    public boolean CrearParqueadero(Parqueadero parqueadero){
        PreparedStatement ps;
            try {
                ps = conexion.prepareStatement("INSERT INTO parqueadero(idp, disponible, relacion)VALUES(?,?,?)");
                ps.setInt(1, parqueadero.getIdp());
                ps.setBoolean(2, parqueadero.isDisponible());
                ps.setInt(3, parqueadero.getRelacion());
                return true;
            } catch (SQLException e) {
                System.out.println(e.toString());
                return false;
            }
    }
    public boolean modificarParqueadero(Parqueadero parqueadero){
        PreparedStatement ps;
            try {
                ps = conexion.prepareStatement("UPDATE parqueadero SET disponible WHERE:relacion=NOT NULL");
                ps.setBoolean(1, parqueadero.isDisponible());
                ps.setInt(2, parqueadero.getRelacion());
                ps.execute();
                return true;
            } catch (SQLException e) {
                System.out.println(e.toString());
                return false;
            }
    }
    public boolean borrarParqueadero(){
        PreparedStatement ps;
            try {
                ps = conexion.prepareStatement("DELETE FROM parqueadero");
                ps.execute();
                return true;
            } catch (SQLException e) {
                System.out.println(e.toString());
                return false;
            }
    }
}
