package interfaces;

import entidades.CategoriaProducto;
import excepciones.PersistenciaException;

/**
 *
 * @author Alejandro Gómez Vega 00000247313
 * @author Francisco Valdez Gastelum 00000246904
 * @author Kathya Margarita Cordova Soto 00000246801
 * @author Manuel Octavio Perez Dominguez 00000247439
 */
public interface ICategoriaProductoDAO extends IGenericDAO<CategoriaProducto>{
    public CategoriaProducto EncontrarPorNombre(String nombre) throws PersistenciaException;
}
