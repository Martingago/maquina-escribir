package logic.main;

import data.StringData;
import logic.buffer.ControladorBufferBusquedaPalabras;

public class GestionarCadenaPalabras {

    private final String cadena = "Este es un texto"; //Cadena de texto que se ejecutará
    StringData textoGenerar;
    private String[] arrayPalabras;
    private int posicion;
    private int posicionFinal;

    public GestionarCadenaPalabras() {
        this.textoGenerar  = new StringData(cadena); //Conversion del texto a array
        this.arrayPalabras = textoGenerar.getArrayCadena();
        this.posicion = 0;
        this.posicionFinal = textoGenerar.getTotalPalabrasBuscar();
    }

    public void manejarCadenaPalabras() {
        while (posicion != posicionFinal) {
            new ControladorBufferBusquedaPalabras(arrayPalabras[posicion].toLowerCase()).iniciarBusquedaProcesoPalabra();
            posicion++;
        }
        

    }

}
