package controller.hooks;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class FormatNumbers {

    /**
     * Función que recibe como parametro un long y devuelve un string formateado con "." separando los millares
     * @param longNumber
     * @return String long formateado con "." cada 3 unidades
     */
    public static String formatNumber(long longNumber) {
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols(Locale.getDefault());
        simbolos.setGroupingSeparator('.');
        DecimalFormat formateador = new DecimalFormat("###,###", simbolos);
        String numeroCadenaFormato = formateador.format(longNumber);
        return numeroCadenaFormato;
    }

}
