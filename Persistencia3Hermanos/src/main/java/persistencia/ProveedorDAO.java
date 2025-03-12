package persistencia;

import entidades.Proveedor;
import excepciones.PersistenciaException;
import interfaces.IProveedorDAO;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Alejandro Gómez Vega 00000247313
 * @author Francisco Valdez Gastelum 00000246904
 * @author Kathya Margarita Cordova Soto 00000246801
 * @author Manuel Octavio Perez Dominguez 00000247439
 */
public class ProveedorDAO extends GenericDAO<Proveedor> implements IProveedorDAO{
    public ProveedorDAO() {
        super(Proveedor.class);
    }

    @Override
    public Proveedor EncontrarPorNombre(String nombre) throws PersistenciaException {
        EntityManager em = conexion.abrir();
        try {
            TypedQuery<Proveedor> query = em.createQuery("SELECT p FROM Proveedor p WHERE p.nombre = :nombre", Proveedor.class);
            query.setParameter("nombre", nombre);
            return query.getSingleResult();
        } catch (Exception e) {
            throw new PersistenciaException("Error al encontrar proveedor por nombre", e);
        } finally {
            em.close();
        }
    }
}
