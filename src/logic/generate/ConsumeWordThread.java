package logic.generate;


import logic.functions.GenerateAndValidateWord;

public class ConsumeWordThread implements Runnable {

    private BufferGenerateAndCheckWords buffer;
    private GenerateAndValidateWord generate = new GenerateAndValidateWord();

    public ConsumeWordThread(BufferGenerateAndCheckWords buffer) {
        this.buffer = buffer;

    }

    @Override
    public void run() {
        while (!buffer.isFound() && buffer.getCount() <= 100000000) {
            String lookWord = buffer.consumirWord(); //palabra que se debe comprobar
            boolean encontrada = generate.validateWord(lookWord);
            //System.out.println("validando: " + lookWord);
            if(encontrada){
            buffer.setFound(encontrada);
                System.out.println("Se encontró la palabra: " + lookWord);
            }
            //si se encuentra la palabra se pone a true
        }
        System.out.println("Hilo consumidor terminado!");
    }

}
