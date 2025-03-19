package dtos;

import java.time.LocalDateTime;

/**
 *
 * Clase que representa una Sesion como objeto de tranferencia de datos.
 * 
 * @author Alejandro Gómez Vega 00000247313
 * @author Francisco Valdez Gastelum 00000246904
 * @author Kathya Margarita Cordova Soto 00000246801
 * @author Manuel Octavio Perez Dominguez 00000247439
 * @author Adán Eduardo Cornejo Balcázar 000000228558
 */
public class SesionDTO {
    /**
     * Atributos
     */
    private Long id;
    private LocalDateTime fechaApertura;
    private LocalDateTime fechaCierre;
    private double dineroGenerado;
    private int ventasTotales;
    private Long cajaId;
    private Long empleadoId;

    /**
     * Constructor vacio
     */
    public SesionDTO() {
    }

    /**
     * Constructores
     * @param id
     * @param fechaApertura
     * @param fechaCierre
     * @param dineroGenerado
     * @param ventasTotales
     * @param cajaId
     * @param empleadoId
     */
    public SesionDTO(Long id, LocalDateTime fechaApertura, LocalDateTime fechaCierre, double dineroGenerado, int ventasTotales, Long cajaId, Long empleadoId) {
        this.id = id;
        this.fechaApertura = fechaApertura;
        this.fechaCierre = fechaCierre;
        this.dineroGenerado = dineroGenerado;
        this.ventasTotales = ventasTotales;
        this.cajaId = cajaId;
        this.empleadoId = empleadoId;
    }

    public SesionDTO(LocalDateTime fechaApertura, LocalDateTime fechaCierre, double dineroGenerado, int ventasTotales, Long cajaId, Long empleadoId) {
        this.fechaApertura = fechaApertura;
        this.fechaCierre = fechaCierre;
        this.dineroGenerado = dineroGenerado;
        this.ventasTotales = ventasTotales;
        this.cajaId = cajaId;
        this.empleadoId = empleadoId;
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

    public LocalDateTime getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(LocalDateTime fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public LocalDateTime getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(LocalDateTime fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public double getDineroGenerado() {
        return dineroGenerado;
    }

    public void setDineroGenerado(double dineroGenerado) {
        this.dineroGenerado = dineroGenerado;
    }

    public int getVentasTotales() {
        return ventasTotales;
    }

    public void setVentasTotales(int ventasTotales) {
        this.ventasTotales = ventasTotales;
    }

    public Long getCajaId() {
        return cajaId;
    }

    public void setCajaId(Long cajaId) {
        this.cajaId = cajaId;
    }

    public Long getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(Long empleadoId) {
        this.empleadoId = empleadoId;
    }

    /**
     * String SesionDTO
     */
    @Override
    public String toString() {
        return "SesionDTO{" + "id=" + id + ", fechaApertura=" + fechaApertura + ", fechaCierre=" + fechaCierre + ", dineroGenerado=" + dineroGenerado + ", ventasTotales=" + ventasTotales + ", cajaId=" + cajaId + ", empleadoId=" + empleadoId + '}';
    }
    
}
