package logic.buffer.productor_consumidor;

import logic.buffer.productor_consumidor.functions.CompararPalabras;

public class ConsumeWordThread implements Runnable {

    private BufferProducirYConsumirPalabras buffer; //buffer sobre el que se consumen las palabras
    private CompararPalabras comprobar; //Clase ComprararPalabras que contiene la función que permite comprobar una palabra con la palabra objetivo

    /**
     * Inicia un hilo encargado de consumir palabras del buffer y comprobarlo con la palabra objetivo
     * @param buffer buffer del que se extraen las palabras a analizar
     * @param palabraBase palabra objetivo que se desea encontrar
     */
    public ConsumeWordThread(BufferProducirYConsumirPalabras buffer, String palabraBase) {
        this.buffer = buffer;
        this.comprobar = new CompararPalabras(palabraBase);

    }

    @Override
    public void run() {
        while (!buffer.isFound()) {
            String palabraGenerada = buffer.consumirWord(); //palabra generada que se va a consumir
            boolean encontrada = comprobar.validarPalabra(palabraGenerada); //valida que la palabra sea igual a la palabra base
            //System.out.println("validando: " + palabraGenerada);
            if(encontrada){
            //si se encuentra la palabra se pone a true
            buffer.setFound(encontrada);
                System.out.println("Se encontró la palabra: " + palabraGenerada + " han sido necesarios: " +  buffer.getCountActual());
                //Se le suma el numero de palabras que costó encontrar, al total
                long total = buffer.getCountTotal();
                long actual = buffer.getCountActual();
                buffer.setCountTotal(total + actual);
                //Se establece el momento de la ultima palabra encontrada
                
            }
            
        }
        
    }

}
