package observer.antipattern.main.java.com.model;

public class Drone {
    private String id;
    private String modelo;
    private int bateria;

    public Drone(String id, String modelo, int bateria) {
        this.id = id;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;

        if (this.bateria <15) {
            alertarPiloto();
            registrarLogBase();
            abrirChamadoManutencao();
        }
    }

    private void alertarPiloto() {
        System.out.println("[ALERTA PILOTO] Drone " + id + " está baixa (" + bateria + "%).");
    }

    private void registrarLogBase() {
        System.out.println("[LOG BASE] Drone " + id + " está baixa (" + bateria + "%).");
    }

    private void abrirChamadoManutencao() {
        System.out.println("[CHAMADO MANUTENÇÃO] Drone " + id + " precisa de manutenção urgente.");
    }

    public String getModelo() {
        return modelo;
    }

    public int getBateria() {
        return bateria;
    }

    public String getId() {
        return id;
    }
}