package strategy.padrao.main;

import strategy.padrao.main.java.com.aula1.model.*;

public class Principal {
    public static void main(String[] args) {

        double valor = 10000;
        int meses = 24;

        Aposentado aposentado = new Aposentado("João Silva", "joao@email.com", "11-9999", "Rua das Flores, 50");
        aposentado.simularEmprestimo(valor, meses);

        Empresa empresa = new Empresa("Tech Ltda", "empresa@email.com", "11-8888", "Av. Principal, 100");
        empresa.simularEmprestimo(valor, meses);

        Estudante estudante = new Estudante("Carlos Souza", "carlos@email.com", "11-7777", "Rua B, 20");
        estudante.simularEmprestimo(valor, meses);

        System.out.println("\n-- Aposentado trocando para Empréstimo Empresarial --");
        aposentado.setEmprestimo(new EmprestimoEmpresa());
        aposentado.simularEmprestimo(valor, meses);
    }
}