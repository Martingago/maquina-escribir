package logic.functions;

import java.util.Random;

public class GenerateAndValidateWord {

    String str = "abcdefghijklmnñopqrstuvwxyz";
    Random r = new Random();

    //String str = "abcdefghijklmnñopqrstuvwxyz1234567890.?¿!\"áéíóúüç,;-()";
    //String str = "martingo";
    String check = "viernes";

    public String generateWord(int tam) {
        StringBuilder word = new StringBuilder(tam);

        for (int i = 0; i < tam; i++) {
            //generar caracter aleatorio:
            int val = r.nextInt(str.length());
            word.append(str.charAt(val));
        }
        return word.toString();
    }

    public boolean validateWord(String wordToValidate) {
        return (wordToValidate.equals(check));
    }

}
