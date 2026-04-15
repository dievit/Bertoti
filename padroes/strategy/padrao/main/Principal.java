package strategy.padrao.main;

import strategy.padrao.main.java.com.aula1.model.CalcularEmprestimo;
import strategy.padrao.main.java.com.aula1.model.Cliente;
import strategy.padrao.main.java.com.aula1.model.EmprestimoConsignado;
import strategy.padrao.main.java.com.aula1.model.EmprestimoEmpresa;

public class Principal {
    public static void main(String[] args) {

        double valor = 10000;
        int meses = 24;

        Cliente joao = new Cliente("João Silva", "joao@email.com", "11-9999", "Rua das Flores, 50");
        joao.setEmprestimo(new EmprestimoConsignado());
        joao.simularEmprestimo(valor, meses);

        Cliente tech = new Cliente("Tech Ltda", "tech@email.com", "11-8888", "Av. Principal, 100");
        tech.setEmprestimo(new EmprestimoEmpresa());
        tech.simularEmprestimo(valor, meses);

        Cliente carlos = new Cliente("Carlos Souza", "carlos@email.com", "11-7777", "Rua B, 20");
        carlos.simularEmprestimo(valor, meses);

        System.out.println("\n-- João trocando para Empréstimo Empresarial --");
        joao.setEmprestimo(new EmprestimoEmpresa());
        joao.simularEmprestimo(valor, meses);
    }
}