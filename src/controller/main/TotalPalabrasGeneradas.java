package controller.main;

import controller.observer.SalidaPalabrasTotalesObserver;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.swing.JTextField;
import model.global.GlobalData;
import view.MainInterface;

public class TotalPalabrasGeneradas implements SalidaPalabrasTotalesObserver {

    private static TotalPalabrasGeneradas instance = null;

    private JTextField salida_total_palabras;
    private GlobalData datosGlobales;

    public TotalPalabrasGeneradas(MainInterface vista) {
        this.salida_total_palabras = vista.total_words_generated;
        datosGlobales = GlobalData.getInstance();
        this.salida_total_palabras.setText( String.valueOf(datosGlobales.getPalabrasTotalesGeneradas()));
    }

    public static TotalPalabrasGeneradas getInstance(MainInterface vista) {
        if (instance == null) {
            instance = new TotalPalabrasGeneradas(vista);
        }
        return instance;
    }

    /**
     * Actualiza el texto con el numero total de palabras generadas
     */
    @Override
    public void actualizarPalabras() {
        //Actualizar el numero total de palabras:
        long totalPalabras = datosGlobales.getPalabrasTotalesGeneradas();
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols(Locale.getDefault());
        simbolos.setGroupingSeparator('.');
        DecimalFormat formateador = new DecimalFormat("###,###", simbolos);
        salida_total_palabras.setText(formateador.format(totalPalabras));
    }

}
