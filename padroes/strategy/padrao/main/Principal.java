package strategy.padrao.main;

import strategy.padrao.main.java.com.aula1.model.Aposentado;
import strategy.padrao.main.java.com.aula1.model.Cliente;
import strategy.padrao.main.java.com.aula1.model.Estudante;
import strategy.padrao.main.java.com.aula1.model.EmprestimoConsignado;
import strategy.padrao.main.java.com.aula1.model.EmprestimoEmpresa;

public class Principal {
    public static void main(String[] args) {
        new Principal();
        Cliente cliente1 = new Aposentado("Seu João", "joao@email.com", "11-9999", "Rua das Flores, 50");
        Cliente cliente2 = new Estudante("Maria", "maria@faculdade.com", "11-8888", "Av. Universitária, 100");

        cliente1.setEmprestimo(new EmprestimoConsignado());
        cliente2.setEmprestimo(new EmprestimoEmpresa());

        System.out.println("=== SISTEMA DE EMPRÉSTIMOS (PADRÃO STRATEGY) ===");
        cliente1.exibirInfo();
        cliente2.exibirInfo();

        System.out.println("\n--- Atualizando cadastro da Maria ---");
        cliente2.setEmprestimo(new EmprestimoConsignado());
        cliente2.exibirInfo();
    }
}
