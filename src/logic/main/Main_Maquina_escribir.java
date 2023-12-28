package logic.main;

import logic.generate.ThreadSearchWord;

public class Main_Maquina_escribir {
    public static void main(String[] args) {
        
        int hilos = 4;
        
        for (int i = 1; i <= hilos; i++) {
            Thread thread = new Thread(new ThreadSearchWord(i));
            thread.start();
        }
    }
}