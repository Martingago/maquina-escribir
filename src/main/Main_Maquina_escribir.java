package main;

import controller.MainController;
import controller.main.texts.TextoSalidaConsola;
import model.main.DirectorAlgoritmoBusquedaPalabras;
import view.MainInterface;


public class Main_Maquina_escribir {

    public static void main(String[] args) {
        //Se instancia la consola para obtener los primeros mensajes de inicializacion del programa
        MainInterface vista = new MainInterface();
        TextoSalidaConsola.getInstance(vista);
        DirectorAlgoritmoBusquedaPalabras modelo = new DirectorAlgoritmoBusquedaPalabras();
        
        MainController controller = MainController.getInstance(); //instancia vacia de controller
        
        controller.setView(vista); //Se inician referencias 
        
        controller.setModelAndView(modelo, vista); //Se inician los datos principales de la instancia
        controller.iniciar();
        vista.setVisible(true);
    }
}
