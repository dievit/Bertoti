package composite.antipattern.main;

import composite.antipattern.main.java.com.model.Bateria;
import composite.antipattern.main.java.com.model.Drone;
import composite.antipattern.main.java.com.model.Motor;
import composite.antipattern.main.java.com.model.Sensor;

public class Principal {
    public static void main(String[] args) {

        Motor motor = new Motor("Motor Principal", 0.8, 150.0);
        Sensor sensor = new Sensor("Sensor de Proximidade", 0.2, 80.0);
        Bateria bateria = new Bateria("Bateria LiPo", 0.5, 120.0);

        Drone drone = new Drone("DJI Mavic", motor, sensor, bateria);
        drone.exibirResumo();
    }
}