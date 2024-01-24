package controller;

import controller.main.ButtonStart;
import controller.main.TextoSalidaDatos;
import controller.main.TextoSalidaPalabras;
import model.main.DirectorAlgoritmoBusquedaPalabras;
import view.MainInterface;

public class MainController{

    private DirectorAlgoritmoBusquedaPalabras model;
    private MainInterface vista;
    private ButtonStart startButton; //botón que inicia el programa
    private TextoSalidaDatos outputText; //Panel de texto que muestra la salida de datos
    private TextoSalidaPalabras outputTextPalabras;

    public MainController(DirectorAlgoritmoBusquedaPalabras model, MainInterface vista) {
        this.model = model;
        this.vista = vista;
        this.startButton = new ButtonStart(model,vista);
        this.outputText= TextoSalidaDatos.getInstance(vista); //Se inicializa una instancia singleton de la salida de texto
        this.outputTextPalabras = TextoSalidaPalabras.getInstance(vista);
    }

    public void iniciar() {
        vista.setTitle("Paradoja de los Monos y la máquina de escribir");
    }

}
