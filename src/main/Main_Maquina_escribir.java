package main;

import controller.MainController;
import model.main.DirectorAlgoritmoBusquedaPalabras;
import view.MainInterface;


public class Main_Maquina_escribir {

    public static void main(String[] args) {
        DirectorAlgoritmoBusquedaPalabras modelo = new DirectorAlgoritmoBusquedaPalabras();
        MainInterface vista = new MainInterface();
        MainController controller = MainController.getInstance(); //instancia vacia de controller
        controller.setModelAndView(modelo, vista); //Se inician los datos principales de la instancia
        controller.iniciar();
        vista.setVisible(true);
    }
}
