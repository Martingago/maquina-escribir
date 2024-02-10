package data;

public class ManejadorCadenaFichero {

//    private String cadena = "Este es el texto de prueba para poner en el panel y ver que evoluciona favorablemente en caso de que esto no funcione bien tendre que buscar"
//            + " en chatpgt mas informacion sobre como solucionar este problemon";
    
    
    private String[] arrayCadena; //Cadena de texto en un array de datos
    private int totalPalabrasBuscar; //total de palabras a buscar

    
   
    
    /**
     * Constructor de StringData --- CAMBIAR EL NOMBREEEEEE 
     * @param cadena 
     */
    public ManejadorCadenaFichero(String cadena) {
        this.arrayCadena = cadena.split("\\s+");
        this.totalPalabrasBuscar = arrayCadena.length;
    }

    
    
    //getters
    public String[] getArrayCadena() {
        return arrayCadena;
    }

    public int getTotalPalabrasBuscar() {
        return totalPalabrasBuscar;
    }


}
