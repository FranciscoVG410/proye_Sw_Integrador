package interfaces;

import entidades.Sesion;
import excepciones.PersistenciaException;
import java.util.List;

/**
 *
 * @author Alejandro Gómez Vega 00000247313
 * @author Francisco Valdez Gastelum 00000246904
 * @author Kathya Margarita Cordova Soto 00000246801
 * @author Manuel Octavio Perez Dominguez 00000247439
 */
public interface ISesionDAO extends IGenericDAO<Sesion>{
    public List<Sesion> EncontrarPorEmpleado(Long empleadoId) throws PersistenciaException;
}
