
package Principal;
/**
 *
 * @author Cracken
 */
public class Nodo {
    private Nodo siguiente;
    private String nombre,apellido,residencia,nacimiento,tipoID,trabaja;
    private int ID;
    ;

    public Nodo() {
        this.siguiente = null;
        this.nombre = "";
        this.apellido = "";
        this.residencia = "";
        this.nacimiento = "";
        this.ID = 0;
        this.tipoID = "";
        this.trabaja = "";
    }
    

    public Nodo getSiguiente() {
        return siguiente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getResidencia() {
        return residencia;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public String getTipoID() {
        return tipoID;
    }

    public String getTrabaja() {
        return trabaja;
    }

    public int getID() {
        return ID;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setTipoID(String tipoID) {
        this.tipoID = tipoID;
    }

    public void setTrabaja(String trabaja) {
        this.trabaja = trabaja;
    }

    public void setID(int ID) {
        this.ID = ID;
    }  
}
