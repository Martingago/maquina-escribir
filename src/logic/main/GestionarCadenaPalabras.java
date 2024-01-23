package logic.main;

import data.StringData;
import global.GlobalData;
import logic.buffer.ControladorBufferBusquedaPalabras;

public class GestionarCadenaPalabras {

    private final String cadena = "Este es un texto de prueba de ejecucion meu deus"; //Cadena de texto que se ejecutará
    
    
    StringData textoGenerar;
    private String[] arrayPalabras;
    private int posicionFinal;
    GlobalData data;

    public GestionarCadenaPalabras() {
        this.textoGenerar  = new StringData(cadena); //Conversion del texto a array
        this.arrayPalabras = textoGenerar.getArrayCadena();
        this.posicionFinal = textoGenerar.getTotalPalabrasBuscar();
        data = GlobalData.getInstance();
    }

    public void manejarCadenaPalabras() {
        
        while (data.getPosicionActual() != posicionFinal) {
            new ControladorBufferBusquedaPalabras(arrayPalabras[data.getPosicionActual()].toLowerCase()).iniciarBusquedaProcesoPalabra();
            int incrementPos = data.getPosicionActual();
            data.setPosicionActual(++incrementPos);
            //Aqui se llama al observer para actualizar la informacion que hay en GlobalData
        }
         
    }

}
