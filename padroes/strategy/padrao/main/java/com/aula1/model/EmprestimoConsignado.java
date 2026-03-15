package strategy.padrao.main.java.com.aula1.model;

public class EmprestimoConsignado implements CalcularEmprestimo {
    
    @Override
    public void calcular(double valor, int meses) {
        double taxaMensal = 0.021; // 2.1% ao mês (Taxa comum de consignado)
        
        // M = P * (1 + i) ^ n
        double montante = valor * Math.pow((1 + taxaMensal), meses);
        double parcela = montante / meses;

        System.out.println("--- DETALHES DO EMPRÉSTIMO CONSIGNADO ---");
        System.out.printf("Valor Solicitado: R$ %.2f%n", valor);
        System.out.printf("Taxa de Juros: %.2f%% a.m.%n", taxaMensal * 100);
        System.out.printf("Prazo: %d meses%n", meses);
        System.out.printf("Valor da Parcela: R$ %.2f%n", parcela);
        System.out.printf("TOTAL A PAGAR: R$ %.2f%n", montante);
        System.out.println("---------------------------------------");
    }
}