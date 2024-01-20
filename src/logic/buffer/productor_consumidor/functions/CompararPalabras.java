package logic.buffer.productor_consumidor.functions;

public class CompararPalabras {

    private String palabraBase;

    
    public CompararPalabras(String palabraBase){
        this.palabraBase = palabraBase;
    }
    
    /**
     * Funcion que valida una palabra generada con la palabra base
     * @param palabraGenerada
     * @return 
     */
    public boolean validarPalabra(String palabraGenerada) {
        return (palabraBase.equals(palabraGenerada));
    }
    
}
