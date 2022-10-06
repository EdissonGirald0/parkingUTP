package modelos.dao;

import configuraciones.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelos.vo.Cliente;

/**
 *
 * @author ediss
 */
public class ClienteDAO {
    Connection conexion;
    public ClienteDAO() {
        Conexion coon = new Conexion();
        conexion = coon.getConexion();
    }
    
    
    public List<Cliente> listarclientes(){
        PreparedStatement ps;
        ResultSet rs;
        List<Cliente> lista = new ArrayList<>();
        try {
            ps = conexion.prepareStatement("SELECT id, nombre, celular FROM cliente");
            rs = ps.executeQuery();
            while (rs.next()) {                
                int id =rs.getInt("id");
                String nombre =rs.getString("nombre");
                int celular =rs.getInt("celular");
                Cliente cliente =new Cliente(id, nombre, celular);
                lista.add(cliente);
            }
            return lista;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
    }
    public boolean insertCliente(Cliente cliente){
        PreparedStatement ps;
            try {
                ps = conexion.prepareStatement("INSERT INTO cliente(nombre, celular, password)VALUES(?,?,?)");
                ps.setString(1, cliente.getNombre());
                ps.setInt(2, cliente.getCelular());
                ps.setString(3, cliente.getPassword());
                return true;
            } catch (SQLException e) {
                System.out.println(e.toString());
                return false;
            }
    }
    public boolean modificarCliente(Cliente cliente){
        PreparedStatement ps;
            try {
                ps = conexion.prepareStatement("UPDATE cliente SET nombre=?, celular=?, password=? WHERE:id=?");
                ps.setString(1, cliente.getNombre());
                ps.setInt(2, cliente.getCelular());
                ps.setString(3, cliente.getPassword());
                ps.setInt(2, cliente.getId());
                ps.execute();
                return true;
            } catch (SQLException e) {
                System.out.println(e.toString());
                return false;
            }
    }
    public boolean borrarCliente(int _id){
        PreparedStatement ps;
            try {
                ps = conexion.prepareStatement("DELETE FROM cliente WHERE id=?");
                ps.setInt(1, _id);
                ps.execute();
                return true;
            } catch (SQLException e) {
                System.out.println(e.toString());
                return false;
            }
    }
    
}
