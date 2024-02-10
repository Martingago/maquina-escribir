package controller.main.buttons;

import controller.hooks.ButtonsFunctions;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.global.GlobalData;
import model.main.DirectorAlgoritmoBusquedaPalabras;
import model.outputDatos.ThreadEventosParalelos;
import view.MainInterface;

public class ButtonPause implements ActionListener{
    
    private DirectorAlgoritmoBusquedaPalabras model;
    private MainInterface vista;
    private GlobalData datos;
    private ThreadEventosParalelos evtParalelos;
    private ButtonsFunctions fButton;
    
    
    public ButtonPause(DirectorAlgoritmoBusquedaPalabras model, MainInterface vista){
        this.model = model;
        this.vista = vista;
        this.vista.pause_btn.addActionListener(this);
        this.datos = GlobalData.getInstance();
        this.evtParalelos = ThreadEventosParalelos.getInstance(vista);
        this.fButton = new ButtonsFunctions();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        evtParalelos.stop(); //Detiene el hilo secundario de manejar actualizaciones para el usuario
        datos.setWorking(false); //establece la variable de working a false
        fButton.handleButtonEnabled();
    }
    
    
}
