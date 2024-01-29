package controller.main;

import data.HandleFicheroCopia;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.main.DirectorAlgoritmoBusquedaPalabras;
import view.MainInterface;


public class ButtonCopySeguridad implements ActionListener{

    HandleFicheroCopia handle;
    private DirectorAlgoritmoBusquedaPalabras model;
    private MainInterface vista;
    
    
    public ButtonCopySeguridad(MainInterface vista){
        this.vista = vista;
        this.handle = new HandleFicheroCopia();
        this.vista.force_copy_data_btn.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("ACTUALIZANDO COPIA SEGURIDAD");
        //handle.updateCopiaSeguridad();
    }

}
