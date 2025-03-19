package entidades;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * Clase que representa un Administrador en la base de datos.
 * 
 * @author Alejandro Gómez Vega 00000247313
 * @author Francisco Valdez Gastelum 00000246904
 * @author Kathya Margarita Cordova Soto 00000246801
 * @author Manuel Octavio Perez Dominguez 00000247439
 * @author Adán Eduardo Cornejo Balcázar 000000228558
 */

/**
 * Administrador hereda de Usuario
 */
@Entity
@DiscriminatorValue("Administrador")
public class Administrador extends Usuario {

    /**
     * Constructor vacio
     */
    public Administrador() {
    }

    /**
     * Constructor
     */
    public Administrador(String nombre, String apellidoPaterno, String apellidoMaterno, String contrasenia) {
        super(nombre, apellidoPaterno, apellidoMaterno, contrasenia);
    }    
    
    /**
     * String Empleado
     */
    @Override
    public String toString() {
        return "Empleado{" + super.toString() + '}';
    }
}
