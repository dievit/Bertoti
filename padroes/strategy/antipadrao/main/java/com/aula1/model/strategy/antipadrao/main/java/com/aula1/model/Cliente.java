

public abstract class Cliente {
    public String nome;
    public String email;


    public Cliente (String nome, String email) {
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

    public void calcularEmprestimo() {
        throw new Exception("Método calcularEmprestimo() deve ser implementado nas subclasses.");
    }
}