package controller.main.texts;

import controller.hooks.DateFormat;
import java.util.Date;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;
import view.MainInterface;

public class TextoSalidaConsola {

    private static TextoSalidaConsola instance = null;
    private JTextPane texto_salida_consola;

    private TextoSalidaConsola(MainInterface vista) {
        this.texto_salida_consola = vista.salida_mensajes_consola;
    }

    public static TextoSalidaConsola getInstance(MainInterface vista) {
        if (instance == null) {
            instance = new TextoSalidaConsola(vista);
            
        }
        return instance;
    }
    public static TextoSalidaConsola getInstance(){
        return instance;
    }
    
    
    public  void escribirTextoConsola(String texto){
        StyledDocument doc = texto_salida_consola.getStyledDocument();
        try{
            doc.insertString(doc.getLength(), "<html>"+ DateFormat.formatDate(new Date()) + " - " + texto + "</html> \n", null);
        }catch(BadLocationException e){
            System.out.println("Error");
        }
    }

}
