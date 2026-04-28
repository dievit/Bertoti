package mvc.main.java.com.model;

import java.util.ArrayList;
import java.util.List;

public class DroneModel {
    private String nome;
    private List<Observador> observadores = new ArrayList<>();

    // Representa um componente com nome, peso e custo
    public static class Componente {
        public String nome;
        public double peso;
        public double custo;

        public Componente(String nome, double peso, double custo) {
            this.nome = nome;
            this.peso = peso;
            this.custo = custo;
        }

        @Override
        public String toString() {
            return nome + " | Peso: " + peso + "kg | Custo: R$" + custo;
        }
    }

    private List<Componente> componentes = new ArrayList<>();

    public DroneModel(String nome) {
        this.nome = nome;
    }

    public void adicionarObservador(Observador o) {
        observadores.add(o);
    }

    private void notificarObservadores() {
        for (Observador o : observadores) {
            o.atualizar();
        }
    }

    public void adicionarComponente(String nome, double peso, double custo) {
        componentes.add(new Componente(nome, peso, custo));
        notificarObservadores();
    }

    public void removerComponente(String nome) {
        componentes.removeIf(c -> c.nome.equals(nome));
        notificarObservadores();
    }

    public double getPesoTotal() {
        return componentes.stream().mapToDouble(c -> c.peso).sum();
    }

    public double getCustoTotal() {
        return componentes.stream().mapToDouble(c -> c.custo).sum();
    }

    public List<Componente> getComponentes() { return componentes; }
    public String getNome() { return nome; }
}