package controller.main;

import controller.observer.Observer;
import javax.swing.JTextArea;
import view.MainInterface;

// Tu clase TextoSalidaDatos como Singleton
public class TextoSalidaDatos implements Observer {
    private static TextoSalidaDatos instance = null;
    private JTextArea text_panel;

    private TextoSalidaDatos(MainInterface vista) {
        this.text_panel = vista.texto_salida;
    }

    public static TextoSalidaDatos getInstance(MainInterface vista) {
        if (instance == null) {
            instance = new TextoSalidaDatos(vista);
        }
        return instance;
    }

    @Override
    public void appendText(String cadena) {
        text_panel.append(cadena);
    }
}
