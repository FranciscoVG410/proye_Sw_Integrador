package dtos;

/**
 *
 * Clase que representa un Producto como objeto de tranferencia de datos.
 * 
 * @author Alejandro Gómez Vega 00000247313
 * @author Francisco Valdez Gastelum 00000246904
 * @author Kathya Margarita Cordova Soto 00000246801
 * @author Manuel Octavio Perez Dominguez 00000247439
 * @author Adán Eduardo Cornejo Balcázar 000000228558
 */
public class ProductoDTO {
    private Long id;
    private String nombre;
    private Double precioVenta;
    private Integer cantidad;
    private String marca;
    private Long categoriaId;

    public ProductoDTO() {
    }

    public ProductoDTO(Long id, String nombre, Double precioVenta, Integer cantidad, String marca, Long categoriaId) {
        this.id = id;
        this.nombre = nombre;
        this.precioVenta = precioVenta;
        this.cantidad = cantidad;
        this.marca = marca;
        this.categoriaId = categoriaId;
    }

    public ProductoDTO(String nombre, Double precioVenta, Integer cantidad, String marca, Long categoriaId) {
        this.nombre = nombre;
        this.precioVenta = precioVenta;
        this.cantidad = cantidad;
        this.marca = marca;
        this.categoriaId = categoriaId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Long getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Long categoriaId) {
        this.categoriaId = categoriaId;
    }

    @Override
    public String toString() {
        return "ProductoDTO{" + "id=" + id + ", nombre=" + nombre + ", precioVenta=" + precioVenta + ", cantidad=" + cantidad + ", marca=" + marca + ", categoriaId=" + categoriaId + '}';
    }

}
