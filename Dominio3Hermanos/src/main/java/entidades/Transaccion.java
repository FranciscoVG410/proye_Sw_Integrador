package entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * Clase que representa la transaccion en la base de datos.
 * 
 * @author Alejandro Gómez Vega 00000247313
 * @author Francisco Valdez Gastelum 00000246904
 * @author Kathya Margarita Cordova Soto 00000246801
 * @author Manuel Octavio Perez Dominguez 00000247439
 * @author Adán Eduardo Cornejo Balcázar 000000228558
 */

/**
 * Tabla Transaccion
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo", discriminatorType = DiscriminatorType.STRING)
@Table(name = "Transacciones")
public class Transaccion implements Serializable {

    /**
     * Atributos
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "total", nullable = false)
    private Double total;
    
    @Column(name = "estado", nullable = false)
    private boolean estado = true;
    
    @OneToMany(mappedBy = "transaccion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ProductoTransaccion> productos;

    /**
     * Constructor vacio
     */
    public Transaccion() {
    }

    /**
     * Constructores
     */
    public Transaccion(Long id, List<ProductoTransaccion> productos, Double total) {
        this.id = id;
        this.productos = productos;
        this.total = total;
        this.estado = true;
    }

    public Transaccion(List<ProductoTransaccion> productos, Double total) {
        this.productos = productos;
        this.total = total;
        this.estado = true;
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

    public List<ProductoTransaccion> getProductos() {
        return productos;
    }

    public void setProductos(List<ProductoTransaccion> productos) {
        this.productos = productos;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
    
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /**
     * String Transaccion
     */
    @Override
    public String toString() {
        return "Transaccion{" + "id=" + id + ", productos=" + productos + ", total=" + total + ", estado=" + estado + '}';
    }
    
}
