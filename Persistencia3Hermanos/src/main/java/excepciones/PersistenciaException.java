package excepciones;

/**
 *
 * @author Alejandro Gómez Vega 00000247313
 * @author Francisco Valdez Gastelum 00000246904
 * @author Kathya Margarita Cordova Soto 00000246801
 * @author Manuel Octavio Perez Dominguez 00000247439
 * @author Adán Eduardo Cornejo Balcázar 000000228558
 */
public class PersistenciaException extends Exception {

    /**
     * Constructor por defecto
     */
    public PersistenciaException() {
    }

    /**
     * Constructor que recibe un mensaje.
     *
     * @param message el mensaje que describe el error.
     */
    public PersistenciaException(String message) {
        super(message);
    }

    /**
     * Constructor que recibe un mensaje y una causa del error.
     *
     * @param message el mensaje que describe el error.
     * @param cause la causa original del error (otra excepción).
     */
    public PersistenciaException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructor que recibe solo una causa del error.
     *
     * @param cause la causa original del error (otra excepción).
     */
    public PersistenciaException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructor completo que permite personalizar el comportamiento de la
     * excepción.
     *
     * @param message el mensaje que describe el error.
     * @param cause la causa original del error (otra excepción).
     * @param enableSuppression
     * @param writableStackTrace
     */
    public PersistenciaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }    
}
