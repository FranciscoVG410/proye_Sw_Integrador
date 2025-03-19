package dtos;

/**
 *
 * Clase que representa una Venta como objeto de tranferencia de datos.
 * 
 * @author Alejandro Gómez Vega 00000247313
 * @author Francisco Valdez Gastelum 00000246904
 * @author Kathya Margarita Cordova Soto 00000246801
 * @author Manuel Octavio Perez Dominguez 00000247439
 * @author Adán Eduardo Cornejo Balcázar 000000228558
 */
public class VentaDTO extends TransaccionDTO{
    /**
     * Atributos
     */
    private Long sesionId;

    /**
     * Constructor vacio
     */
    public VentaDTO() {
    }

    /**
     * Constructores
     * @param sesionId
     * @param id
     * @param total
     * @param estado
     */
    public VentaDTO(Long sesionId, Long id, Double total, boolean estado) {
        super(id, total, estado);
        this.sesionId = sesionId;
    }

    public VentaDTO(Long sesionId, Double total, boolean estado) {
        super(total, estado);
        this.sesionId = sesionId;
    }

    /**
     * Setters y Getters
     */
    public Long getSesionId() {
        return sesionId;
    }

    public void setSesionId(Long sesionId) {
        this.sesionId = sesionId;
    }

    /**
     * String VentaDTO
     */
    @Override
    public String toString() {
        return "VentaDTO{" + super.toString() + "sesionId=" + sesionId + '}';
    }
    
}
