package controller.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.global.GlobalData;
import model.main.DirectorAlgoritmoBusquedaPalabras;
import model.outputDatos.ThreadEventosParalelos;
import view.MainInterface;

public class ButtonStart implements ActionListener {

    private DirectorAlgoritmoBusquedaPalabras model;
    private MainInterface vista;
    private ThreadEventosParalelos eventosParalelos;
    private GlobalData datos;

    public ButtonStart(DirectorAlgoritmoBusquedaPalabras model, MainInterface vista) {
        this.model = model;
        this.vista = vista;
        this.vista.start_btn.addActionListener(this);
        this.datos = GlobalData.getInstance();
        this.eventosParalelos = new ThreadEventosParalelos(this.vista);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Si ya ha sido iniciado, no se puede volver a iniciar el programa
        Thread evtParalelo = null;
        if (!datos.isWorking()) { //si está false se lanza
            datos.setWorking(true);
            System.out.println("Se ha iniciado el hilo principal");
            //Se inicia el hilo encargado de crear y comprobar palabras
            Thread hilo = new Thread(model);
            hilo.start();

            //se inicia el hilo de eventos paralelos (actualizar tiempo, interfaces, etc)
            evtParalelo = new Thread(eventosParalelos);
            evtParalelo.start();
        }else{
            System.out.println("No puedes ejecutar el mismo programa varias veces");
        }
    }
}
