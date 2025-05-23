/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package categoriaBO;

import entidades.CategoriaProducto;
import excepciones.PersistenciaException;
import java.util.List;
import persistencia.CategoriaProductoDAO;

/**
 *
 * @author eduar
 */
public class CategoriaBO {
    
    private final CategoriaProductoDAO categoriaDAO;

    public CategoriaBO() {
        this.categoriaDAO = new CategoriaProductoDAO();
    }

    public List<CategoriaProducto> obtenerTodasCategorias() throws PersistenciaException {
        return categoriaDAO.encontrarActivas();
    }

    public CategoriaProducto obtenerPorId(Long id) throws PersistenciaException {
        if (id == null) {
            throw new PersistenciaException("ID no puede ser nulo");
        }
        return categoriaDAO.encontrarPorId(id);
    }

    public void crearCategoria(String nombre) throws PersistenciaException {
        if (nombre == null || nombre.isBlank()) {
            throw new PersistenciaException("Nombre de categoría requerido");
        }
        CategoriaProducto categoria = new CategoriaProducto();
        categoria.setNombre(nombre);
        categoriaDAO.guardar(categoria);
    }

    public void editarCategoria(CategoriaProducto categoria) throws PersistenciaException {
        if (categoria == null || categoria.getId() == null) {
            throw new PersistenciaException("ID inválido para edición");
        }
        categoriaDAO.editar(categoria);
    }

    public void eliminarCategoria(Long id) throws PersistenciaException {
        if (id == null) {
            throw new PersistenciaException("ID requerido para eliminar");
        }
        categoriaDAO.eliminarLogico(id);
    }
    
}
