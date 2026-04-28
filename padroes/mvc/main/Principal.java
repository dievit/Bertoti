package mvc.main;

import mvc.main.java.com.model.DroneModel;
import mvc.main.java.com.view.DroneView;
import mvc.main.java.com.controller.AcaoController;


public class Principal {
    public static void main(String[] args) {
        DroneModel model = new DroneModel("DJI Mavic");
        DroneView view = new DroneView(model);
    }
}