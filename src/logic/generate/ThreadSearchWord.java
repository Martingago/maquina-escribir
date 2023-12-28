package logic.generate;

import data.StringData;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSearchWord implements Runnable {

    GenerateWord generate = new GenerateWord();
    StringData str = new StringData();
    String texto = str.cadena.toLowerCase();
    //texto separado por espacios
    String[] texto_separado = texto.split(" ");
    private static  AtomicInteger posicion = new AtomicInteger(0);
    private static AtomicInteger count = new AtomicInteger(0);
 
    
   
    private int hilo;

    public ThreadSearchWord(int hilo) {
        
        this.hilo = hilo;
    }

    @Override
    public void run() {
        while (true) {

            int currentPos = posicion.get();
             if(currentPos >= texto_separado.length){
             break;
             }
            
            String palabra = generate.generateWord(texto_separado[currentPos].length());
            System.out.println(palabra + " | hilo: " + hilo);
            if (texto_separado[currentPos].equals(palabra)) {
                System.out.println("\n\n\nPalabra encontrada: " + palabra);
                    posicion.incrementAndGet();
            }else{
                count.incrementAndGet();
            }
        }
        System.out.println("Fin del hilo");
        System.out.println("Total de palabras: " + count);
    }
}
