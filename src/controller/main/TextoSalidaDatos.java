package controller.main;

import controller.observer.Observer;
import java.util.ArrayList;
import javax.swing.JTextArea;
import model.global.DesencriptedWord;
import model.global.ListaPalabrasEncontradas;
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
            instance.setLastWords();
        }
        return instance;
    }

    public void setLastWords() {
        //Se obtiene la instancia
        ArrayList<DesencriptedWord> lista = ListaPalabrasEncontradas.getInstance().getListPalabrasDesencriptadas();
        for(DesencriptedWord palabra : lista){
        text_panel.append(palabra.toString()+ "\n");
        }

    }

    @Override
    public void appendText(String cadena) {
        text_panel.append(cadena);
    }
}
