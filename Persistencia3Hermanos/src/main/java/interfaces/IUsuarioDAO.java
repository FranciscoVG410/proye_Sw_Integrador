package interfaces;

import entidades.Usuario;
import excepciones.PersistenciaException;

/**
 *
 * @author Alejandro Gómez Vega 00000247313
 * @author Francisco Valdez Gastelum 00000246904
 * @author Kathya Margarita Cordova Soto 00000246801
 * @author Manuel Octavio Perez Dominguez 00000247439
 */
public interface IUsuarioDAO extends IGenericDAO<Usuario>{
    public Usuario encontrarPorNombre(String nombre) throws PersistenciaException;
}
