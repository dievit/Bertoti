package strategy.antipadrao.main.java.com.aula1.model;

public class Aposentado extends Cliente {
    public Aposentado(String nome, String email) {
        super(nome, email);
    }

    @Override
    public void calcularEmprestimo() {
        System.out.println("Calculando empréstimo para aposentado: " + getNome());
    }

    @Override
    public void exibirInfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exibirInfo'");
    }
}