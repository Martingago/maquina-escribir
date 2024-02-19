package model.global;

import controller.main.texts.TextoSalidaConsola;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

public class GlobalData implements Serializable {

    private static GlobalData instance = null;
    //Inicialización de datos globales que darán funcionalidad a toda la aplicación:
    //Se obtienen a partir de un documento CSV, en el cual se harán copias de seguridad.
    //Si el documento no existe, se tomarán los valores por defecto (inicio).

    private AtomicLong numeroPalabrasTotalesGeneradas; //numero que representa el TOTAL de palabras que se han generado durante la ejecución de código.
    private AtomicLong numeroPalabraActualGenerada; //numero de palabras generadas en la palabra actual
    private AtomicLong secsTotalActive; //segundos totales que lleva funcionando el programa.

    private int posicionActual; //posicion de la palabra en la que nos encontramos.
    private boolean working;
    //private int tamPalabra;
    private Date ultimaPalabraEncontrada; //fecha de la ultima palabra encontrada
    private Date fechaInicio; //fecha en la que se inició el programa por primera vez

    private GlobalData() {
        this.numeroPalabrasTotalesGeneradas = new AtomicLong(0);
        this.secsTotalActive = new AtomicLong(0);
        this.posicionActual = 0;
        this.working = false;
        this.numeroPalabraActualGenerada = new AtomicLong(0);
        this.ultimaPalabraEncontrada = new Date(); //se establece fecha actual
        this.fechaInicio = new Date(); //se establece fecha actual
    }

    //Crear una instancia de global data
    public static GlobalData getInstance() {
        if (instance == null) {
            instance = loadData();
        }
        return instance;
    }

    /**
     * Función que comprueba si existe un fichero para guardar datos.
     *   ==> Si el fichero existe se obtiene la información del mismo y se cargan sus datos en un objeto GlobalData que se devolverá.
     *   ==> Si el fichero NO existe, se creará dicho fichero, y se le escribirá una instancia de GlobalData default.
     * @return objeto GlobalData
     */
    private static GlobalData loadData() {
        File file = new File("copia_datos.ser");
        if (file.exists()) {
            //Si el fichero existe se cargan los datos desde el fichero
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                return (GlobalData) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                TextoSalidaConsola.getInstance().escribirTextoConsola("Error al cargar los datos: "+ e, Color.RED);
                throw new RuntimeException("Error al cargar los datos", e);
            }
        } else {
            GlobalData globalData = new GlobalData();
            // inicializar con la información por defecto
            //guardarDatos(globalData);
            return globalData;
        }

    }

    /**
     * Sobreescribe los datos de GlobalData en el fichero
     * @param globalData 
     */
    public static void guardarDatos(GlobalData globalData) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("copia_datos.ser"))) {
            oos.writeObject(globalData);
             System.out.println("ACTUALIZANDO COPIA SEGURIDAD");
        TextoSalidaConsola.getInstance().escribirTextoConsola("ACTUALIZANDO COPIA SEGURIDAD", Color.PINK);
        } catch (IOException e) {
            TextoSalidaConsola.getInstance().escribirTextoConsola("Error al guardar los datos: " + e, Color.RED);
            throw new RuntimeException("Error al guardar los datos", e);
        }
    }

    //getters y setters
    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    public long incrementPalabrasTotalesGeneradas() {
        return numeroPalabrasTotalesGeneradas.incrementAndGet();
    }

    public long getPalabrasTotalesGeneradas() {
        return numeroPalabrasTotalesGeneradas.get();
    }

    public long incrementSecsTotalActive() {
        return secsTotalActive.incrementAndGet();
    }

    public long getSecsTotalActive() {
        return secsTotalActive.get();
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public long incrementPalabrasActualesGeneradas() {
        return numeroPalabraActualGenerada.incrementAndGet();
    }

    public void resetNumeroPalabraActualGenerada(){
        this.numeroPalabraActualGenerada = new  AtomicLong(0);
    }
    
    public long getNumeroPalabraActualGenerada() {
        return numeroPalabraActualGenerada.get();
    }

    public void setNumeroPalabraActualGenerada(AtomicLong numeroPalabraActualGenerada) {
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
        sb.append(", numeroPalabraActualGenerada=").append(numeroPalabraActualGenerada);
        sb.append(", secsTotalActive=").append(secsTotalActive);
        sb.append(", posicionActual=").append(posicionActual);
        sb.append(", ultimaPalabraEncontrada=").append(ultimaPalabraEncontrada);
        sb.append(", fechaInicio=").append(fechaInicio);
        sb.append('}');
        return sb.toString();
    }



}
