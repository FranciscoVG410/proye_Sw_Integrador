package persistencia;

import interfaces.IEmpleadoDAO;
import entidades.Empleado;
import excepciones.PersistenciaException;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Alejandro Gómez Vega 00000247313
 * @author Francisco Valdez Gastelum 00000246904
 * @author Kathya Margarita Cordova Soto 00000246801
 * @author Manuel Octavio Perez Dominguez 00000247439
 */
public class EmpleadoDAO extends GenericDAO<Empleado> implements IEmpleadoDAO{
    public EmpleadoDAO() {
        super(Empleado.class);
    }
    
    @Override
    public Empleado EncontrarPorNombre(String nombre) throws PersistenciaException {
        EntityManager em = conexion.abrir();
        try {
            TypedQuery<Empleado> query = em.createQuery("SELECT e FROM Empleado e WHERE e.nombre = :nombre", Empleado.class);
            query.setParameter("nombre", nombre);
            return query.getSingleResult();
        } catch (Exception e) {
            throw new PersistenciaException("Error al encontrar empleado por nombre", e);
        } finally {
            em.close();
        }
    }
}
