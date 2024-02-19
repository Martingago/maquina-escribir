package controller.hooks;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

    /**
     * Transforma una fecha en un String de dia/mes/año horas:minutos:segundos
     *
     * @param fecha
     * @return
     */
    public static String formatDate(Date fecha) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return formato.format(fecha);
    }

    /**
     * Transforma una fecha en un String de dia/mes/año
     *
     * @param fecha
     * @return
     */
    public static String formatDateToDate(Date fecha) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(fecha);
    }

    /**
     * Tranforma una fecha en un String de horas:minutos:segundos:milisegundos
     *
     * @param fecha
     * @return
     */
    public static String formatDateToHour(Date fecha) {
        SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss:SSS");
        return formato.format(fecha);
    }

    /**
     * Funcion que recibe como parametro un tiempo de ejecucion y devuelve una cadena String formateada en: hh:mm:ss
     * @param timeEjecution
     * @return 
     */
    public static String formatTotalTimeEjecution(long timeEjecution) {
        long horas = timeEjecution / 3600;
        int minutos = (int) (timeEjecution % 3600) / 60;
        int segundos = (int) timeEjecution % 60;

        return String.format("%02dh %02dmin %02dseg", horas, minutos, segundos);
    }

}
