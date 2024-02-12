package model.logic.buffer;

import controller.main.texts.TextoSalidaConsola;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import model.logic.buffer.productor_consumidor.BufferProducirYConsumirPalabras;
import model.logic.buffer.productor_consumidor.ConsumeWordThread;
import model.logic.buffer.productor_consumidor.MostrarPalabrasAleatoriasThread;
import model.logic.buffer.productor_consumidor.ProduceWordThread;

public class ControladorBufferBusquedaPalabras {

    private String palabraBuscar; // Palabra objetivo, que se debe buscar.
    private int tamañoPalabraBuscar; //tamaño de la palabra que se debe generar
    private List<Thread> listHilos;
    private ProduceWordThread productor;
    private ConsumeWordThread consumidor;

    // Constructor del ControladorBufferBusquedaPalabras
    // Recibe una palabra que se deberá buscar
    public ControladorBufferBusquedaPalabras(String palabraBuscar) {
        this.palabraBuscar = palabraBuscar;
        this.tamañoPalabraBuscar = palabraBuscar.length();
    }

    /**
     * Inicia un buffer y crea los hilos (productor y consumidor) que generarán
     * y consumirán palabras.
     *
     * hiloProductor: Encargado de generar "palabras" aleatorias del mismo
     * tamaño que la palabra que se quiere buscar. hiloConsumidor: Recibe la
     * palabra a buscar y la compara con una "palabra" extraida del buffer.
     * Dicho buffer estará generando y consumiendo palabras hasta que se
     * encuentre la palabra objetivo.
     */
    public void iniciarBusquedaProcesoPalabra() {
        // Se crea un buffer que mediante un modelo productor/consumidor genera palabras y las consume.
        BufferProducirYConsumirPalabras buffer = new BufferProducirYConsumirPalabras(2000); // Tamaño del buffer

        // Se declaran los hilos del productor y del consumidor.
        // Se crean "x" número de hilos tanto para consumir como para producir palabras.
        listHilos = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            productor = new ProduceWordThread(buffer, tamañoPalabraBuscar); // Produce palabras de un tamaño específico.
            consumidor = new ConsumeWordThread(buffer, palabraBuscar); // Consume y compara el caracter generado con "palabraBuscar".
            Thread hiloProductor = new Thread(productor);
            Thread hiloConsumidor = new Thread(consumidor);
            hiloProductor.start();
            hiloConsumidor.start();
            listHilos.add(hiloProductor);
            listHilos.add(hiloConsumidor);
        }

        for (Thread hilo : listHilos) {
            try {
                hilo.join();
            } catch (InterruptedException ex) {
                TextoSalidaConsola.getInstance().escribirTextoConsola("Interrupción de datos del sistema: " + ex, Color.RED);
                System.out.println("Interrupcion de datos del sistema");
            }
        }
        //Iniciar un hilo encargado de mostrar por pantalla palabras que se van generando
        MostrarPalabrasAleatoriasThread mostrarPalabras = new MostrarPalabrasAleatoriasThread(buffer,10);
        Thread hiloPalabras = new Thread(mostrarPalabras);
        //hiloPalabras.start();
    }

}
