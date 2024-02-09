package model.global;

import java.io.Serializable;
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



}
