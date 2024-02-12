package controller.main.texts;

import controller.hooks.DateFormat;
import java.awt.Color;
import java.util.Date;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
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
    
    /**
     * Escribe en la consola del programa una fecha y hora +  texto de un determinado color y realiza un salto de liena para el siguiente mensaje.
     * @param texto String a escribir
     * @param color color del String
     */
    public  void escribirTextoConsola(String texto, Color color){
        StyledDocument doc = texto_salida_consola.getStyledDocument();
        //Se carga el color recibido
        SimpleAttributeSet set = new SimpleAttributeSet();
        StyleConstants.setForeground(set, color);
         try{
            doc.insertString(doc.getLength(),DateFormat.formatDate(new Date()) + " - " + texto +  "\n", set);
        }catch(BadLocationException e){
            System.out.println("Error");
        }
    }

}
