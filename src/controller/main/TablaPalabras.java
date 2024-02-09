package controller.main;

import controller.hooks.DateFormat;
import controller.hooks.FormatNumbers;
import controller.observer.SalidaPalabrasTablaObserver;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.global.DesencriptedWord;
import model.global.ListaPalabrasEncontradas;
import view.MainInterface;

public class TablaPalabras implements SalidaPalabrasTablaObserver {

    private static TablaPalabras instance = null;
    private DefaultTableModel tablaElementos; //modelo de la tabla para añadir nuevas filas

    private TablaPalabras(MainInterface vista) {
        this.tablaElementos = vista.model;
    }

    public static TablaPalabras getInstance(MainInterface vista) {
        System.out.println("tabla");
        if (instance == null) {
            instance = new TablaPalabras(vista);
            instance.cargarPalabrasEncontradas();
        }
        return instance;
    }
    
    public static TablaPalabras getInstance(){
        return instance;
    }

    /**
     * Funcion que añade una nueva fila a la tabla con la información de una
     * palabra
     *
     * @param palabra
     */
    @Override
    public void addPalabra(DesencriptedWord palabra) {
        tablaElementos.addRow(new Object[]{
            FormatNumbers.formatIdPalabra(palabra.getPosicionPalabra()), //posicion de la palabra formateado
            palabra.getPalabraEncontrada(), //String de la fecha
            FormatNumbers.formatLongNumber(palabra.getIntentosPalabra()), //intentos de la palabra formateado
            DateFormat.formatDateToHour(palabra.getFechaEncontrada()), //hora encontrada formateado
            DateFormat.formatDateToDate(palabra.getFechaEncontrada()) //fecha econtrada formateado
        });
    }
    /**
     * Función que carga desde un ArrayList todas las palabras que han sido descubiertas y las añade a la tabla
     */
    @Override
    public void cargarPalabrasEncontradas() {
        ArrayList<DesencriptedWord> lista = ListaPalabrasEncontradas.getInstance().getListPalabrasDesencriptadas();
         for(DesencriptedWord palabra : lista){
             addPalabra(palabra);
        }
    }
    
    
    
    

}
