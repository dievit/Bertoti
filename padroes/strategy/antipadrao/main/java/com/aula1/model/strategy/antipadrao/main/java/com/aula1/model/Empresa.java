package strategy.antipadrao.main.java.com.aula1.model;

public abstract class Empresa extends Cliente {
    public Empresa(String nome, String email) {
        super(nome, email);
    }

    @Override
    public void calcularEmprestimo() {
        throw new UnsupportedOperationException("Empresas não podem solicitar empréstimos.");
    }

    @Override
    public void exibirInfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exibirInfo'");
    }
}
