package interfaces;

import entidades.Venta;
import excepciones.PersistenciaException;
import java.util.List;

/**
 *
 * @author Alejandro Gómez Vega 00000247313
 * @author Francisco Valdez Gastelum 00000246904
 * @author Kathya Margarita Cordova Soto 00000246801
 * @author Manuel Octavio Perez Dominguez 00000247439
 */
public interface IVentasDAO extends IGenericDAO<Venta>{
    public List<Venta> EncontrarPorTotalMayorA(Double total) throws PersistenciaException;
}
