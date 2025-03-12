package persistencia;

import entidades.CategoriaProducto;
import excepciones.PersistenciaException;
import interfaces.ICategoriaProductoDAO;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Alejandro Gómez Vega 00000247313
 * @author Francisco Valdez Gastelum 00000246904
 * @author Kathya Margarita Cordova Soto 00000246801
 * @author Manuel Octavio Perez Dominguez 00000247439
 */
public class CategoriaProductoDAO extends GenericDAO<CategoriaProducto> implements ICategoriaProductoDAO {
    public CategoriaProductoDAO() {
        super(CategoriaProducto.class);
    }
    
    @Override
    public CategoriaProducto EncontrarPorNombre(String nombre) throws PersistenciaException {
        EntityManager em = conexion.abrir();
        try {
            TypedQuery<CategoriaProducto> query = em.createQuery("SELECT c FROM CategoriaProducto c WHERE c.nombre = :nombre", CategoriaProducto.class);
            query.setParameter("nombre", nombre);
            return query.getSingleResult();
        } catch (Exception e) {
            throw new PersistenciaException("Error al encontrar categoría por nombre", e);
        } finally {
            em.close();
        }
    }
}
