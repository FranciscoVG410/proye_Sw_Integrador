package persistencia;

import entidades.ProductoTransaccion;
import excepciones.PersistenciaException;
import interfaces.IProductoTransaccionDAO;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 *
 * @author Berry
 */
public class ProductoTransaccionDAO extends GenericDAO<ProductoTransaccion> implements IProductoTransaccionDAO {
    public ProductoTransaccionDAO() {
        super(ProductoTransaccion.class);
    }

    @Override
    public List<ProductoTransaccion> EncontrarPorProducto(Long productoId) throws PersistenciaException {
        EntityManager em = conexion.abrir();
        try {
            TypedQuery<ProductoTransaccion> query = em.createQuery("SELECT pt FROM ProductoTransaccion pt WHERE pt.producto.id = :productoId", ProductoTransaccion.class);
            query.setParameter("productoId", productoId);
            return query.getResultList();
        } catch (Exception e) {
            throw new PersistenciaException("Error al encontrar transacciones por producto", e);
        } finally {
            em.close();
        }
    }    
}
