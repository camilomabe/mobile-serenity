package helpers;


import java.util.logging.Logger;


public class ManagerLog {

    static Logger logger = Logger.getLogger("MyLog");

    private ManagerLog() {
    }

    public static void imprimirFallo(String mensaje) {
        logger.info(mensaje);
    }
}
