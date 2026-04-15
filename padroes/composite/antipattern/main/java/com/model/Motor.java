package composite.antipattern.main.java.com.model;

public class Motor {
    private String nome;
    private double peso;
    private double custoManutencao;

    public Motor(String nome, double peso, double custoManutencao) {
        this.nome = nome;
        this.peso = peso;
        this.custoManutencao = custoManutencao;
    }

    public String getNome() { return nome; }
    public double getPeso() { return peso; }
    public double getCustoManutencao() { return custoManutencao; }
}