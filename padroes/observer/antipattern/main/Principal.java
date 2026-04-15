package observer.antipattern.main;

import observer.antipattern.main.java.com.model.Drone;
import observer.antipattern.main.java.com.model.Piloto;

public class Principal {
    public static void main(String[] args) {

        Drone drone1 = new Drone("DR-01", "DJI200", 100);
        Piloto piloto = new Piloto("P-01", "Carlos", drone1);


        drone1.setBateria(50);

        piloto.verificarBateria();
        piloto.decolar();
        piloto.paraFrente();
        piloto.subir();
        piloto.girarHorario();

        piloto.verificarBateria();

        drone1.setBateria(30);
        piloto.verificarBateria();

        drone1.setBateria(10);
        piloto.verificarBateria();

        piloto.pousar();
    }
}