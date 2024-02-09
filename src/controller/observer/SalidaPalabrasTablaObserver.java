package controller.observer;

import model.global.DesencriptedWord;

public interface SalidaPalabrasTablaObserver {

    public void addPalabra(DesencriptedWord palabra);
    
    public void cargarPalabrasEncontradas();
}
