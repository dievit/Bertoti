package strategy.padrao.main.java.com.aula1.model;

public class Aposentado extends Cliente {
    public Aposentado(String nome, String email, String telefone, String endereco) {
        super(nome, email, telefone, endereco);
        this.setEmprestimo(new EmprestimoConsignado());

    }


}

