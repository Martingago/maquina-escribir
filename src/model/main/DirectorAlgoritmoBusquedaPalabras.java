package model.main;

import data.StringData;
import model.global.GlobalData;
import model.logic.buffer.ControladorBufferBusquedaPalabras;

public class DirectorAlgoritmoBusquedaPalabras implements Runnable {

    /**
     * Clase principal del programa. Esta clase actua como directora para poder
     * ejecutar con éxito el algoritmo de generacion y comparación de palabras
     */
    private final String cadena = "ejecucion meu deus"; //Cadena de texto que se ejecutará

    StringData textoGenerar; //clase que ayuda a convertir y gestionar los textos para poder ser tratados
    private String[] arrayPalabras;
    private int posicionFinal;
    GlobalData data;

    //Constructor que se genera automáticamente si no existe ningun fichero de guardado de datos previo
    public DirectorAlgoritmoBusquedaPalabras() {
        this.textoGenerar = new StringData(cadena); //Conversion del texto a array
        this.arrayPalabras = textoGenerar.getArrayCadena();
        this.posicionFinal = textoGenerar.getTotalPalabrasBuscar();
        data = GlobalData.getInstance();
    }

    public void orquestarBusquedaPalabraObjetivo() {

    }

    /**
     * Función que inicia el hilo de la aplicación principal. Recorrerá todas
     * las posiciones de palabras y se ejecutará constantemente hasta llegar al
     * final (nunca).
     */
    @Override
    public void run() {
        System.out.println("Creado hilo principal");
        while (data.getPosicionActual() != posicionFinal && data.isWorking()) {
            new ControladorBufferBusquedaPalabras(arrayPalabras[data.getPosicionActual()].toLowerCase()).iniciarBusquedaProcesoPalabra();
        }
        System.out.println("hilo finaliza");
    }

}
