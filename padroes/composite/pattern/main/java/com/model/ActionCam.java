package composite.pattern.main.java.com.model;

public class ActionCam implements ComponenteDrone {
    private String nome;
    private double peso;
    private double custoManutencao;

    public ActionCam(String nome, double peso, double custoManutencao) {
        this.nome = nome;
        this.peso = peso;
        this.custoManutencao = custoManutencao;
    }

    @Override
    public String getNome() { return nome; }

    @Override
    public double getPeso() { return peso; }

    @Override
    public double getCustoManutencao() { return custoManutencao; }

    @Override
    public void exibir(String indent) {
        System.out.println(indent + "- ActionCam: " + nome + " | Peso: " + peso + "kg | Custo: R$" + custoManutencao);
    }
}