package interfaces;

import excepciones.PersistenciaException;
import java.util.List;

/**
 * Interfaz genérica para operaciones CRUD en la base de datos.
 *
 * @param <T> Tipo de entidad que manejará el DAO.
 * 
 * @author Alejandro Gómez Vega 00000247313
 * @author Francisco Valdez Gastelum 00000246904
 * @author Kathya Margarita Cordova Soto 00000246801
 * @author Manuel Octavio Perez Dominguez 00000247439
 * @author Adán Eduardo Cornejo Balcázar 000000228558
 */
public interface IGenericDAO<T> {
    void guardar(T entity) throws PersistenciaException;

    void editar(T entity) throws PersistenciaException;

    void eliminar(T entity) throws PersistenciaException;

    T encontrarPorId(Long id) throws PersistenciaException;

    List<T> encontrarTodos() throws PersistenciaException;
}
