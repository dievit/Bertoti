package observer.pattern.main;

import observer.pattern.main.java.com.model.*;

public class Principal {
    public static void main(String[] args) {

        Drone drone1 = new Drone("DR-01", "DJI200", 100);

        drone1.adicionarObservador(new AlertaPiloto("Carlos"));
        drone1.adicionarObservador(new LogBase());
        drone1.adicionarObservador(new SistemaChamado());

        Piloto piloto = new Piloto("P-01", "Carlos", drone1);

        piloto.verificarBateria();
        piloto.decolar();
        piloto.paraFrente();
        piloto.subir();
        piloto.girarHorario();

        drone1.setBateria(50);
        piloto.verificarBateria();

        drone1.setBateria(30);
        piloto.verificarBateria();

        drone1.setBateria(10);
        piloto.verificarBateria();

        piloto.pousar();
    }
}