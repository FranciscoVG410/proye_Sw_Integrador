package persistencia;

import entidades.Administrador;
import interfaces.IAdministradorDAO;

/**
 *
 * @author Alejandro Gómez Vega 00000247313
 * @author Francisco Valdez Gastelum 00000246904
 * @author Kathya Margarita Cordova Soto 00000246801
 * @author Manuel Octavio Perez Dominguez 00000247439
 */
public class AdministradorDAO extends GenericDAO<Administrador> implements IAdministradorDAO{
    public AdministradorDAO() {
        super(Administrador.class);
    }
}
