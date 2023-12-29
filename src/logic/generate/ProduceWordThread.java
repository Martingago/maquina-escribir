package logic.generate;

import logic.functions.GenerateAndValidateWord;

public class ProduceWordThread implements Runnable {

    private BufferGenerateAndCheckWords buffer;
    private GenerateAndValidateWord generate = new GenerateAndValidateWord();
    
    
    public ProduceWordThread(BufferGenerateAndCheckWords buffer){
        this.buffer = buffer;
    }
    
    
    @Override
    public void run() {
        //genera de forma constante palabras aleatorias
        while(!buffer.isFound() && buffer.getCount() <= 100000000){
        String generatedWord = generate.generateWord(7); //genera una palabra de tamaño "x"
        buffer.producirWord(generatedWord);
            //System.out.println("generado:" +  generatedWord);
        }
        System.out.println("Hilo productor terminado!");
        System.out.println(buffer.getCount());
    }
    
}
