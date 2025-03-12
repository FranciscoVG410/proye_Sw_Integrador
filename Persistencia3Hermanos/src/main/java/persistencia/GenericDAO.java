package persistencia;

import conexionEM.Conexion;
import conexionEM.IConexion;
import excepciones.PersistenciaException;
import interfaces.IGenericDAO;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * Clase abstracta que hace el CRUD basico de cualquier entidad
 *
 * @param <T> Tipo de entidad que manejará el DAO.
 * 
 * @author Alejandro Gómez Vega 00000247313
 * @author Francisco Valdez Gastelum 00000246904
 * @author Kathya Margarita Cordova Soto 00000246801
 * @author Manuel Octavio Perez Dominguez 00000247439
 * @author Adán Eduardo Cornejo Balcázar 000000228558
 */
public abstract class GenericDAO<T> implements IGenericDAO<T>{
    final IConexion conexion;
    private Class<T> entityClass;

    public GenericDAO(Class<T> entityClass) {
        this.entityClass = entityClass;
        conexion = new Conexion();
    }

    @Override
    public void guardar(T entity) throws PersistenciaException {
        EntityManager em = conexion.abrir();
        em.getTransaction().begin();
        try{
            em.persist(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
            throw new PersistenciaException("Error para guardar "+ entity.toString(), e);
        } finally{
            em.close();
        }
    }

    @Override
    public void editar(T entity) throws PersistenciaException {
        EntityManager em = conexion.abrir();
        em.getTransaction().begin();
        try{
            em.merge(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
            throw new PersistenciaException("Error para editar "+ entity.toString(), e);
        } finally{
            em.close();
        }
    }

    @Override
    public void eliminar(T entity) throws PersistenciaException {
        EntityManager em = conexion.abrir();
        em.getTransaction().begin();
        try {
            em.remove(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
            throw new PersistenciaException("Error al eliminar el comentario", e);
        } finally {
            em.close();
        }
    }

    @Override
    public T encontrarPorId(Long id) throws PersistenciaException {
        EntityManager em = conexion.abrir();
        T entity = em.find(entityClass, id);
        em.close();
        return entity;
    }

    @Override
    public List<T> encontrarTodos() {
        EntityManager em = conexion.abrir();
        List<T> entityList = em.createQuery("SELECT e FROM " + entityClass.getSimpleName() + " e", entityClass).getResultList();
        em.close();
        return entityList;
    }

}
