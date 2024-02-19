package controller.hooks;

import controller.MainController;
import model.global.GlobalData;
import view.MainInterface;

public class ButtonsFunctions {

    private MainController controller;
    private GlobalData globalData;
    private MainInterface vista;

    public ButtonsFunctions() {
        vista = MainController.getInstance().getVista();
        globalData = GlobalData.getInstance();

    }

    public void handleButtonEnabled() {
        //Si es true: start disabled y pause enabled
        if (globalData.isWorking()) {
            vista.start_btn.setEnabled(false);
            vista.pause_btn.setEnabled(true);
        } else {
            vista.start_btn.setEnabled(true);
            vista.pause_btn.setEnabled(false);
        }

    }

}
