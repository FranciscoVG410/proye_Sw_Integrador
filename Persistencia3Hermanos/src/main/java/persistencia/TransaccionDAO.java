package persistencia;

import entidades.Transaccion;
import excepciones.PersistenciaException;
import interfaces.ITransaccionDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Berry
 */
public class TransaccionDAO extends GenericDAO<Transaccion> implements ITransaccionDAO{

    public TransaccionDAO() {
        super(Transaccion.class);
    }

    @Override
    public List<Transaccion> EncontrarPorTotal(Double total) throws PersistenciaException {
        EntityManager em = conexion.abrir();
        try {
            TypedQuery<Transaccion> query = em.createQuery("SELECT t FROM Transaccion t WHERE t.total = :total", Transaccion.class);
            query.setParameter("total", total);
            return query.getResultList();
        } catch (Exception e) {
            throw new PersistenciaException("Error al buscar transacciones con total: " + total, e);
        } finally {
            em.close();
        }
    }
    
}
