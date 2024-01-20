package logic.buffer.productor_consumidor.functions;

import java.util.Random;

public class GenerarPalabrasAleatorias {

    private final String CARACTERES_PERMITIDOS = "abcdefghijklmnñopqrstuvwxyz";
    private Random random;

    public GenerarPalabrasAleatorias() {
        this.random = new Random();
    }

    /**
     * Función que genera "palabras" (Combinación de carácteres aleatorios) de
     * un tamaño específico.
     *
     * @param tamaño Tamaño de la "palabra" generada
     * @return String "palabra" generada
     */
    public String generateWord(int tamaño) {
        StringBuilder palabraGenerada = new StringBuilder(tamaño);

        for (int i = 0; i < tamaño; i++) {
            //generar caracter aleatorio:
            int val = random.nextInt(CARACTERES_PERMITIDOS.length());
            palabraGenerada.append(CARACTERES_PERMITIDOS.charAt(val));
        }
        return palabraGenerada.toString();
    }



}
