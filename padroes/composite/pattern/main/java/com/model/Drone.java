package composite.pattern.main.java.com.model;

import java.util.ArrayList;
import java.util.List;

public class Drone implements ComponenteDrone {
    private String nome;
    private List<ComponenteDrone> componentes = new ArrayList<>();

    public Drone(String nome) {
        this.nome = nome;
    }

    public void adicionar(ComponenteDrone componente) {
        componentes.add(componente);
    }

    public void remover(ComponenteDrone componente) {
        componentes.remove(componente);
    }

    @Override
    public String getNome() { return nome; }

    @Override
    public double getPeso() {
        return componentes.stream().mapToDouble(ComponenteDrone::getPeso).sum();
    }

    @Override
    public double getCustoManutencao() {
        return componentes.stream().mapToDouble(ComponenteDrone::getCustoManutencao).sum();
    }

    @Override
    public void exibir(String indent) {
        System.out.println(indent + "=== Drone: " + nome + " ===");
        for (ComponenteDrone c : componentes) {
            c.exibir(indent + "  ");
        }
        System.out.printf(indent + "Peso Total: %.2f kg%n", getPeso());
        System.out.printf(indent + "Custo Total de Manutenção: R$ %.2f%n", getCustoManutencao());
    }
}