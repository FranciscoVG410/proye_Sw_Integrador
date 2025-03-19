package entidades;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * Clase que representa el Producto vendido o comprado en la base de datos.
 * 
 * @author Alejandro Gómez Vega 00000247313
 * @author Francisco Valdez Gastelum 00000246904
 * @author Kathya Margarita Cordova Soto 00000246801
 * @author Manuel Octavio Perez Dominguez 00000247439
 * @author Adán Eduardo Cornejo Balcázar 000000228558
 */

/**
 * Tabla ProductoTransaccion
 */
@Entity
@Table(name = "ProductoTransacciones")
public class ProductoTransaccion implements Serializable {

    /**
     * Atributos
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "producto_id", nullable = false)
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "transaccion_id")
    private Transaccion transaccion;

    @Column(name = "precio", nullable = false)
    private Double precio;

    @Column(name = "cantidad", nullable = false)
    private Integer cantidad;

    @Column(name = "fecha_hora", nullable = false)
    private LocalDateTime fechaHora;

    /**
     * Constructor vacio
     */
    public ProductoTransaccion() {
    }

    /**
     * Constructores
     */
    public ProductoTransaccion(Long id, Producto producto, Transaccion transaccion, Double precio, Integer cantidad, LocalDateTime fechaHora) {
        this.id = id;
        this.producto = producto;
        this.transaccion = transaccion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.fechaHora = fechaHora;
    }

    public ProductoTransaccion(Producto producto, Transaccion transaccion, Double precio, Integer cantidad, LocalDateTime fechaHora) {
        this.producto = producto;
        this.transaccion = transaccion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.fechaHora = fechaHora;
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

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Transaccion getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(Transaccion transaccion) {
        this.transaccion = transaccion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    /**
     * String ProductoTransaccion
     */
    @Override
    public String toString() {
        return "ProductoTransaccion{" + "id=" + id + ", producto=" + producto + ", transaccion=" + transaccion + ", precio=" + precio + ", cantidad=" + cantidad + ", fechaHora=" + fechaHora + '}';
    }
    
}
