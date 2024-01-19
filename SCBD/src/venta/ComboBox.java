package venta;

/**
 *
 * @author Rodrigo 
 */
public class ComboBox {

    private String horario;
    private String nombre;

    public ComboBox() {
    }

    public String getId() {
        return horario;
    }

    public void setId(String horario) {
        this.horario = horario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
