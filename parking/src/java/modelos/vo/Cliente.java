package modelos.vo;
/**
 *
 * @author edisson
 */
public class Cliente {
    private int id;
    private String nombre;
    private int celular;
    private String password;

    public Cliente(int id, String nombre, int celular) {
        this.id = id;
        this.nombre = nombre;
        this.celular = celular;
    }
    

    public Cliente(int id, String nombre, int celular, String password) {
        this.id = id;
        this.nombre = nombre;
        this.celular = celular;
        this.password = password;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    
}
