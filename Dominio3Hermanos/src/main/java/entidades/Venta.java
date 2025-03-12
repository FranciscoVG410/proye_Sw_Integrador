package entidades;

import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * Clase que representa la venta del producto en la base de datos.
 *
 * @author Alejandro Gómez Vega 00000247313
 * @author Francisco Valdez Gastelum 00000246904
 * @author Kathya Margarita Cordova Soto 00000246801
 * @author Manuel Octavio Perez Dominguez 00000247439
 */
@Entity
@DiscriminatorValue("Ventas")
public class Venta extends Transaccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "sesion_id")
    private Sesion sesion;

    public Venta() {
    }

    public Venta(Long id, List<ProductoTransaccion> productos, Double total) {
        super(productos, total);
        this.id = id;
    }

    public Venta(List<ProductoTransaccion> productos, Double total) {
        super(productos, total);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Sesion getSesion() {
        return sesion;
    }

    public void setSesion(Sesion sesion) {
        this.sesion = sesion;
    }

    @Override
    public String toString() {
        return "Venta{" + super.toString() +  "id=" + id + ", sesion=" + sesion + '}';
    }
    
    

}
