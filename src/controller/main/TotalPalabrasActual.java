package controller.main;

import controller.hooks.FormatNumbers;
import controller.observer.SalidaNumericaPalabrasObserver;
import javax.swing.JTextField;
import model.global.GlobalData;
import view.MainInterface;

public class TotalPalabrasActual implements SalidaNumericaPalabrasObserver {

    private static TotalPalabrasActual instance = null;

    private JTextField salida_palabras_actual;
    private GlobalData globalData;

    public TotalPalabrasActual(MainInterface vista) {
        this.salida_palabras_actual = vista.total_words_now;
        globalData = GlobalData.getInstance();
        this.salida_palabras_actual.setText(FormatNumbers.formatLongNumber(globalData.getNumeroPalabraActualGenerada()));
    }

    public static TotalPalabrasActual getInstance(MainInterface vista) {
        if (instance == null) {
            instance = new TotalPalabrasActual(vista);
        }
        return instance;
    }

    @Override
    public void actualizarOutputNumeroPalabras() {
        //Se muestra en el textPanel el valor de GlobalData palabrasActuales
        long totalPalabras = globalData.getNumeroPalabraActualGenerada();
        String formattedNumber = FormatNumbers.formatLongNumber(totalPalabras);
        salida_palabras_actual.setText(formattedNumber);
    }

}
