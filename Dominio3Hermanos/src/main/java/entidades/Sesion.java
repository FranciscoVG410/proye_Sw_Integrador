package entidades;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * Clase que representa la sesion en la base de datos.
 * 
 * @author Alejandro Gómez Vega 00000247313
 * @author Francisco Valdez Gastelum 00000246904
 * @author Kathya Margarita Cordova Soto 00000246801
 * @author Manuel Octavio Perez Dominguez 00000247439
 * @author Adán Eduardo Cornejo Balcázar 000000228558
 */
@Entity
@Table(name = "Sesiones")
public class Sesion implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha_apertura", nullable = false)
    private LocalDateTime fechaApertura;

    @Column(name = "fecha_cierre")
    private LocalDateTime fechaCierre;

    @Column(name = "dinero_generado", nullable = false)
    private double dineroGenerado = 0.0;

    @Column(name = "ventas_totales", nullable = false)
    private int ventasTotales = 0;
    
    @ManyToOne
    @JoinColumn(name = "caja_id", nullable = false)
    private Caja caja; 

    @ManyToOne
    @JoinColumn(name = "empleado_id", nullable = false)
    private Empleado empleado;

    @OneToMany(mappedBy = "sesion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Venta> productosVendidos;

    public Sesion() {
    }

    public Sesion(Long id, LocalDateTime fechaApertura, LocalDateTime fechaCierre, Caja caja, Empleado empleado) {
        this.id = id;
        this.fechaApertura = fechaApertura;
        this.fechaCierre = fechaCierre;
        this.caja = caja;
        this.empleado = empleado;
    }

    public Sesion(LocalDateTime fechaApertura, LocalDateTime fechaCierre, Caja caja, Empleado empleado) {
        this.fechaApertura = fechaApertura;
        this.fechaCierre = fechaCierre;
        this.caja = caja;
        this.empleado = empleado;
    }

    public Sesion(Long id, LocalDateTime fechaApertura, LocalDateTime fechaCierre, Caja caja, Empleado empleado, List<Venta> productosVendidos) {
        this.id = id;
        this.fechaApertura = fechaApertura;
        this.fechaCierre = fechaCierre;
        this.caja = caja;
        this.empleado = empleado;
        this.productosVendidos = productosVendidos;
    }

    @Override
    public String toString() {
        return "Sesion{" + "id=" + id + ", fechaApertura=" + fechaApertura + ", fechaCierre=" + fechaCierre + ", dineroGenerado=" + dineroGenerado + ", ventasTotales=" + ventasTotales + ", caja=" + caja + ", empleado=" + empleado + ", productosVendidos=" + productosVendidos + '}';
    }
    
}
