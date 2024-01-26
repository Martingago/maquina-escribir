package model.global;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

public class GlobalData{

    private static GlobalData instance = null;
    //Inicialización de datos globales que darán funcionalidad a toda la aplicación:
    //Se obtienen a partir de un documento CSV, en el cual se harán copias de seguridad.
    //Si el documento no existe, se tomarán los valores por defecto (inicio).

    private AtomicLong numeroPalabrasTotalesGeneradas; //numero que representa el TOTAL de palabras que se han generado durante la ejecución de código.
    private AtomicLong secsTotalActive; //segundos totales que lleva funcionando el programa.
    private int posicionActual; //posicion de la palabra en la que nos encontramos.
    private long numeroPalabraActualGenerada; //numero de palabras generadas en la palabra actual
    private Date ultimaPalabraEncontrada; //fecha de la ultima palabra encontrada
    private Date fechaInicio; //fecha en la que se inició el programa por primera vez

    private GlobalData() {
        this.numeroPalabrasTotalesGeneradas = new AtomicLong(0);
        this.secsTotalActive = new AtomicLong(0);
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
    public long incrementPalabrasTotalesGeneradas(){
        return numeroPalabrasTotalesGeneradas.incrementAndGet();
    }
    
    public long getPalabrasTotalesGeneradas(){
        return numeroPalabrasTotalesGeneradas.get();
    }
    
      public long incrementSecsTotalActive(){
        return secsTotalActive.incrementAndGet();
    }
    
    public long getSecsTotalActive(){
        return secsTotalActive.get();
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
