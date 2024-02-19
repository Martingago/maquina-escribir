package controller.main.texts;

import FICHERO_ANALIZAR.Fichero_analizar;
import data.ManejadorCadenaFichero;
import javax.swing.JTextPane;
import model.global.GlobalData;
import view.MainInterface;

public class TextoEvolucionPalabras {

    private static TextoEvolucionPalabras instance = null;
    private JTextPane texto_evolucion_palabras;
    private GlobalData globalData;
    private Fichero_analizar fichero;
    private ManejadorCadenaFichero lectura;

    private TextoEvolucionPalabras(MainInterface vista) {
        this.texto_evolucion_palabras = vista.text_global_palabras; //instancia del objeto jTextPane
        fichero = new Fichero_analizar();
        lectura = new ManejadorCadenaFichero(fichero.getDoc());
        globalData = GlobalData.getInstance();
        escribirTextoIniciar();
    }

    public static TextoEvolucionPalabras getInstance(MainInterface vista) {
        if (instance == null) {
            instance = new TextoEvolucionPalabras(vista);
        }
        return instance;
    }
    
    
    public static TextoEvolucionPalabras getInstance(){
        return instance;
    }

    /**
     * Funcion que escribe en el panel de texto general la evolucion de texto
     * actual: En negrita se mostrarán las palabras ya descubiertas, mientras
     * que en gris las palabras aun sin descubrir
     */

    public void escribirTextoIniciar() {
        String[] analizar = lectura.getArrayCadena();
        int posicion = globalData.getPosicionActual();
        StringBuilder textoFormateado = new StringBuilder();
        //Se abren las cabeceras
        textoFormateado.append("<html> <body>");
        //BLOQUE DE TEXTO EN NEGRITA
        if(posicion>0) textoFormateado.append("<font size='5'>");
        //bucle for para antes de la posicion
        for (int i = 0; i < analizar.length && i< posicion; i++) {
            textoFormateado.append(analizar[i] + " ");
        }
        if(posicion>0) textoFormateado.append("</font>");
        
        //BLOQUE DE TEXTO EN GRIS
        textoFormateado.append("<font size='5' color='gray'><strike>");
        //bucle for para después de la posicion
        for (int i = posicion; i < analizar.length; i++) {
            textoFormateado.append(analizar[i] + " ");
        }
        //Se cierran las cabeceras
        textoFormateado.append("</strike> </font> </body> </html> ");
        
        //Se escribe el texto:
        texto_evolucion_palabras.setText(textoFormateado.toString());
    }

}
