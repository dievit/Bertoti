package strategy.antipadrao.main.java.com.aula1;

import strategy.antipadrao.main.java.com.aula1.model.Cliente;

public class main {
    public main(String[] args) {
        // Criando clientes
        Cliente cliente1 = new Cliente("João", "joao@test.com") {
            @Override
            public void exibirInfo() {
                System.out.println("Cliente: " + nome + ", Email: " + email);
                try {
                    calcularEmprestimo(); // Tenta calcular para todos
                } catch (Exception e) {
                    System.out.println("Erro: " + e.getMessage());
                }
            }
        };

        Cliente cliente2 = new Cliente("Maria", "maria@test.com") {
            @Override
            public void exibirInfo() {
                System.out.println("Cliente: " + nome + ", Email: " + email);
                try {
                    calcularEmprestimo(); // Tenta calcular para todos
                } catch (Exception e) {
                    System.out.println("Erro: " + e.getMessage());
                }
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
