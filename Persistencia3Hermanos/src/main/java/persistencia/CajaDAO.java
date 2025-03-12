package persistencia;

import entidades.Caja;
import excepciones.PersistenciaException;
import interfaces.ICajaDAO;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Alejandro Gómez Vega 00000247313
 * @author Francisco Valdez Gastelum 00000246904
 * @author Kathya Margarita Cordova Soto 00000246801
 * @author Manuel Octavio Perez Dominguez 00000247439
 */
public class CajaDAO extends GenericDAO<Caja> implements ICajaDAO{
    public CajaDAO() {
        super(Caja.class);
    }

    @Override
    public Caja EncontrarPorEstado(String estado) throws PersistenciaException {
        EntityManager em = conexion.abrir();
        try {
            TypedQuery<Caja> query = em.createQuery("SELECT c FROM Caja c WHERE c.estado = :estado", Caja.class);
            query.setParameter("estado", estado);
            return query.getSingleResult();
        } catch (Exception e) {
            throw new PersistenciaException("Error al encontrar caja por estado", e);
        } finally {
            em.close();
        }
    }
}
