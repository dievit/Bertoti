package composite.antipattern.main.java.com.model;

public class Drone {
    private String nome;
    private Motor motor;
    private Sensor sensor;
    private Bateria bateria;

    public Drone(String nome, Motor motor, Sensor sensor, Bateria bateria) {
        this.nome = nome;
        this.motor = motor;
        this.sensor = sensor;
        this.bateria = bateria;
    }

    public double calcularPesoTotal() {
        return motor.getPeso() + sensor.getPeso() + bateria.getPeso();
    }

    public double calcularCustoManutencao() {
        return motor.getCustoManutencao() + sensor.getCustoManutencao() + bateria.getCustoManutencao();
    }

    public void exibirResumo() {
        System.out.println("=== Drone: " + nome + " ===");
        System.out.println("Componentes:");
        System.out.println("  - " + motor.getNome() + " | Peso: " + motor.getPeso() + "kg | Custo: R$" + motor.getCustoManutencao());
        System.out.println("  - " + sensor.getNome() + " | Peso: " + sensor.getPeso() + "kg | Custo: R$" + sensor.getCustoManutencao());
        System.out.println("  - " + bateria.getNome() + " | Peso: " + bateria.getPeso() + "kg | Custo: R$" + bateria.getCustoManutencao());
        System.out.printf("Peso Total: %.2f kg%n", calcularPesoTotal());
        System.out.printf("Custo Total de Manutenção: R$ %.2f%n", calcularCustoManutencao());
    }

    public String getNome() { return nome; }
}