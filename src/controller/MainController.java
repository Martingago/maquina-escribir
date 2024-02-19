package controller;

import controller.main.buttons.ButtonCopySeguridad;
import controller.main.buttons.ButtonPause;
import controller.main.buttons.ButtonStart;
import controller.main.TablaPalabras;
import controller.main.texts.TextoEvolucionPalabras;
import controller.main.texts.TextoSalidaConsola;
import controller.main.texts.TextoSalidaPalabras;
import controller.main.texts.UltimaPalabraEncontrada;
import javax.swing.ImageIcon;
import model.main.DirectorAlgoritmoBusquedaPalabras;
import model.outputDatos.ThreadEventosParalelos;
import view.MainInterface;

public class MainController {

    private static MainController instance = null;
    private DirectorAlgoritmoBusquedaPalabras model;
    private MainInterface vista;
    //botones
    private ButtonStart startButton; //botón que inicia el programa
    private ButtonPause pauseButton; //botón que pausa el programa
    private ButtonCopySeguridad copySeguridadButton; //boton que hace una copia de seguridad del programa

    //Tabla de palabras
    private TablaPalabras tablaPalabras;

    private TextoSalidaConsola textoSalidaConsola;
    private TextoSalidaPalabras outputTextPalabras; //panel de texto sobre el que salen las palarbas generadas
    private TextoEvolucionPalabras textoEvolucionPalabras;
    private UltimaPalabraEncontrada textUltimaPalabra;
    //Instancia singleton del hilo de ejecución de eventos paralelos:
    private ThreadEventosParalelos evtParalelos;

    private MainController() {
        // Constructor privado sin parámetros
    }

    /**
     * Obtiene una instancia de MainController. Es necesario invocar antes a la
     * funcion setModelAndView en algun punto del codigo para poder establecer
     * valores dentro del controlador
     *
     * @return
     */
    public static synchronized MainController getInstance() {
        if (instance == null) {
            instance = new MainController();
        }
        return instance;
    }

   
    public void setView(MainInterface vista) {
        //Tabla palabras
        this.tablaPalabras = TablaPalabras.getInstance(vista);
        //texto salida
        this.outputTextPalabras = TextoSalidaPalabras.getInstance(vista);
        this.textoEvolucionPalabras = TextoEvolucionPalabras.getInstance(vista);
        this.textoSalidaConsola = TextoSalidaConsola.getInstance(vista);
        this.textUltimaPalabra = UltimaPalabraEncontrada.getInstance(vista);
    }
    
     /**
     * Actualiza la informacion del controlleador con un modelo y una vista
     *
     * @param model
     * @param vista
     */
    public void setModelAndView(DirectorAlgoritmoBusquedaPalabras model, MainInterface vista) {
        this.model = model;
        this.vista = vista;
        //hilo paralelo de eventos secundarios
        evtParalelos = ThreadEventosParalelos.getInstance(vista); //se crea la instancia principal para los eventos paralelos
        //botones
        this.startButton = new ButtonStart(model, vista);
        this.pauseButton = new ButtonPause(model, vista);
        this.copySeguridadButton = new ButtonCopySeguridad(vista);

    }

    public void iniciar() {
        ImageIcon icon = new ImageIcon("src/img/paradoja-monos-infinitos-reescalado.png");
        vista.setIconImage(icon.getImage());
        vista.setTitle("Paradoja de los Monos y la máquina de escribir");
        model.getData().setWorking(false); //Por defecto setWorking es siempre false y el usuario es quien debe iniciarlo
        
    }

    public MainInterface getVista() {
        return vista;
    }

    public DirectorAlgoritmoBusquedaPalabras getModel() {
        return model;
    }

}
