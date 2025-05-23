package persistencia;

import entidades.CategoriaProducto;
import entidades.Producto;
import excepciones.PersistenciaException;
import interfaces.ICategoriaProductoDAO;
import java.util.List;
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

    public List<CategoriaProducto> encontrarActivas() throws PersistenciaException {
    EntityManager em = conexion.abrir();
    try {
        TypedQuery<CategoriaProducto> query = em.createQuery(
            "SELECT c FROM CategoriaProducto c WHERE c.estado = true",
            CategoriaProducto.class
        );
        return query.getResultList(); 
    } catch (Exception e) {
        throw new PersistenciaException("Error al listar categorías activas", e);
    } finally {
        em.close();
    }
}
    
    public void eliminarLogico(Long id) throws PersistenciaException {
    EntityManager em = conexion.abrir();
    try {
        em.getTransaction().begin();

        /* 1. Traemos la categoría a eliminar */
        CategoriaProducto categoria = em.find(CategoriaProducto.class, id);
        if (categoria == null) {
            throw new PersistenciaException("La categoría con id " + id + " no existe");
        }

        /* 2. Obtenemos la categoría “Sin Categoria” */
        TypedQuery<CategoriaProducto> q = em.createQuery(
            "SELECT c FROM CategoriaProducto c WHERE c.nombre = :nombre", 
            CategoriaProducto.class
        ).setParameter("nombre", "Sin Categoria");
        CategoriaProducto sinCategoria = q.getResultStream().findFirst().orElse(null);

        if (sinCategoria == null) {               
            sinCategoria = new CategoriaProducto();
            sinCategoria.setNombre("Sin Categoria");
            sinCategoria.setEstado(true);
            em.persist(sinCategoria);            
        }

        /* 3. Reasignamos los productos */
        for (Producto producto : categoria.getProductos()) {
            producto.setCategoria(sinCategoria);
            em.merge(producto);
        }

        /* 4. Marcamos la categoría original como inactiva */
        categoria.setEstado(false);
        em.merge(categoria);

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
