package model.main;

import data.StringData;
import model.global.GlobalData;
import model.global.ListaPalabrasEncontradas;
import model.logic.buffer.ControladorBufferBusquedaPalabras;

public class DirectorAlgoritmoBusquedaPalabras implements Runnable {

    /**
     * Clase principal del programa. Esta clase actua como directora para poder
     * ejecutar con éxito el algoritmo de generacion y comparación de palabras
     */
    private final String cadena = "test lets gou meu deus vamos a ver si esto esta bastante tiempo buscando lol"; //Cadena de texto que se ejecutará

    StringData textoGenerar; //clase que ayuda a convertir y gestionar los textos para poder ser tratados
    private String[] arrayPalabras;
    private int posicionFinal;
    GlobalData data;
    ListaPalabrasEncontradas lista;

    //Constructor que se genera automáticamente si no existe ningun fichero de guardado de datos previo
    public DirectorAlgoritmoBusquedaPalabras() {
        this.textoGenerar = new StringData(cadena); //Conversion del texto a array
        this.arrayPalabras = textoGenerar.getArrayCadena();
        this.posicionFinal = textoGenerar.getTotalPalabrasBuscar();
        data = GlobalData.getInstance();
        //lista = ListaPalabrasEncontradas.getInstance();
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
            System.out.println(data.getPosicionActual());
            new ControladorBufferBusquedaPalabras(arrayPalabras[data.getPosicionActual()].toLowerCase()).iniciarBusquedaProcesoPalabra();
        }
    }

}
