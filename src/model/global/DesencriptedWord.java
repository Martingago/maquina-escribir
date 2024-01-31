package model.global;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DesencriptedWord implements Serializable {
    
    private int posicionPalabra;
    private String palabraEncontrada;
    private long intentosPalabra;
    private Date fechaEncontrada;
    

    public DesencriptedWord(int posicionPalabra, String palabraEncontrada, long intentosPalabra, Date fechaEncontrada) {
        this.posicionPalabra = posicionPalabra;
        this.palabraEncontrada = palabraEncontrada;
        this.intentosPalabra = intentosPalabra;
        this.fechaEncontrada = fechaEncontrada;
        
    }

    public int getPosicionPalabra() {
        return posicionPalabra;
    }

    public void setPosicionPalabra(int posicionPalabra) {
        this.posicionPalabra = posicionPalabra;
    }

    public long getIntentosPalabra() {
        return intentosPalabra;
    }

    public void setIntentosPalabra(long intentosPalabra) {
        this.intentosPalabra = intentosPalabra;
    }

    public Date getFechaEncontrada() {
        return fechaEncontrada;
    }

    public void setFechaEncontrada(Date fechaEncontrada) {
        this.fechaEncontrada = fechaEncontrada;
    }

    public String getPalabraEncontrada() {
        return palabraEncontrada;
    }

    public void setPalabraEncontrada(String palabraEncontrada) {
        this.palabraEncontrada = palabraEncontrada;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(posicionPalabra);
        sb.append("] Generada: \"").append(palabraEncontrada);
        sb.append("\" a las: ").append(formatoFecha(fechaEncontrada));
        sb.append(". Necesarios").append(intentosPalabra);
        sb.append(" intentos");
        return sb.toString();
    }
    
    
    public String formatoFecha(Date fecha){
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    return formato.format(fecha);
}

}
