package controller;

import controller.main.ButtonStart;
import model.main.DirectorAlgoritmoBusquedaPalabras;
import view.MainInterface;

public class MainController{

    private DirectorAlgoritmoBusquedaPalabras model;
    private MainInterface vista;
    private ButtonStart startButton;

    public MainController(DirectorAlgoritmoBusquedaPalabras model, MainInterface vista) {
        this.model = model;
        this.vista = vista;
        this.startButton = new ButtonStart(model,vista);
        
    }

    public void iniciar() {
        vista.setTitle("Paradoja de los Monos y la máquina de escribir");
    }

}
