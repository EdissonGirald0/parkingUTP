package modelos.vo;
/**
 *
 * @author edisson
 */
public class Parqueadero {
    private int idp;
    private boolean disponible;
    private int relacion;

    public Parqueadero(int idp, boolean disponible, int relacion) {
        this.idp = idp;
        this.disponible = disponible;
        this.relacion = relacion;
    }

    public int getIdp() {
        return idp;
    }

    public void setIdp(int idp) {
        this.idp = idp;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getRelacion() {
        return relacion;
    }

    public void setRelacion(int relacion) {
        this.relacion = relacion;
    }
    
}
