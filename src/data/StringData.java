package data;

public class StringData {

    private String[] arrayCadena; //Cadena de texto en un array de datos
    private int totalPalabrasBuscar; //total de palabras a buscar

    public StringData(String cadena) {
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
