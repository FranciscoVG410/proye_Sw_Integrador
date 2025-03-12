package persistencia;

import entidades.Venta;
import excepciones.PersistenciaException;
import interfaces.IVentasDAO;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 *
 * @author Berry
 */
public class VentaDAO extends GenericDAO<Venta> implements IVentasDAO{
    public VentaDAO() {
        super(Venta.class);
    }

    @Override
    public List<Venta> EncontrarPorTotalMayorA(Double total) throws PersistenciaException {
        EntityManager em = conexion.abrir();
        try {
            TypedQuery<Venta> query = em.createQuery("SELECT v FROM Venta v WHERE v.total > :total", Venta.class);
            query.setParameter("total", total);
            return query.getResultList();
        } catch (Exception e) {
            throw new PersistenciaException("Error al encontrar ventas por total mayor a " + total, e);
        } finally {
            em.close();
        }
    }
}
