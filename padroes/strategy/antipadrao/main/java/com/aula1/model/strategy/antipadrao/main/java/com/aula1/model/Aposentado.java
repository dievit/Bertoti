public class Aposentado extends Cliente {
    public Aposentado(String nome, String email) {
        super(nome, email);
    }

    public void exibirInfo() {
        System.out.println("Cliente aposentado: " + getNome());
    }
}