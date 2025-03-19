package dtos;

import java.time.LocalDateTime;

/**
 *
 * Clase que representa un Producto Transacción como objeto de tranferencia de datos.
 * 
 * @author Alejandro Gómez Vega 00000247313
 * @author Francisco Valdez Gastelum 00000246904
 * @author Kathya Margarita Cordova Soto 00000246801
 * @author Manuel Octavio Perez Dominguez 00000247439
 * @author Adán Eduardo Cornejo Balcázar 000000228558
 */
public class ProductoTransaccionDTO {
    /**
     * Atributos
     */
    private Long id;
    private Long productoId;
    private Long transaccionId;
    private Double precio;
    private Integer cantidad;
    private LocalDateTime fechaHora;

    /**
     * Constructor vacio
     */
    public ProductoTransaccionDTO() {
    }

    /**
     * Constructores
     * @param id
     * @param productoId
     * @param transaccionId
     * @param precio
     * @param cantidad
     * @param fechaHora
     */
    public ProductoTransaccionDTO(Long id, Long productoId, Long transaccionId, Double precio, Integer cantidad, LocalDateTime fechaHora) {
        this.id = id;
        this.productoId = productoId;
        this.transaccionId = transaccionId;
        this.precio = precio;
        this.cantidad = cantidad;
        this.fechaHora = fechaHora;
    }

    public ProductoTransaccionDTO(Long productoId, Long transaccionId, Double precio, Integer cantidad, LocalDateTime fechaHora) {
        this.productoId = productoId;
        this.transaccionId = transaccionId;
        this.precio = precio;
        this.cantidad = cantidad;
        this.fechaHora = fechaHora;
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

    public Long getProductoId() {
        return productoId;
    }

    public void setProductoId(Long productoId) {
        this.productoId = productoId;
    }

    public Long getTransaccionId() {
        return transaccionId;
    }

    public void setTransaccionId(Long transaccionId) {
        this.transaccionId = transaccionId;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    /**
     * String ProductoTransaccionDTO
     */
    @Override
    public String toString() {
        return "ProductoTransaccionDTO{" + "id=" + id + ", productoId=" + productoId + ", transaccionId=" + transaccionId + ", precio=" + precio + ", cantidad=" + cantidad + ", fechaHora=" + fechaHora + '}';
    }

}
