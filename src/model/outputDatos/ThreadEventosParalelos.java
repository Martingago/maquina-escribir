package model.outputDatos;

import controller.main.TotalPalabrasGeneradas;
import controller.main.TotalTimeEjecution;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import model.global.GlobalData;
import view.MainInterface;

public class ThreadEventosParalelos implements Runnable {

    private ScheduledExecutorService executor;
    private TotalPalabrasGeneradas outputTextTotalPalabras;
    private TotalTimeEjecution totalTimeEjecution;
    GlobalData datos;

    public ThreadEventosParalelos(MainInterface vista) {
        this.outputTextTotalPalabras = TotalPalabrasGeneradas.getInstance(vista);
        this.totalTimeEjecution = totalTimeEjecution.getInstance(vista);
        this.executor = Executors.newScheduledThreadPool(1);
        this.executor.scheduleAtFixedRate(this, 1, 1, TimeUnit.SECONDS);
        this.datos = GlobalData.getInstance();
    }

    //Este hilo ejecuta los siguientes eventos cada segundo:
    @Override
    public void run() {
        System.out.println("Lanzado hilo de eventoossssss");
        if (datos.isWorking()) {
            outputTextTotalPalabras.actualizarPalabras(); //actualizar el contador de palabras
            totalTimeEjecution.updateAndPrintTimeEjecution(); //actualizar el tiempo de ejecución del programa
        }

    }

}
