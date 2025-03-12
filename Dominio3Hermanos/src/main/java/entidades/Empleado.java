package entidades;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * Clase que representa un Empleado en la base de datos.
 * 
 * @author Alejandro Gómez Vega 00000247313
 * @author Francisco Valdez Gastelum 00000246904
 * @author Kathya Margarita Cordova Soto 00000246801
 * @author Manuel Octavio Perez Dominguez 00000247439
 * @author Adán Eduardo Cornejo Balcázar 000000228558
 */
@Entity
@DiscriminatorValue("Empleado")
public class Empleado extends Usuario {

    public Empleado() {
    }

    public Empleado(String nombre, String apellidoPaterno, String apellidoMaterno, String contrasenia) {
        super(nombre, apellidoPaterno, apellidoMaterno, contrasenia);
    }

    @Override
    public String toString() {
        return "Empleado{" + super.toString() + '}';
    }
    
}
