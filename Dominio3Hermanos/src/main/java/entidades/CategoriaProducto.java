package entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * Clase que representa la categoria del producto en la base de datos.
 * 
 * @author Alejandro Gómez Vega 00000247313
 * @author Francisco Valdez Gastelum 00000246904
 * @author Kathya Margarita Cordova Soto 00000246801
 * @author Manuel Octavio Perez Dominguez 00000247439
 * @author Adán Eduardo Cornejo Balcázar 000000228558
 */
@Entity
@Table(name = "CategoriasProducto")
public class CategoriaProducto implements Serializable {
    
    /**
     * Atributos
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nombre", nullable = false, unique = true)
    private String nombre;
    
    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "estado", nullable = false)
    private Boolean estado = true;
    
    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;

    /**
     * Constructor vacio
     */
    public CategoriaProducto() {
    }

    /**
     * Constructores
     */
    public CategoriaProducto(Long id, String nombre, String descripcion, List<Producto> productos) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.productos = productos;
    }

    public CategoriaProducto(String nombre, String descripcion, List<Producto> productos) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.productos = productos;
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
    
    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    /**
     * String CategoriaProducto
     */
    @Override
    public String toString() {
        return "CategoriaProducto{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", productos=" + productos + '}';
    }

}
