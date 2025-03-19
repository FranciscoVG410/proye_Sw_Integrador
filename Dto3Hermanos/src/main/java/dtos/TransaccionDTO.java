package dtos;

/**
 *
 * Clase que representa una Transacción como objeto de tranferencia de datos.
 * 
 * @author Alejandro Gómez Vega 00000247313
 * @author Francisco Valdez Gastelum 00000246904
 * @author Kathya Margarita Cordova Soto 00000246801
 * @author Manuel Octavio Perez Dominguez 00000247439
 * @author Adán Eduardo Cornejo Balcázar 000000228558
 */
public class TransaccionDTO {
    /**
     * Atributos
     */
    private Long id;
    private Double total;
    private boolean estado;

    /**
     * Constructor vacio
     */
    public TransaccionDTO() {
    }
    
    /**
     * Constructores
     * @param id
     * @param total
     * @param estado
     */
    public TransaccionDTO(Long id, Double total, boolean estado) {
        this.id = id;
        this.total = total;
        this.estado = estado;
    }

    public TransaccionDTO(Double total, boolean estado) {
        this.total = total;
        this.estado = estado;
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
     * String TransaccionDTO
     */
    @Override
    public String toString() {
        return "TransaccionDTO{" + "id=" + id + ", total=" + total + ", estado=" + estado + '}';
    }
    
}
