package logic.buffer.productor_consumidor;

import logic.buffer.productor_consumidor.functions.GenerarPalabrasAleatorias;

public class ProduceWordThread implements Runnable {

    private BufferProducirYConsumirPalabras buffer; //buffer sobre el que se crean palabras
    private GenerarPalabrasAleatorias generate = new GenerarPalabrasAleatorias(); //clase GenerarPalabras que contiene el método que me permite generar palabras de un tamaño específico.
    private int tamañoPalabraBuscar; //tamaño de la palabra a buscar
    
    /**
     * Constructor del hilo que se encarga de producir palabras de un determinado tamaño y depositarlas en el buffer
     * @param buffer buffer en el que se colocan las palabras generadas.
     * @param tamañoPalabra tamaño de las palabras que se están generando.
     */
    public ProduceWordThread(BufferProducirYConsumirPalabras buffer, int tamañoPalabra){
        this.buffer = buffer;
        this.tamañoPalabraBuscar = tamañoPalabra;
    }
    
    @Override
    public void run() {
        //genera de forma constante palabras aleatorias mientras no se haya encontrado la palabra específica
        while(!buffer.isFound()){
        String generatedWord = generate.generateWord(tamañoPalabraBuscar); //genera una palabra de tamaño "x"
        buffer.producirWord(generatedWord);
        }
    }
    
}
