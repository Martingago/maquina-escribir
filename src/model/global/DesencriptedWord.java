package model.global;

import java.util.Date;

public class DesencriptedWord {
    
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
        sb.append("DesencriptedWord{");
        sb.append("posicionPalabra=").append(posicionPalabra);
        sb.append(", palabraEncontrada=").append(palabraEncontrada);
        sb.append(", intentosPalabra=").append(intentosPalabra);
        sb.append(", fechaEncontrada=").append(fechaEncontrada);
        sb.append('}');
        return sb.toString();
    }

}
