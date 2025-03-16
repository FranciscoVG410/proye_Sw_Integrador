package dtos;

/**
 *
 * Clase que representa un Usuario como objeto de tranferencia de datos.
 * 
 * @author Alejandro Gómez Vega 00000247313
 * @author Francisco Valdez Gastelum 00000246904
 * @author Kathya Margarita Cordova Soto 00000246801
 * @author Manuel Octavio Perez Dominguez 00000247439
 * @author Adán Eduardo Cornejo Balcázar 000000228558
 */
public class AdministradorDTO extends UsuarioDTO {

    public AdministradorDTO() {
    }

    public AdministradorDTO(Long id, String nombre, String apellidoPaterno, String apellidoMaterno) {
        super(id, nombre, apellidoPaterno, apellidoMaterno);
    }

    public AdministradorDTO(String nombre, String apellidoPaterno, String apellidoMaterno) {
        super(nombre, apellidoPaterno, apellidoMaterno);
    }
    
}
