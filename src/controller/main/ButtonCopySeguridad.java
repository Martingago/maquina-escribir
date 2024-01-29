package controller.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.global.GlobalData;
import model.main.DirectorAlgoritmoBusquedaPalabras;
import view.MainInterface;


public class ButtonCopySeguridad implements ActionListener{

    GlobalData globalData;
    private DirectorAlgoritmoBusquedaPalabras model;
    private MainInterface vista;
    
    
    public ButtonCopySeguridad(MainInterface vista){
        this.vista = vista;
        this.vista.force_copy_data_btn.addActionListener(this);
        this.globalData = GlobalData.getInstance();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("ACTUALIZANDO COPIA SEGURIDAD");
        GlobalData.guardarDatos(globalData);
        //handle.updateCopiaSeguridad();
    }

}
