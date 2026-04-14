package strategy.antipadrao.main.java.com.aula1.model;

public abstract class Cliente {
    public String nome;
    public String email;

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

    public abstract void calcularEmprestimo();
    public abstract void exibirInfo();
}