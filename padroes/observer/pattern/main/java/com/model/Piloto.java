package observer.pattern.main.java.com.model;

public class Piloto {
    private String id;
    private String nome;
    private Drone drone;

    public Piloto(String id, String nome, Drone drone) {
        this.id = id;
        this.nome = nome;
        this.drone = drone;
    }

    public void decolar() {
        System.out.println("[PILOTO " + nome + "] decolando com o drone " + drone.getModelo() + ".");
    }

    public void pousar() {
        System.out.println("[PILOTO " + nome + "] pousando com o drone " + drone.getModelo() + ".");
    }

    public void paraFrente() {
        System.out.println("[PILOTO " + nome + "] movendo o drone " + drone.getModelo() + " para frente.");
    }

    public void paraTras() {
        System.out.println("[PILOTO " + nome + "] movendo o drone " + drone.getModelo() + " para trás.");
    }

    public void paraEsquerda() {
        System.out.println("[PILOTO " + nome + "] movendo o drone " + drone.getModelo() + " para esquerda.");
    }

    public void paraDireita() {
        System.out.println("[PILOTO " + nome + "] movendo o drone " + drone.getModelo() + " para direita.");
    }

    public void subir() {
        System.out.println("[PILOTO " + nome + "] subindo com o drone " + drone.getModelo() + ".");
    }

    public void descer() {
        System.out.println("[PILOTO " + nome + "] descendo com o drone " + drone.getModelo() + ".");
    }

    public void girarHorario() {
        System.out.println("[PILOTO " + nome + "] girando o drone " + drone.getModelo() + " no sentido horário.");
    }

    public void girarAntiHorario() {
        System.out.println("[PILOTO " + nome + "] girando o drone " + drone.getModelo() + " no sentido anti-horário.");
    }

    public void verificarBateria() {
        System.out.println("[PILOTO " + nome + "] verificando bateria do drone " + drone.getModelo() + ": " + drone.getBateria() + "%.");
    }

    public String getNome() { return nome; }
    public String getId() { return id; }
}