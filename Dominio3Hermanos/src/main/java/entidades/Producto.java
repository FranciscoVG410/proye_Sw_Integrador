package entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * Clase que representa el producto en la base de datos.
 * 
 * @author Alejandro Gómez Vega 00000247313
 * @author Francisco Valdez Gastelum 00000246904
 * @author Kathya Margarita Cordova Soto 00000246801
 * @author Manuel Octavio Perez Dominguez 00000247439
 * @author Adán Eduardo Cornejo Balcázar 000000228558
 */

/**
 * Tabla Productos
 */
@Entity
@Table(name = "Productos")
public class Producto implements Serializable {

    /**
     * Atributos
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "precio_venta", nullable = false)
    private Double precioVenta;

    @Column(name = "cantidad", nullable = false)
    private Integer cantidad;

    @Column(name = "marca", nullable = false)
    private String marca;

    @ManyToOne
    @JoinColumn(name = "categoria_id", nullable = false)
    private CategoriaProducto categoria;
    
    @ManyToMany
    @JoinTable(
        name = "Producto_Proveedor",
        joinColumns = @JoinColumn(name = "producto_id"),
        inverseJoinColumns = @JoinColumn(name = "proveedor_id")
    )
    private List<Proveedor> proveedores;

    /**
     * Constructor vacio
     */
    public Producto() {
    }

    /**
     * Constructores
     */
    public Producto(Long id, String nombre, Double precioVenta, Integer cantidad, String marca, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precioVenta = precioVenta;
        this.cantidad = cantidad;
        this.marca = marca;
        this.categoria = categoria;
    }

    public Producto(String nombre, Double precioVenta, Integer cantidad, String marca, CategoriaProducto categoria) {
        this.nombre = nombre;
        this.precioVenta = precioVenta;
        this.cantidad = cantidad;
        this.marca = marca;
        this.categoria = categoria;
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

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProducto categoria) {
        this.categoria = categoria;
    }

    /**
     * String Producto
     */
    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", precioVenta=" + precioVenta + ", cantidad=" + cantidad + ", marca=" + marca + ", categoria=" + categoria + '}';
    }
    
}
