package controller.main.buttons;

import controller.hooks.ButtonsFunctions;
import controller.main.texts.TextoSalidaConsola;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.global.GlobalData;
import model.main.DirectorAlgoritmoBusquedaPalabras;
import model.outputDatos.ThreadEventosParalelos;
import view.MainInterface;

public class ButtonStart implements ActionListener {

    private DirectorAlgoritmoBusquedaPalabras model;
    private MainInterface vista;
    private GlobalData datos;
    ThreadEventosParalelos evtParalelos;
    ButtonsFunctions fButton;

    public ButtonStart(DirectorAlgoritmoBusquedaPalabras model, MainInterface vista) {
        this.model = model;
        this.vista = vista;
        this.vista.start_btn.addActionListener(this);
        this.datos = GlobalData.getInstance();
        this.evtParalelos = ThreadEventosParalelos.getInstance(vista);
        this.fButton = new ButtonsFunctions();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Si ya ha sido iniciado, no se puede volver a iniciar el programa
        evtParalelos.start();
        System.out.println("INICIADO EL PROGRAMA PRINCIPAL");
        TextoSalidaConsola.getInstance().escribirTextoConsola("INICIADO EL PROGRAMA PRINCIPAL", Color.BLUE);
        //Se inicia el hilo encargado de crear y comprobar palabras
        Thread hilo = new Thread(model);
        hilo.start();
        //Se pone el elemento como working
        datos.setWorking(true);
        fButton.handleButtonEnabled();
    }
}
