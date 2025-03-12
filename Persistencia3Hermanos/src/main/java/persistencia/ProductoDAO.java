package persistencia;

import entidades.Producto;
import excepciones.PersistenciaException;
import interfaces.IProductoDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Berry
 */
public class ProductoDAO extends GenericDAO<Producto> implements IProductoDAO{
    
    public ProductoDAO() {
        super(Producto.class);
    }

    @Override
    public List<Producto> encontrarPorCategoria(Long categoriaId) throws PersistenciaException {
        EntityManager em = conexion.abrir();
        try {
            TypedQuery<Producto> query = em.createQuery("SELECT p FROM Producto p WHERE p.categoria.id = :categoriaId", Producto.class);
            query.setParameter("categoriaId", categoriaId);
            return query.getResultList();
        } catch (Exception e) {
            throw new PersistenciaException("Error al buscar productos por categoría: " + categoriaId, e);
        } finally {
            em.close();
        }
    }
    
}
