package model.logic.buffer.productor_consumidor;

import java.util.ArrayList;
import java.util.List;
import controller.observer.SalidaPalabrasTextObserver;

public class MostrarPalabrasAleatoriasThread implements Runnable {

    private BufferProducirYConsumirPalabras buffer;
    private int palabrasSegundo;
    private List<SalidaPalabrasTextObserver> observers = new ArrayList<>();

    public MostrarPalabrasAleatoriasThread(BufferProducirYConsumirPalabras buffer, int palabrasSegundo) {
        this.buffer = buffer;
        this.palabrasSegundo = palabrasSegundo;
    }

    @Override
    public void run() {
        while(true){
        }

    }

    public void addObserver(SalidaPalabrasTextObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers(String texto) {
        for (SalidaPalabrasTextObserver observer : observers) {
            observer.appendPalabra(texto);
        }
    }

}
