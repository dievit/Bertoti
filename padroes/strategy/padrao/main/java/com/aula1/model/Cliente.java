package strategy.padrao.main.java.com.aula1.model;

public abstract class Cliente {
    protected String nome;
    protected String email;
    protected String telefone;
    protected String endereco;
    protected CalcularEmprestimo categoriaEmprestimo;

    public Cliente(String nome, String email, String telefone, String endereco) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public void setEmprestimo(CalcularEmprestimo categoria) {
        this.categoriaEmprestimo = categoria;

    }

    public void simularEmprestimo(double valorPrincipal, int meses) {
        System.out.println("----------------------------------");
        System.out.println("Simulação para: " + this.nome);
        
        if (categoriaEmprestimo != null) {
            categoriaEmprestimo.calcular(valorPrincipal, meses);
        } else {
            System.out.println("Status: Sem empréstimo disponível.");
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public CalcularEmprestimo getCategoriaEmprestimo() {
        return categoriaEmprestimo;
    }

}
