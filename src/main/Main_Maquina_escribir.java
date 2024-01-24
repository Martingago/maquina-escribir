package main;

import controller.MainController;
import model.main.DirectorAlgoritmoBusquedaPalabras;
import view.MainInterface;


public class Main_Maquina_escribir {

    public static void main(String[] args) {
        DirectorAlgoritmoBusquedaPalabras modelo = new DirectorAlgoritmoBusquedaPalabras();
        MainInterface vista = new MainInterface();
        MainController controller = new MainController(modelo, vista);
        controller.iniciar();
        vista.setVisible(true);
    }
}
