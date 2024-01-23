package logic.buffer.productor_consumidor;

import global.GlobalData;

public class BufferProducirYConsumirPalabras {

    private String[] buffer; //buffer de palabras
    private GlobalData datosGlobales; //Se obtiene la referencia de GlobalData única
    private int siguiente; //posicion en la que extraer palabra
    private boolean full; //boolean si el buffer está lleno
    private boolean empty; //boolean si el buffer está vacio

    private boolean found; //bolean si se ha encontrado la palabra
    private long countActual; //numero long con el contador de palabras generadas para la palabra actual
    /**
     * Inicializa un objeto "BufferProducirYConsumirPalabras" controlador que
     * gestiona la generacion y consumo de palabras dentro de un buffer
     *
     * @param size tamaño del buffer
     */
    public BufferProducirYConsumirPalabras(int size) {
        this.datosGlobales = GlobalData.getInstance();
        this.buffer = new String[size];
        this.siguiente = 0;
        this.empty = true;
        this.full = false;
        this.found = false;
        //variable local que almacena el contador actual de palabras y una vez encontrada se pasará a GlobalData
        this.countActual = 0;
    }

    /**
     * función que recibe "palabras" aleatorias y las introduce en el buffer
     *
     * @param word que se va a introducir en el buffer
     */
    public synchronized void producirWord(String word) {
        //mientras este lleno el buffer nos esperamos
        while (this.full) {
            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.println("Error interrupcion del sistema " + ex);
            }
        }
        buffer[siguiente] = word;
        siguiente++;
        this.empty = false;
        if (siguiente == this.buffer.length) {
            this.full = true;
        }

        notifyAll();
    }

    /**
     * Consume "palabras" del buffer
     *
     * @return palabraConsumida·del buffer que se va ha consumir
     */
    public synchronized String consumirWord() {
        //mientras este vacio el buffer nos esperamos
        while (this.empty) {
            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.println("Error interrupcion del sistema " + ex);
            }
        }
        siguiente--;
        countActual++;
        String palabraConsumida = this.buffer[siguiente];
        
        this.full = false;
        if (siguiente == 0) {
            this.empty = true;
        }
        notifyAll();
        
        return palabraConsumida;
    }

    //Getter y setters
    public boolean isFound() {
        return found;
    }

    public void setFound(boolean found) {
        this.found = found;
    }

    public long getCountActual() {
        return countActual;
    }

    public void setCountActual(long countActual) {
        this.countActual = countActual;
    }


}
