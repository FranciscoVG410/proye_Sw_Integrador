package entidades;

import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

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

    public Venta() {
    }
    
    public Venta(List<ProductoTransaccion> productos, Double total) {
        super(productos, total);
    }
}
