package controller.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.global.GlobalData;
import model.main.DirectorAlgoritmoBusquedaPalabras;
import view.MainInterface;

public class ButtonPause implements ActionListener{
    
    private DirectorAlgoritmoBusquedaPalabras model;
    private MainInterface vista;
    private GlobalData datos;
    
    
    public ButtonPause(DirectorAlgoritmoBusquedaPalabras model, MainInterface vista){
        this.model = model;
        this.vista = vista;
        this.vista.pause_btn.addActionListener(this);
        this.datos = GlobalData.getInstance();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("CLICK EN EL BOTON DE PARAR SISTEMA!");
        datos.setWorking(false);
        
    }
    
    
}
