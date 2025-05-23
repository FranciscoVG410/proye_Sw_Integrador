package productoBO;

import conversores.ProductoConversor;
import dtos.ProductoDTO;
import entidades.CategoriaProducto;
import entidades.Producto;
import excepciones.PersistenciaException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistencia.CategoriaProductoDAO;
import persistencia.ProductoDAO;

/**
 *
 * Clase con los metodos necesarios para Gestionar el producto
 *
 * @author Alejandro Gómez Vega 00000247313
 * @author Francisco Valdez Gastelum 00000246904
 * @author Kathya Margarita Cordova Soto 00000246801
 * @author Manuel Octavio Perez Dominguez 00000247439
 * @author Adán Eduardo Cornejo Balcázar 000000228558
 */
public class ProductoBO {

    private final ProductoDAO productoDAO;
    private final ProductoConversor productoConversor;
    private final CategoriaProductoDAO categoriaDAO = new CategoriaProductoDAO();

    public ProductoBO() {
        this.productoDAO = new ProductoDAO();
        this.productoConversor = new ProductoConversor();
    }

    public List<ProductoDTO> encontrarTodo() {
        List<Producto> productosEntity = null;
        try {
            productosEntity = productoDAO.encontrarActivos();
        } catch (PersistenciaException ex) {
            Logger.getLogger(ProductoBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        List<ProductoDTO> productosDTO = new ArrayList<>();

        for (Producto productoEntity : productosEntity) {
            productosDTO.add(productoConversor.entityADto(productoEntity));
        }

        return productosDTO;
    }

    public void crearProducto(ProductoDTO dto) throws PersistenciaException {
        if (dto == null || dto.getNombre() == null || dto.getNombre().isBlank()
                || dto.getMarca() == null || dto.getMarca().isBlank()) {
            throw new PersistenciaException("Campos vacíos no permitidos");
        }

        Producto producto = productoConversor.DtoAEntity(dto);
        productoDAO.guardar(producto);
    }

    public void editarProducto(ProductoDTO dto) throws PersistenciaException {
        if (dto == null || dto.getId() == null) {
            throw new PersistenciaException("ID inválido para edición");
        }

        Producto producto = productoConversor.DtoAEntity(dto);
        productoDAO.editar(producto);
    }

    public void eliminarProducto(Long id) throws PersistenciaException {
        if (id == null) {
            throw new PersistenciaException("ID requerido para eliminar producto");
        }
        productoDAO.eliminarLogico(id);
    }

    public String obtenerNombreCategoriaPorId(Long categoriaId) throws PersistenciaException {
        if (categoriaId == null) {
            throw new PersistenciaException("ID de categoría no puede ser null");
        }

        CategoriaProducto categoria = categoriaDAO.encontrarPorId(categoriaId);

        if (categoria == null) {
            throw new PersistenciaException("Categoría no encontrada para ID: " + categoriaId);
        }

        return categoria.getNombre();
    }

}
