package strategy.antipadrao.main.java.com.aula1;

import strategy.antipadrao.main.java.com.aula1.model.*;

public class Principal {
    public static void main(String[] args) {

        Aposentado aposentado = new Aposentado("José Silva", "jose@email.com");
        aposentado.exibirInfo();
        aposentado.calcularEmprestimo();

        System.out.println();

        ClienteComum clienteComum = new ClienteComum("Ana Lima", "ana@email.com");
        clienteComum.exibirInfo();
        clienteComum.calcularEmprestimo();

        System.out.println();

        Empresa empresa = new Empresa("Tech Ltda", "contato@tech.com");
        empresa.exibirInfo();
        empresa.calcularEmprestimo();

        System.out.println();

        Estudante estudante = new Estudante("Carlos Souza", "carlos@email.com");
        estudante.exibirInfo();
        try {
            estudante.calcularEmprestimo();
        } catch (UnsupportedOperationException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}