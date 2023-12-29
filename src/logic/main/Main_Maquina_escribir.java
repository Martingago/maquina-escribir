package logic.main;

import logic.generate.BufferGenerateAndCheckWords;
import logic.generate.ConsumeWordThread;
import logic.generate.ProduceWordThread;

public class Main_Maquina_escribir {

    public static void main(String[] args) {
//        int hilos = 1;
//        for (int i = 1; i <= hilos; i++) {
//            Thread thread = new Thread(new ThreadSearchWord(i));
//            thread.start();
//        }

        BufferGenerateAndCheckWords buffer = new BufferGenerateAndCheckWords(10000);
        ProduceWordThread productor = new ProduceWordThread(buffer);
        ConsumeWordThread consumidor = new ConsumeWordThread(buffer);

        for (int i = 0; i < 3; i++) {
            Thread hiloProductor = new Thread(productor);
            Thread hiloConsumidor = new Thread(consumidor);
            hiloProductor.start();
            hiloConsumidor.start();
        }

    }
}
