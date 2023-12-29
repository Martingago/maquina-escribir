package logic.test;

import data.StringData;
import java.util.concurrent.atomic.AtomicInteger;
import logic.functions.GenerateAndValidateWord;

public class ThreadSearchWord implements Runnable {

    GenerateAndValidateWord generate = new GenerateAndValidateWord();
    StringData str = new StringData();
    String texto = str.cadena.toLowerCase();
    //texto separado por espacios
    String[] texto_separado = texto.split(" ");
    private static  AtomicInteger posicion = new AtomicInteger(0); //posicion de palabras en la que nos encontramos
    private static AtomicInteger count = new AtomicInteger(0); // numero total de palabras generadas
 
    
   
    private int hilo;

    public ThreadSearchWord(int hilo) {
        
        this.hilo = hilo;
    }

    @Override
    public void run() {
        while (count.get() < 1000000) {
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
