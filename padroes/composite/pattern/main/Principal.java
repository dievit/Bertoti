package composite.pattern.main;

import composite.pattern.main.java.com.model.*;

public class Principal {
    public static void main(String[] args) {

        // Criando componentes individuais
        Motor motor = new Motor("Motor Principal", 0.8, 150.0);
        Sensor sensor = new Sensor("Sensor de Proximidade", 0.2, 80.0);
        Bateria bateria = new Bateria("Bateria LiPo", 0.5, 120.0);
        Gps gps = new Gps("GPS", 0.1, 100.0);
        ActionCam actionCamera = new ActionCam("Action Camera", 0.3, 200.0);

        // Montando o drone com os componentes
        Drone drone = new Drone("DJI Mavic");
        drone.adicionar(motor);
        drone.adicionar(sensor);
        drone.adicionar(bateria);
        drone.adicionar(gps);
        drone.adicionar(actionCamera);

        drone.exibir("");

        // Poder do Composite: adicionar novo componente sem modificar o Drone
        System.out.println("\n-- Adicionando câmera ao drone --\n");
        Sensor camera = new Sensor("Câmera 4K", 0.3, 200.0);
        drone.adicionar(camera);

        drone.exibir("");
    }
}