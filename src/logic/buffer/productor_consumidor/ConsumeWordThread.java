package logic.buffer.productor_consumidor;

import global.GlobalData;
import java.util.Date;
import logic.buffer.productor_consumidor.functions.CompararPalabras;

public class ConsumeWordThread implements Runnable {

    private BufferProducirYConsumirPalabras buffer; //buffer sobre el que se consumen las palabras
    private CompararPalabras comprobar; //Clase ComprararPalabras que contiene la función que permite comprobar una palabra con la palabra objetivo

    /**
     * Inicia un hilo encargado de consumir palabras del buffer y comprobarlo
     * con la palabra objetivo
     *
     * @param buffer buffer del que se extraen las palabras a analizar
     * @param palabraBase palabra objetivo que se desea encontrar
     */
    public ConsumeWordThread(BufferProducirYConsumirPalabras buffer, String palabraBase) {
        this.buffer = buffer;
        this.comprobar = new CompararPalabras(palabraBase);

    }

    @Override
    public void run() {
        GlobalData datos = GlobalData.getInstance();
        while (!buffer.isFound()) {
            String palabraGenerada = buffer.consumirWord(); //palabra generada que se va a consumir
            boolean encontrada = comprobar.validarPalabra(palabraGenerada); //valida que la palabra sea igual a la palabra base
            //System.out.println("validando: " + palabraGenerada);
            if (encontrada) {
                //si se encuentra la palabra se pone a true
                buffer.setFound(encontrada);
                //Se actualiza la información en la instancia de GlobalData:
                datos.setNumeroPalabraActualGenerada(buffer.getCountActual());
                System.out.println("Se encontró la palabra: " + palabraGenerada + " han sido necesarios: " + datos.getNumeroPalabraActualGenerada());
                
                

                datos.setNumeroPalabrasTotalesGeneradas(datos.getNumeroPalabrasTotalesGeneradas() + datos.getNumeroPalabraActualGenerada());
                //Se establece el momento de la ultima palabra encontrada
                datos.setUltimaPalabraEncontrada(new Date());
                System.out.println(datos.toString());
            }

        }

    }

}
