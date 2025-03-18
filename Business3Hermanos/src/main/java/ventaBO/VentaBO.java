package ventaBO;

import conversores.ProductoConversor;
import dtos.ProductoDTO;
import entidades.Producto;
import excepciones.PersistenciaException;
import java.util.ArrayList;
import java.util.List;
import persistencia.ProductoDAO;

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

    public boolean verificarExistencia(ProductoDTO productoDTO) throws PersistenciaException{
        Producto producto = productoConversor.DtoAEntity(productoDTO);
        
        Producto encontrarPorId = productoDAO.encontrarPorId(producto.getId());
        
        return encontrarPorId != null;
    }
    
    public boolean verificarCantidad(ProductoDTO productoDTO, int cantidad) throws PersistenciaException{
        Producto producto = productoConversor.DtoAEntity(productoDTO);
        
        return producto.getCantidad()>= cantidad;
    }
    
    public double calcularCambio(double montoTotal, double montoCliente ){
        return montoCliente - montoTotal;
    }
    
    public void vender(List<ProductoDTO> productosDTO) throws PersistenciaException{
        List<Producto> productos = new ArrayList<>();
        
        for (ProductoDTO productoDTO : productosDTO) {
            productos.add(productoConversor.DtoAEntity(productoDTO));
        }
        
    }
}
