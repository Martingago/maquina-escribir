package controller.main.texts;

import controller.observer.SalidaPalabrasTextObserver;
import javax.swing.JTextPane;
import view.MainInterface;

public class UltimaPalabraEncontrada implements SalidaPalabrasTextObserver {

    private static UltimaPalabraEncontrada instance = null;
    private JTextPane textoSalidaUltimaPalabraEncontrada;

    private UltimaPalabraEncontrada(MainInterface view) {
        this.textoSalidaUltimaPalabraEncontrada = view.text_ultima_palabra_encontrada;
    }

    public static UltimaPalabraEncontrada getInstance(MainInterface vista) {
        if (instance == null) {
            instance = new UltimaPalabraEncontrada(vista);
        }
        return instance;
    }
    
    
    public static UltimaPalabraEncontrada getInstance(){
        return instance;
    }

    @Override
    public void appendPalabra(String cadena) {
        textoSalidaUltimaPalabraEncontrada.setText(cadena);
    }

  

}
