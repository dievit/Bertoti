package strategy.antipadrao.main.java.com.aula1.model;

public class Aposentado extends Cliente {

    public Aposentado(String nome, String email) {
        super(nome, email);
    }

    @Override
    public void calcularEmprestimo() {
        double taxa = 0.021;
        System.out.println("Empréstimo consignado para aposentado: " + getNome());
        System.out.printf("Taxa aplicada: %.2f%% a.m.%n", taxa * 100);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Cliente Aposentado: " + getNome() + " | Email: " + getEmail());
    }
}