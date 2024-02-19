package controller.main.texts;

import javax.swing.JTextArea;
import view.MainInterface;
import controller.observer.SalidaPalabrasTextObserver;

public class TextoSalidaPalabras implements SalidaPalabrasTextObserver {

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
    
    public static TextoSalidaPalabras getInstance(){
        return instance;
    }
    
    
    public String getText(){
        return textoSalidaPalabras.getText();
    }
    
    public void setText(String text){
        textoSalidaPalabras.setText(text);
    }
    
    public void insertPalabra(String cadena){
        textoSalidaPalabras.insert(cadena, 0);
    }

    @Override
    public void appendPalabra(String cadena) {
        textoSalidaPalabras.append(cadena);
    }
}
