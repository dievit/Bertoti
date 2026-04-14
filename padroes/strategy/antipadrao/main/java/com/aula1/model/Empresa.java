package strategy.antipadrao.main.java.com.aula1.model;

public class Empresa extends Cliente {

    public Empresa(String nome, String email) {
        super(nome, email);
    }

    @Override
    public void calcularEmprestimo() {
        double taxa = 0.045;
        System.out.println("Calculando empréstimo para empresa: " + getNome());
        System.out.printf("Taxa aplicada: %.2f%% a.m.%n", taxa * 100);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Cliente Empresa: " + getNome() + " | Email: " + getEmail());
    }
}
