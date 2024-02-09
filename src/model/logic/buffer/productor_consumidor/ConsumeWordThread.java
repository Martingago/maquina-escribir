package model.logic.buffer.productor_consumidor;

import controller.main.TablaPalabras;
import java.util.*;
import model.global.DesencriptedWord;
import model.global.GlobalData;
import model.global.ListaPalabrasEncontradas;
import model.logic.buffer.productor_consumidor.functions.CompararPalabras;

public class ConsumeWordThread implements Runnable {

    private BufferProducirYConsumirPalabras buffer; //buffer sobre el que se consumen las palabras
    private CompararPalabras comprobar; //Clase ComprararPalabras que contiene la función que permite comprobar una palabra con la palabra objetivo
    private DesencriptedWord palabraDesencriptada;

    /**
     * Inicia un hilo encargado de consumir palabras del buffer y comprobarlo
     * con la palabra objetivo
     *
     * @param buffer buffer del que se extraen las palabras a analizar
     * @param palabraBase palabra objetivo que se desea encontrar
     */
    public ConsumeWordThread(BufferProducirYConsumirPalabras buffer, String palabraBase) {
        this.buffer = buffer;
        this.comprobar = new CompararPalabras(palabraBase);
        this.palabraDesencriptada = null;
        
    }

    @Override
    public void run() {
        GlobalData globalData = GlobalData.getInstance();
        TablaPalabras tablaPalabras = TablaPalabras.getInstance();
        ListaPalabrasEncontradas listaPalabras = ListaPalabrasEncontradas.getInstance();
        
        while (!buffer.isFound()&& buffer.getDatosGlobales().isWorking()) {
            String palabraGenerada = buffer.consumirWord(); //palabra generada que se va a consumir
            boolean encontrada = comprobar.validarPalabra(palabraGenerada); //valida que la palabra sea igual a la palabra base
            if (encontrada) {
                //si se encuentra la palabra se pone a true
                buffer.setFound(encontrada);
                
                 //Se establece el momento de la ultima palabra encontrada
                globalData.setUltimaPalabraEncontrada(new Date());
                
                //Se crea un objeto de DesencriptedWord
                palabraDesencriptada = new DesencriptedWord(globalData.getPosicionActual(),
                        palabraGenerada, globalData.getNumeroPalabraActualGenerada(),globalData.getUltimaPalabraEncontrada());
                
                //Se añade la palabra encontrada a la lista y la actualiza en la tabla
                listaPalabras.addPalabraDesencriptada(palabraDesencriptada);
                tablaPalabras.addPalabra(palabraDesencriptada);
                
                //Se resetea el valor de palabraActual a 0
                globalData.resetNumeroPalabraActualGenerada();
                
                //se aumenta la posicion
                globalData.setPosicionActual(globalData.getPosicionActual() + 1);
                
                //Se hace un guardado automático cada vez que se encuentra una palabra
                GlobalData.guardarDatos(globalData);
                ListaPalabrasEncontradas.guardarDatos(listaPalabras);
            }
        }

    }

}
