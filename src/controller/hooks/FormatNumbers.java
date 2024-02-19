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
    public static String formatLongNumber(long longNumber) {
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols(Locale.getDefault());
        simbolos.setGroupingSeparator('.');
        DecimalFormat formateador = new DecimalFormat("###,###", simbolos);
        String numeroCadenaFormato = formateador.format(longNumber);
        return numeroCadenaFormato;
    }
    
    /**
     * Recibe un valor numero y devuelve dicho valor formateado a 5 digitos
     * @param posicionPalabra
     * @return 
     */
    public static String formatIdPalabra(int posicionPalabra){
        return String.format("%05d", posicionPalabra);
    }

}
