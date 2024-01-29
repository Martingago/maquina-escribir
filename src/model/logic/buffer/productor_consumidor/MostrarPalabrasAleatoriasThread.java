package model.logic.buffer.productor_consumidor;

import controller.observer.SalidaPalabrasObserver;
import java.util.ArrayList;
import java.util.List;

public class MostrarPalabrasAleatoriasThread implements Runnable {

    private BufferProducirYConsumirPalabras buffer;
    private int palabrasSegundo;
    private List<SalidaPalabrasObserver> observers = new ArrayList<>();

    public MostrarPalabrasAleatoriasThread(BufferProducirYConsumirPalabras buffer, int palabrasSegundo) {
        this.buffer = buffer;
        this.palabrasSegundo = palabrasSegundo;
    }

    @Override
    public void run() {
        while(true){
        }

    }

    public void addObserver(SalidaPalabrasObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers(String texto) {
        for (SalidaPalabrasObserver observer : observers) {
            observer.appendPalabra(texto);
        }
    }

}
