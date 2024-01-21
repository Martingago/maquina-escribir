package logic.main;

import data.StringData;
import global.GlobalData;
import logic.buffer.ControladorBufferBusquedaPalabras;

public class GestionarCadenaPalabras {

    private final String cadena = "Este es un texto de prueba de ejecucion meu deus"; //Cadena de texto que se ejecutará
    
    
    GlobalData datosGlobales;
    StringData textoGenerar;
    private String[] arrayPalabras;
    private int posicionFinal;
    

    public GestionarCadenaPalabras(GlobalData datosGlobales) {
        this.datosGlobales = datosGlobales;
        this.textoGenerar  = new StringData(cadena); //Conversion del texto a array
        this.arrayPalabras = textoGenerar.getArrayCadena();
        this.posicionFinal = textoGenerar.getTotalPalabrasBuscar();
    }

    public void manejarCadenaPalabras() {
        while (datosGlobales.getPosicionActual() != posicionFinal) {
            new ControladorBufferBusquedaPalabras(datosGlobales,arrayPalabras[datosGlobales.getPosicionActual()].toLowerCase()).iniciarBusquedaProcesoPalabra();
            int incrementPos = datosGlobales.getPosicionActual();
            datosGlobales.setPosicionActual(++incrementPos);
            
            //Se añaden al total de palabras generadas la cantidad que costó generar esta palabra:
            long intentosPalabraActual = datosGlobales.getNumeroPalabraActualGenerada();
            datosGlobales.setNumeroPalabrasTotalesGeneradas(datosGlobales.getNumeroPalabrasTotalesGeneradas() + intentosPalabraActual);
        }
         
    }

}
