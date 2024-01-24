package controller.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.main.DirectorAlgoritmoBusquedaPalabras;
import view.MainInterface;

public class ButtonStart implements ActionListener {

    private DirectorAlgoritmoBusquedaPalabras model;
    private MainInterface vista;
    

    public ButtonStart(DirectorAlgoritmoBusquedaPalabras model, MainInterface vista) {
        this.model = model;
        this.vista = vista;
        this.vista.start_btn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Se ha iniciado el hilo principal");
        Thread hilo = new Thread(model);
        hilo.start();
    }

}
