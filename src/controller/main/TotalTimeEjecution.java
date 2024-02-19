package controller.main;

import controller.hooks.DateFormat;
import javax.swing.JTextField;
import model.global.GlobalData;
import view.MainInterface;

public class TotalTimeEjecution {

    /**
     * ==========================================================================================
     * CLASE ENCARGADA DE MANEJAR Y ACTUALIZAR EN EL PANEL DE TEXTO EL TIEMPO TOTAL DE EJECUCIÓN
     * ==========================================================================================
     */
    
    private static TotalTimeEjecution instance = null;
    private JTextField text_panel;
    private GlobalData globalData;

    
    private TotalTimeEjecution(MainInterface vista) {
        this.text_panel = vista.total_time_ejecution; //referencia del panel en la vista
        this.globalData = GlobalData.getInstance(); //intancia del objeto GlobalData que contiene todos los datos del programa
        this.text_panel.setText(DateFormat.formatTotalTimeEjecution(globalData.getSecsTotalActive())); //Se realiza el print inicial
    }

    
    public static TotalTimeEjecution getInstance(MainInterface vista) {
        if (instance == null) {
            instance = new TotalTimeEjecution(vista);
        }
        return instance;
    }

    /**
     * Funcion que incrementa la variable del Objeto GlobalData => SecsTotalActive en 1
     * Una vez hecho, se actualiza la información del panel con los nuevos datos
     * La información que se carga en el panel es previamente formateada empleando la funcion "formatTotalTimeEjecution" de la clase "DateFormat"
     */
    public void updateAndPrintTimeEjecution() {
        globalData.incrementSecsTotalActive(); //se incrementa el valor de tiempo de ejecucion en 1.
        text_panel.setText(DateFormat.formatTotalTimeEjecution(globalData.getSecsTotalActive()));
    }

}
