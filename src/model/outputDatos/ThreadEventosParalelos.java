package model.outputDatos;

import controller.main.TotalPalabrasGeneradas;
import controller.main.TotalTimeEjecution;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import model.global.GlobalData;
import view.MainInterface;

public class ThreadEventosParalelos implements Runnable {

    /**
     * Hilo secundario del programa que se encarga de actualizar informacion de
     * la interfaz cada "x" segundos bajo un executor encargado de lanzar las
     * funciones bajo un determinado tiempo.
     *
     * ==> outputTextTotalPalabras: JTextField sobre el que se escribe el
     * contador de palabras totales ==> totalTimeEjecution: JTextField sobre el
     * que se escribe el tiempo total de ejecución del programa (segundos)
     * formateado a hh:mm:ss
     */
    private static ThreadEventosParalelos instance = null;
    private ScheduledExecutorService executor;
    private TotalPalabrasGeneradas outputTextTotalPalabras;
    private TotalTimeEjecution totalTimeEjecution;
    GlobalData datos; //instancia de globalDatos

    private ThreadEventosParalelos(MainInterface vista) {
        this.outputTextTotalPalabras = TotalPalabrasGeneradas.getInstance(vista);
        this.totalTimeEjecution = totalTimeEjecution.getInstance(vista);
        this.datos = GlobalData.getInstance();
    }

    public static synchronized ThreadEventosParalelos getInstance(MainInterface vista) {
        if (instance == null) {
            instance = new ThreadEventosParalelos(vista);
        }
        return instance;
    }

    //Este hilo ejecuta los siguientes eventos cada segundo:
    @Override
    public void run() {
        if (datos.isWorking()) { //Se realiza una validacion adicional de que isWorking sea true
            outputTextTotalPalabras.actualizarPalabras(); //actualizar el contador de palabras
            totalTimeEjecution.updateAndPrintTimeEjecution(); //actualizar el tiempo de ejecución del programa
        } else {
            System.out.println("El sistema está pausado");
        }

    }

    /**
     * Inicia el objeto executor atribuyendole 1 hilo y haciendo que éste se
     * esté ejecutando cada segundo Cada vez que se pulsa start el hilo se crea
     * de nuevo.
     * 
     * === IMPORTANTE ===: Para evitar que este hilo sea lanzado múltiples veces, se realiza una comprobación datos.isWorking, de forma que si
     * el programa ya se encontraba en ejecución, no pueda volver a ejecutarse este hilo
     *
     */
    public void start() {
        if (!datos.isWorking()) {
            this.executor = Executors.newScheduledThreadPool(1);
            this.executor.scheduleAtFixedRate(this, 1, 1, TimeUnit.SECONDS);
        }else{
            System.out.println("No se ha re-lanzado el hilo ya que el atributo de working debe estar en false");
        }

    }

    /**
     * Finaliza el objeto executor creado con anterioridad.
     * === IMPORTANTE ===: para evitar errores al detener el hilo, se realiza una comprobación de que el hilo haya sido iniciado previamente mediante
     * datos.isWorking sea true, de forma que si nunca se ha iniciado previamente, no podrá detenerse
     */
    public void stop() {
        if(datos.isWorking()){
            this.executor.shutdown();
        }else{
            System.out.println("No se ha podido pausar el hilo ya que no se ha ejecutado previamente");
        }
        
    }

}
