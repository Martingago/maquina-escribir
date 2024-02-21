package model.main;

import FICHERO_ANALIZAR.Fichero_analizar;
import data.ManejadorCadenaFichero;
import model.global.GlobalData;
import model.global.ListaPalabrasEncontradas;
import model.logic.buffer.ControladorBufferBusquedaPalabras;

public class DirectorAlgoritmoBusquedaPalabras implements Runnable {

    /**
     * Clase principal del programa. Esta clase actua como directora para poder
     * ejecutar con éxito el algoritmo de generacion y comparación de palabras
     */
    private Fichero_analizar fichero;
    private ManejadorCadenaFichero manejadorFichero; //clase que ayuda a convertir y gestionar los textos para poder ser tratados
    private String[] arrayPalabras;
    private int posicionFinal;
    private GlobalData data;
    private ListaPalabrasEncontradas lista;
    
    private ControladorBufferBusquedaPalabras controladorPalabras;
    private String palabraBuscar;

    //Constructor que se genera automáticamente si no existe ningun fichero de guardado de datos previo
    public DirectorAlgoritmoBusquedaPalabras() {
        this.fichero = new Fichero_analizar();
        this.manejadorFichero = new ManejadorCadenaFichero(this.fichero.getDoc()); //Se obtiene la cadena del fichero que se quiere analizar
        this.arrayPalabras = manejadorFichero.getArrayCadena();
        this.posicionFinal = manejadorFichero.getTotalPalabrasBuscar();
        data = GlobalData.getInstance();
        lista = ListaPalabrasEncontradas.getInstance();
        palabraBuscar = null;
    }

    public GlobalData getData() {
        return data;
    }

    /**
     * Función que inicia el hilo de la aplicación principal. Recorrerá todas
     * las posiciones de palabras y se ejecutará constantemente hasta llegar al
     * final (nunca).
     */
    @Override
    public void run() {
        while (data.getPosicionActual() != posicionFinal && data.isWorking()) {
            //Obtengo la palabra a buscar y seteo su tamaño para gestionar el hilo paralelo que emula la generacion de palabras
            palabraBuscar = arrayPalabras[data.getPosicionActual()].toLowerCase();
            data.setTamPalabra(palabraBuscar.length());
            
            controladorPalabras = new ControladorBufferBusquedaPalabras(palabraBuscar); //Crea un nuevo controlador con la palabra a buscar
            controladorPalabras.iniciarBusquedaProcesoPalabra(); //Inicia la busqueda de una palabra.
        }
    }

}
