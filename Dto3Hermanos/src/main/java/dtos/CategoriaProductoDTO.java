package dtos;

/**
 *
 * Clase que representa una Categoria de un producto como objeto de tranferencia de datos.
 * 
 * @author Alejandro Gómez Vega 00000247313
 * @author Francisco Valdez Gastelum 00000246904
 * @author Kathya Margarita Cordova Soto 00000246801
 * @author Manuel Octavio Perez Dominguez 00000247439
 * @author Adán Eduardo Cornejo Balcázar 000000228558
 */
public class CategoriaProductoDTO {
    /**
     * Atributos
     */
    private Long id;
    private String nombre;
    private String descripcion;

    /**
     * Constructor vacio
     */
    public CategoriaProductoDTO() {
    }

    /**
     * Constyrtuctores
     * @param id
     * @param nombre
     * @param descripcion
     */
    public CategoriaProductoDTO(Long id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public CategoriaProductoDTO(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * String CategoriaProductoDTO
     */
    @Override
    public String toString() {
        return "CategoriaProductoDTO{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }
    
}
