package controller.main;

import controller.observer.SalidaPalabrasObserver;
import javax.swing.JTextArea;
import view.MainInterface;

public class TextoSalidaPalabras implements SalidaPalabrasObserver {

    private static TextoSalidaPalabras instance = null;
    private JTextArea textoSalidaPalabras;
    
    private TextoSalidaPalabras(MainInterface view) {
        this.textoSalidaPalabras = view.texto_palabras;
    }
    
    public static TextoSalidaPalabras getInstance(MainInterface vista) {
        if (instance == null) {
            instance = new TextoSalidaPalabras(vista);
        }
        return instance;
    }

    @Override
    public void appendPalabra(String cadena) {
        textoSalidaPalabras.append(cadena);
    }
}
