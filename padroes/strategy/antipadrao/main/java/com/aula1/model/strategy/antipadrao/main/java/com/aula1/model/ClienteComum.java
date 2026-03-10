package strategy.antipadrao.main.java.com.aula1.model;

public abstract class ClienteComum extends Cliente {
    public ClienteComum(String nome, String email) {
        super(nome, email);
    }

    @Override
    public void calcularEmprestimo() {
        System.out.println("Calculando empréstimo para cliente comum: " + getNome());
    }
}