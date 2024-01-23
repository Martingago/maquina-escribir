package global;

import java.util.Date;

public class GlobalData{

    private static GlobalData instance = null;
    //Inicialización de datos globales que darán funcionalidad a toda la aplicación:
    //Se obtienen a partir de un documento CSV, en el cual se harán copias de seguridad.
    //Si el documento no existe, se tomarán los valores por defecto (inicio).

    private long numeroPalabrasTotalesGeneradas; //numero que representa el TOTAL de palabras que se han generado durante la ejecución de código.
    private int posicionActual; //posicion de la palabra en la que nos encontramos.
    private long numeroPalabraActualGenerada; //numero de palabras generadas en la palabra actual
    private Date ultimaPalabraEncontrada; //fecha de la ultima palabra encontrada
    private Date fechaInicio; //fecha en la que se inició el programa por primera vez

    private GlobalData() {
        this.numeroPalabrasTotalesGeneradas = 0;
        this.posicionActual = 0;
        this.numeroPalabraActualGenerada = 0;
        this.ultimaPalabraEncontrada = new Date(); //se establece fecha actual
        this.fechaInicio = new Date(); //se establece fecha actual
    }

    //Crear una instancia de global data
    public static GlobalData getInstance() {
        if (instance == null) {
            instance = new GlobalData();
        }
        return instance;
    }
    
    //getters y setters

    public long getNumeroPalabrasTotalesGeneradas() {
        return numeroPalabrasTotalesGeneradas;
    }

    public void setNumeroPalabrasTotalesGeneradas(long numeroPalabrasTotalesGeneradas) {
        this.numeroPalabrasTotalesGeneradas = numeroPalabrasTotalesGeneradas;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public long getNumeroPalabraActualGenerada() {
        return numeroPalabraActualGenerada;
    }

    public void setNumeroPalabraActualGenerada(long numeroPalabraActualGenerada) {
        this.numeroPalabraActualGenerada = numeroPalabraActualGenerada;
    }

    public Date getUltimaPalabraEncontrada() {
        return ultimaPalabraEncontrada;
    }

    public void setUltimaPalabraEncontrada(Date ultimaPalabraEncontrada) {
        this.ultimaPalabraEncontrada = ultimaPalabraEncontrada;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GlobalData{");
        sb.append("numeroPalabrasTotalesGeneradas=").append(numeroPalabrasTotalesGeneradas);
        sb.append(", posicionActual=").append(posicionActual);
        sb.append(", numeroPalabraActualGenerada=").append(numeroPalabraActualGenerada);
        sb.append(", ultimaPalabraEncontrada=").append(ultimaPalabraEncontrada);
        sb.append(", fechaInicio=").append(fechaInicio);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
    
    
}
