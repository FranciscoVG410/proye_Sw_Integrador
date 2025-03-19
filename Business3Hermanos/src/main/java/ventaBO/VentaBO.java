package ventaBO;

import conversores.ProductoConversor;
import dtos.ProductoDTO;
import entidades.Producto;
import entidades.ProductoTransaccion;
import entidades.Sesion;
import entidades.Venta;
import excepciones.PersistenciaException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import persistencia.ProductoDAO;
import persistencia.ProductoTransaccionDAO;
import persistencia.VentaDAO;

/**
 *
 * Clase con los metodos necesarios para realizar una venta.
 *
 * @author Alejandro Gómez Vega 00000247313
 * @author Francisco Valdez Gastelum 00000246904
 * @author Kathya Margarita Cordova Soto 00000246801
 * @author Manuel Octavio Perez Dominguez 00000247439
 * @author Adán Eduardo Cornejo Balcázar 000000228558
 */
public class VentaBO {
    //Inicializamos las DAO
    private ProductoDAO productoDAO = new ProductoDAO();
    private VentaDAO ventaDAO = new VentaDAO();
    private ProductoTransaccionDAO productoTransaccionDAO = new ProductoTransaccionDAO();
    
    //Inicializamos los Conversores
    private ProductoConversor productoConversor = new ProductoConversor();
    
    public List<ProductoDTO> encontrarTodo() {
        List<Producto> productosEntity = productoDAO.encontrarTodos();
        List<ProductoDTO> productosDTO = new ArrayList<>();

        for (Producto productoEntity : productosEntity) {
            productosDTO.add(productoConversor.entityADto(productoEntity));
        }

        return productosDTO;
    }

    public boolean verificarExistencia(ProductoDTO productoDTO) throws PersistenciaException {
        Producto producto = productoConversor.DtoAEntity(productoDTO);

        Producto encontrarPorId = productoDAO.encontrarPorId(producto.getId());

        return encontrarPorId != null;
    }

    public boolean verificarCantidad(ProductoDTO productoDTO, int cantidad) throws PersistenciaException {
        Producto producto = productoConversor.DtoAEntity(productoDTO);

        return producto.getCantidad() >= cantidad;
    }

    public double calcularTotalVenta(List<ProductoDTO> productosDTO) {
        double total = 0;
        for (ProductoDTO prodcutoDto : productosDTO) {
            total += prodcutoDto.getPrecioVenta() * prodcutoDto.getCantidadCompra();
        }
        return total;
    }

    public double calcularCambio(double montoTotal, double montoCliente) {
        return montoCliente - montoTotal;
    }

    /**
     * Registra una venta completa: se guarda la venta, se registra cada producto vendido
     * como una transacción y se actualiza el stock de los productos.
     *
     * @param productosDTO lista de productos a vender (cada uno con la cantidad a comprar)
     * @param montoCliente monto entregado por el cliente
     * @param sesion la sesión actual a la que se asocia la venta
     * @return el cambio que se debe entregar al cliente
     * @throws PersistenciaException si ocurre algún error en la persistencia o validación
     */
    public void vender(List<ProductoDTO> productosDTO, double montoCliente, Sesion sesion) throws PersistenciaException {
        double totalVenta = calcularTotalVenta(productosDTO);
        
        Venta venta = new Venta();
        venta.setSesion(sesion);
        venta.setTotal(totalVenta);
        ventaDAO.guardar(venta);
        
        for (ProductoDTO dto : productosDTO) {
            Producto producto = productoDAO.encontrarPorId(dto.getId());
            
            int cantidadVenta = dto.getCantidadCompra();
            if (producto.getCantidad() < cantidadVenta) {
                throw new PersistenciaException("Cantidad insuficiente para el producto: " + producto.getNombre());
            }
            
            ProductoTransaccion pt = new ProductoTransaccion();
            pt.setTransaccion(venta);
            pt.setProducto(producto);
            pt.setCantidad(cantidadVenta);
            pt.setPrecio(producto.getPrecioVenta());
            pt.setFechaHora(LocalDateTime.now());
            
            productoTransaccionDAO.guardar(pt);

            producto.setCantidad(producto.getCantidad() - cantidadVenta);
            productoDAO.editar(producto);
        }
    }
}
