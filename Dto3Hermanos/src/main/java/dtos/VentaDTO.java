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
    private Long sesionId;

    public VentaDTO() {
    }

    public VentaDTO(Long sesionId, Long id, Double total, boolean estado) {
        super(id, total, estado);
        this.sesionId = sesionId;
    }

    public VentaDTO(Long sesionId, Double total, boolean estado) {
        super(total, estado);
        this.sesionId = sesionId;
    }

    public Long getSesionId() {
        return sesionId;
    }

    public void setSesionId(Long sesionId) {
        this.sesionId = sesionId;
    }

    @Override
    public String toString() {
        return "VentaDTO{" + super.toString() + "sesionId=" + sesionId + '}';
    }
    
}
