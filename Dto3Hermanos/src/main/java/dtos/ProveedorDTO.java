package dtos;

/**
 *
 * Clase que representa un Proveedor como objeto de tranferencia de datos.
 * 
 * @author Alejandro Gómez Vega 00000247313
 * @author Francisco Valdez Gastelum 00000246904
 * @author Kathya Margarita Cordova Soto 00000246801
 * @author Manuel Octavio Perez Dominguez 00000247439
 * @author Adán Eduardo Cornejo Balcázar 000000228558
 */
public class ProveedorDTO {
    /**
     * Atributos
     */
    private Long id;
    private String nombre;
    private String telefono;

    /**
     * Constructor vacio
     */
    public ProveedorDTO() {
    }

    /**
     * Constructores
     * @param id
     * @param nombre
     * @param telefono
     */
    public ProveedorDTO(Long id, String nombre, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public ProveedorDTO(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    /**
     * Setters y Getters
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * String ProveedorDTO
     */
    @Override
    public String toString() {
        return "ProveedorDTO{" + "id=" + id + ", nombre=" + nombre + ", telefono=" + telefono + '}';
    }
    
}
