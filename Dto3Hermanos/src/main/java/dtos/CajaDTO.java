package dtos;

/**
 *
 * Clase que representa una Caja como objeto de tranferencia de datos.
 * 
 * @author Alejandro Gómez Vega 00000247313
 * @author Francisco Valdez Gastelum 00000246904
 * @author Kathya Margarita Cordova Soto 00000246801
 * @author Manuel Octavio Perez Dominguez 00000247439
 * @author Adán Eduardo Cornejo Balcázar 000000228558
 */
public class CajaDTO {
    private Long id;
    private Double dineroActual;
    private String estado;

    public CajaDTO() {
    }

    public CajaDTO(Long id, Double dineroActual, String estado) {
        this.id = id;
        this.dineroActual = dineroActual;
        this.estado = estado;
    }

    public CajaDTO(Double dineroActual, String estado) {
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

    @Override
    public String toString() {
        return "CajaDTO{" + "id=" + id + ", dineroActual=" + dineroActual + ", estado=" + estado + '}';
    }
    
}
