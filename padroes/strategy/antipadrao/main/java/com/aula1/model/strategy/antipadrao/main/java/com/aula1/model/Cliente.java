package strategy.antipadrao.main.java.com.aula1.model;

import strategy.padrao.main.java.com.aula1.model.EmprestimoConsignado;

public abstract class Cliente {
    public String nome;
    public String email;
    public String emprestar;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void calcularEmprestimo() throws Exception {
        if (this.emprestar == null || this.emprestar.isEmpty()) {
            throw new Exception("Tipo de empréstimo não definido para este cliente.");
        }
        System.out.println("Processando: " + this.emprestar);
    }

    public abstract void exibirInfo();

    protected abstract void setEmprestimo(EmprestimoConsignado emprestimoConsignado);
}