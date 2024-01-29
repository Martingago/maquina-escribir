package controller.main;

import controller.observer.TotalTimeEjecutionObserver;
import javax.swing.JTextField;
import model.global.GlobalData;
import view.MainInterface;

public class TotalTimeEjecution implements TotalTimeEjecutionObserver {

    private static TotalTimeEjecution instance = null;
    private JTextField text_panel;
    private GlobalData globalData;

    private TotalTimeEjecution(MainInterface vista) {
        this.text_panel = vista.total_time_ejecution;
        this.globalData = GlobalData.getInstance();
        this.text_panel.setText(formatTimeEjecution(globalData.getSecsTotalActive()));
    }

    public static TotalTimeEjecution getInstance(MainInterface vista) {
        if (instance == null) {
            instance = new TotalTimeEjecution(vista);
        }
        return instance;
    }

    public void updateAndPrintTimeEjecution() {
        updateTimeEjecution(); //se incrementa el valor de tiempo de ejecucion en 1.
        String format = formatTimeEjecution(globalData.getSecsTotalActive()); //formato de salida de tiempo
        printTimeEjecution(format);

    }

    @Override
    public void updateTimeEjecution() {
        //aumenta el valor tiempo de ejecucion en 1 (unidad de segundos)
        globalData.incrementSecsTotalActive();
    }

    @Override
    public String formatTimeEjecution(long timeEjecution) {
        long horas = timeEjecution / 3600;
        int minutos = (int) (timeEjecution % 3600) / 60;
        int segundos = (int) timeEjecution % 60;

        return String.format("%02dh %02dmin %02dseg", horas, minutos, segundos);
    }

    @Override
    public void printTimeEjecution(String formattedTimeEjecution) {
        //actualiza el texto con el nuevo tiempo formateado
        text_panel.setText(formattedTimeEjecution);
    }

}
