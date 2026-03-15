package strategy.padrao.main;

import strategy.padrao.main.java.com.aula1.model.Aposentado;
import strategy.padrao.main.java.com.aula1.model.Cliente;
import strategy.padrao.main.java.com.aula1.model.Empresa;
import strategy.padrao.main.java.com.aula1.model.Estudante;
import strategy.padrao.main.java.com.aula1.model.EmprestimoConsignado;
import strategy.padrao.main.java.com.aula1.model.EmprestimoEmpresa;

public class Principal {
    public static void main(String[] args) {
        //Aposentado apo1 = new Aposentado("João Silva", "joao@email.com", "11-9999", "Rua das Flores, 50");
        Empresa emp1 = new Empresa("Empresa Exemplo", "empresa@email.com", "11-8888", "Avenida Principal, 100");

        double valorPrincipal = 1000000; // Exemplo de valor
        int meses = 96; // Exemplo de prazo

        //apo1.simularEmprestimo(valorPrincipal, meses);
        emp1.simularEmprestimo(valorPrincipal, meses);
}
}
