package logic.generate;

public class BufferGenerateAndCheckWords {

    private String[] buffer;
    private int siguiente;
    private boolean full;
    private boolean empty;

    private boolean found;
    private long count;

    public BufferGenerateAndCheckWords(int size) {
        this.buffer = new String[size];
        this.siguiente = 0;
        this.empty = true;
        this.full = false;
        this.found = false;
        this.count = 0;
    }

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
        count++;
        this.empty = false;
        if (siguiente == this.buffer.length) {
            this.full = true;
        }

        notifyAll();
    }

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
            this.full = false;
            if (siguiente == 0) {
                this.empty = true;
            }
        notifyAll();
        return this.buffer[this.siguiente];
    }

    public boolean isFound() {
        return found;
    }

    public void setFound(boolean found) {
        this.found = found;
    }
    
    public long getCount(){
    return this.count;
    }

}
