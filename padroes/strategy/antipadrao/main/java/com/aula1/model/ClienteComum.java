package strategy.antipadrao.main.java.com.aula1.model;

public class ClienteComum extends Cliente {

    public ClienteComum(String nome, String email) {
        super(nome, email);
    }
    @Override
    public void calcularEmprestimo() {
        double taxa = 0.038;
        System.out.println("Calculando empréstimo para cliente comum: " + getNome());
        System.out.printf("Taxa aplicada: %.2f%% a.m.%n", taxa * 100);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Cliente Comum: " + getNome() + " | Email: " + getEmail());
    }
}