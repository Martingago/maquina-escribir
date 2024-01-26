package controller.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import model.main.DirectorAlgoritmoBusquedaPalabras;
import view.MainInterface;

public class ButtonStart implements ActionListener {

    private ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

    private DirectorAlgoritmoBusquedaPalabras model;
    private MainInterface vista;

    //interfaces de
    private TotalPalabrasGeneradas outputTextTotalPalabras;
    private TotalTimeEjecution totalTimeEjecution;

    public ButtonStart(DirectorAlgoritmoBusquedaPalabras model, MainInterface vista) {
        this.model = model;
        this.vista = vista;
        this.vista.start_btn.addActionListener(this);
        this.outputTextTotalPalabras = TotalPalabrasGeneradas.getInstance(vista);
        this.totalTimeEjecution = totalTimeEjecution.getInstance(vista);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Se ha iniciado el hilo principal");
        Thread hilo = new Thread(model);
        hilo.start();

        //actualizacion paralela de los datos en pantalla:
        // Actualización paralela de los datos en pantalla:
        Runnable tarea = new Runnable() {
            public void run() {
                outputTextTotalPalabras.actualizarPalabras();
                totalTimeEjecution.updateAndPrintTimeEjecution();
            }
        };

        // Inicia después de 1 segundo y repite cada segundo
        executor.scheduleAtFixedRate(tarea, 1, 1, TimeUnit.SECONDS);

    }

}
