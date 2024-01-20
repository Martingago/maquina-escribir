package global;

public class GlobalData {
    //Inicialización de datos globales que darán funcionalidad a toda la aplicación:
    //Se obtienen a partir de un documento CSV, en el cual se harán copias de seguridad.
    //Si el documento no existe, se tomarán los valores por defecto (inicio).
    
    private long numeroPalabrasTotalesGeneradas; //numero que representa el TOTAL de palabras que se han generado durante la ejecución de código.
    private int posicionActual; //posicion de la palabra en la que nos encontramos.
    private long numeroPalabraActualGenerada; //numero de palabras generadas en la palabra actual
    private String palabraObjetivo; //palabra actual que queremos descubrir/objetivo.
    
    
    
}
