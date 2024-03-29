package controller.main;

import controller.hooks.FormatNumbers;
import javax.swing.JTextField;
import model.global.GlobalData;
import view.MainInterface;
import controller.observer.SalidaNumericaPalabrasObserver;

public class TotalPalabrasGeneradas implements SalidaNumericaPalabrasObserver {

    private static TotalPalabrasGeneradas instance = null;

    private JTextField salida_total_palabras;
    private GlobalData datosGlobales;

    public TotalPalabrasGeneradas(MainInterface vista) {
        this.salida_total_palabras = vista.total_words_generated;
        datosGlobales = GlobalData.getInstance();
        this.salida_total_palabras.setText(FormatNumbers.formatLongNumber(datosGlobales.getPalabrasTotalesGeneradas()));
    }

    public static TotalPalabrasGeneradas getInstance(MainInterface vista) {
        if (instance == null) {
            instance = new TotalPalabrasGeneradas(vista);
        }
        return instance;
    }

    /**
     * Actualiza la interfaz de usuario con el panel de texto con el numero total de palabras generadas
     */
    @Override
    public void actualizarOutputNumeroPalabras() {
        //Actualizar el numero total de palabras:
        long totalPalabras = datosGlobales.getPalabrasTotalesGeneradas();
        String formattedNumber = FormatNumbers.formatLongNumber(totalPalabras);
        salida_total_palabras.setText(formattedNumber);
    }

}
