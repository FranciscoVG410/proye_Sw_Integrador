package conexionEM;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * Clase que genera y abre una conexion a la base de datos con EntityManager
 * 
 * @author Alejandro Gómez Vega 00000247313
 * @author Francisco Valdez Gastelum 00000246904
 * @author Kathya Margarita Cordova Soto 00000246801
 * @author Manuel Octavio Perez Dominguez 00000247439
 * @author Adán Eduardo Cornejo Balcázar 000000228558
 */
public class Conexion implements IConexion{
    
    /**
     * Abre una conexión con la base de datos utilizando JPA.
     *
     * @return Un objeto EntityManager que representa la conexión establecida.
     */
    @Override
    public EntityManager abrir() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConexionPU");
        EntityManager em = emf.createEntityManager();
        return em;
    }
    
    public static void cerrarFactory() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConexionPU");
        if (emf.isOpen()) {
            emf.close();
        }
    }
}
