package strategy.antipadrao.main.java.com.aula1;

import strategy.antipadrao.main.java.com.aula1.model.Cliente;

public class main {
    public static void main(String[] args) {
        // Criando clientes
        Cliente cliente1 = new Cliente("João") {
            @Override
            public void exibirInfo() {
                System.out.println("Cliente: " + nome);
                System.out.println("Empréstimo: " + emprestar);
            }
        };

        Cliente cliente2 = new Cliente("Maria") {
            @Override
            public void exibirInfo() {
                System.out.println("Cliente: " + nome);
                System.out.println("Empréstimo: " + emprestar);
            }
        };

        // Definindo empréstimos
        cliente1.emprestar = "Empréstimo Pessoal";
        cliente2.emprestar = "Empréstimo Imobiliário";

        // Exibindo informações dos clientes
        cliente1.exibirInfo();
        cliente2.exibirInfo();
    }
}
