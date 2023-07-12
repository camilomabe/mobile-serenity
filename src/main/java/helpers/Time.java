package helpers;


public class Time {


    private static final String LOG_CLASS = "\nEl elemento no se presenta correctamente -> ";

    private Time() {
    }

    public static void getTimeOut(int time) {
        final String NOT_FOUND = " -> Elemento no fue encontrado ";
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            ManagerLog.imprimirFallo(LOG_CLASS + NOT_FOUND + e);
            Thread.currentThread().interrupt();
        }
    }
}
