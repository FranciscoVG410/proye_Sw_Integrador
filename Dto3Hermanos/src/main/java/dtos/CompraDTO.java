package dtos;

/**
 *
 * Clase que representa una Compra como objeto de tranferencia de datos.
 * 
 * @author Alejandro Gómez Vega 00000247313
 * @author Francisco Valdez Gastelum 00000246904
 * @author Kathya Margarita Cordova Soto 00000246801
 * @author Manuel Octavio Perez Dominguez 00000247439
 * @author Adán Eduardo Cornejo Balcázar 000000228558
 */
public class CompraDTO extends TransaccionDTO{
    private Long proveedorId;

    /**
     * Constructor vacio
     */
    public CompraDTO() {
    }

    /**
     * Constructores
     * @param proveedorId
     * @param id
     * @param total
     * @param estado
     */
    public CompraDTO(Long proveedorId, Long id, Double total, boolean estado) {
        super(id, total, estado);
        this.proveedorId = proveedorId;
    }

    public CompraDTO(Long proveedorId, Double total, boolean estado) {
        super(total, estado);
        this.proveedorId = proveedorId;
    }

    /**
     * Setters y Getters
     */
    public Long getProveedorId() {
        return proveedorId;
    }

    public void setProveedorId(Long proveedorId) {
        this.proveedorId = proveedorId;
    }

    /**
     * String CompraDTO
     */
    @Override
    public String toString() {
        return "CompraDTO{" + super.toString() + "proveedorId=" + proveedorId + '}';
    }

}
