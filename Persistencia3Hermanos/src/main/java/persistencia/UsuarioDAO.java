package persistencia;

import entidades.Usuario;
import excepciones.PersistenciaException;
import interfaces.IUsuarioDAO;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
/**
 *
 * @author Berry
 */
public class UsuarioDAO extends GenericDAO<Usuario> implements IUsuarioDAO{
    
    public UsuarioDAO() {
        super(Usuario.class);
    }
    
    @Override
    public Usuario encontrarPorNombre(String nombre) throws PersistenciaException {
        EntityManager em = conexion.abrir();
        try {
            TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u WHERE u.nombre = :nombre", Usuario.class);
            query.setParameter("nombre", nombre);
            return query.getSingleResult();
        } catch (Exception e) {
            throw new PersistenciaException("Error al buscar usuario con nombre: " + nombre, e);
        } finally {
            em.close();
        }
    }
}
