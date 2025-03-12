package persistencia;

import entidades.Sesion;
import excepciones.PersistenciaException;
import interfaces.ISesionDAO;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 *
 * @author Berry
 */
public class SesionDAO extends GenericDAO<Sesion> implements ISesionDAO {
    public SesionDAO() {
        super(Sesion.class);
    }

    @Override
    public List<Sesion> EncontrarPorEmpleado(Long empleadoId) throws PersistenciaException {
        EntityManager em = conexion.abrir();
        try {
            TypedQuery<Sesion> query = em.createQuery("SELECT s FROM Sesion s WHERE s.empleado.id = :empleadoId", Sesion.class);
            query.setParameter("empleadoId", empleadoId);
            return query.getResultList();
        } catch (Exception e) {
            throw new PersistenciaException("Error al encontrar sesiones por empleado", e);
        } finally {
            em.close();
        }
    }    
}
