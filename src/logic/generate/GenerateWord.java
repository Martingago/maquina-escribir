package logic.generate;

import java.util.Random;

public class GenerateWord {

    public String generateWord(int tam) {
        String word = "";
        //String str = "abcdefghijklmnñopqrstuvwxyz1234567890.?¿!\"áéíóúüç,;-()";
        //String str = "martingo";
        String str = "abcdefghijklmnñopqrstuvwxyz";
        Random r = new Random();
        for(int i =0; i< tam; i++){
            //generar caracter aleatorio:
            int val = r.nextInt(str.length());
            word += str.charAt(val);
        }
        return word;
    }

}
