package entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * Clase que representa la caja en la base de datos.
 * 
 * @author Alejandro Gómez Vega 00000247313
 * @author Francisco Valdez Gastelum 00000246904
 * @author Kathya Margarita Cordova Soto 00000246801
 * @author Manuel Octavio Perez Dominguez 00000247439
 * @author Adán Eduardo Cornejo Balcázar 000000228558
 */
@Entity
@Table(name = "Cajas")
public class Caja implements Serializable {
    
    /**
     * Atributos
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "dineroActual", nullable = false)
    private Double dineroActual;
    
    @Column(name = "estado", nullable = false)
    private String estado;

    /**
     * Constructor vacio
     */
    public Caja() {
    }

    /**
     * Constructores
     */
    public Caja(Long id, Double dineroActual, String estado) {
        this.id = id;
        this.dineroActual = dineroActual;
        this.estado = estado;
    }

    public Caja(Double dineroActual, String estado) {
        this.dineroActual = dineroActual;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getDineroActual() {
        return dineroActual;
    }

    public void setDineroActual(Double dineroActual) {
        this.dineroActual = dineroActual;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * String Caja
     */
    @Override
    public String toString() {
        return "Caja{" + "id=" + id + ", dineroActual=" + dineroActual + ", estado=" + estado + '}';
    }
    
}
