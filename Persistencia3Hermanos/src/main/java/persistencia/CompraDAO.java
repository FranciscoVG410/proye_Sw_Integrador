package persistencia;

import entidades.Compra;
import excepciones.PersistenciaException;
import interfaces.ICompraDAO;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 *
 * @author Berry
 */
public class CompraDAO extends GenericDAO<Compra> implements ICompraDAO{
    public CompraDAO() {
        super(Compra.class);
    }

    @Override
    public List<Compra> EncontrarPorProveedor(Long proveedorId) throws PersistenciaException {
        EntityManager em = conexion.abrir();
        try {
            TypedQuery<Compra> query = em.createQuery("SELECT c FROM Compra c WHERE c.proveedor.id = :proveedorId", Compra.class);
            query.setParameter("proveedorId", proveedorId);
            return query.getResultList();
        } catch (Exception e) {
            throw new PersistenciaException("Error al encontrar compras por proveedor", e);
        } finally {
            em.close();
        }
    }
}
