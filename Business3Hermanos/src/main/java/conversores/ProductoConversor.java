package conversores;

import dtos.ProductoDTO;
import entidades.CategoriaProducto;
import entidades.Producto;
import excepciones.PersistenciaException;
import java.util.List;
import persistencia.CategoriaProductoDAO;

/**
 *
 * @author Natasha Ruiz Perez
 */
public class ProductoConversor {
    public ProductoDTO entityADto(Producto producto){
        return new ProductoDTO(
            producto.getId(),
            producto.getNombre(),
            producto.getPrecioVenta(),
            producto.getCantidad(),
            producto.getMarca(),
            producto.getCategoria().getId()
        );
    }
    
    public Producto DtoAEntity(ProductoDTO productoDTO) throws PersistenciaException{
        CategoriaProductoDAO categoriaProductoDAO = new CategoriaProductoDAO();
        return new Producto(
            productoDTO.getId(),
            productoDTO.getNombre(),
            productoDTO.getPrecioVenta(),
            productoDTO.getCantidad(),
            productoDTO.getMarca(),
            categoriaProductoDAO.encontrarPorId(productoDTO.getCategoriaId()) 
        );
    }
}
