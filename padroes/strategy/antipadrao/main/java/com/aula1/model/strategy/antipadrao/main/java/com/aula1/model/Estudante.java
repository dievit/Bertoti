package strategy.antipadrao.main.java.com.aula1.model;



public class Estudante extends Cliente {
    public Estudante(String nome, String email) {
        super(nome, email);
    }

    @Override
    public void calcularEmprestimo() {
        throw new UnsupportedOperationException("Estudantes não podem solicitar empréstimos.");
    }
}
