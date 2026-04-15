package observer.pattern.main.java.com.model;

import java.util.ArrayList;
import java.util.List;

public class Drone {
    private String id;
    private String modelo;
    private int bateria;
    private List<Observador> observadores = new ArrayList<>();

    public Drone(String id, String modelo, int bateria) {
        this.id = id;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
        if (this.bateria < 15) {
            notificarTodos("Drone " + id + " com bateria crítica: " + bateria + "%");
        }
    }

    private void notificarTodos(String mensagem) {
        for (Observador obs : observadores) {
            obs.notificar(mensagem);
        }
    }

    public int getBateria() { return bateria; }
    public String getId() { return id; }
    public String getModelo() { return modelo; }
}