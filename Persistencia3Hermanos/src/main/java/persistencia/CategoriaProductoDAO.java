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
            TypedQuery<CategoriaProducto> query = em.createQuery(
                "SELECT c FROM CategoriaProducto c WHERE c.nombre = :nombre AND c.estado = true",
                CategoriaProducto.class
            );
            query.setParameter("nombre", nombre);
            return query.getSingleResult();
        } catch (Exception e) {
            throw new PersistenciaException("Error al encontrar categoría por nombre", e);
        } finally {
            em.close();
        }
    }

    public void eliminarLogico(Long id) throws PersistenciaException {
        EntityManager em = conexion.abrir();
        try {
            em.getTransaction().begin();
            CategoriaProducto categoria = em.find(CategoriaProducto.class, id);
            if (categoria != null) {
                categoria.setEstado(false);
                em.merge(categoria);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
            throw new PersistenciaException("Error al eliminar lógicamente la categoría", e);
        } finally {
            em.close();
        }
    }

    public void reactivar(Long id) throws PersistenciaException {
        EntityManager em = conexion.abrir();
        try {
            em.getTransaction().begin();
            CategoriaProducto categoria = em.find(CategoriaProducto.class, id);
            if (categoria != null) {
                categoria.setEstado(true);
                em.merge(categoria);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
            throw new PersistenciaException("Error al reactivar la categoría", e);
        } finally {
            em.close();
        }
    }
}
