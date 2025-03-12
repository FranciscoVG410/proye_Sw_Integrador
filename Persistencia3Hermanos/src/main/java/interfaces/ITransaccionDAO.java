package interfaces;

import entidades.Transaccion;
import excepciones.PersistenciaException;
import java.util.List;

/**
 *
 * @author Alejandro Gómez Vega 00000247313
 * @author Francisco Valdez Gastelum 00000246904
 * @author Kathya Margarita Cordova Soto 00000246801
 * @author Manuel Octavio Perez Dominguez 00000247439
 */
public interface ITransaccionDAO extends IGenericDAO<Transaccion>{
    public List<Transaccion> EncontrarPorTotal(Double total) throws PersistenciaException;
}
