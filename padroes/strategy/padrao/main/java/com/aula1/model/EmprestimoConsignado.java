package strategy.padrao.main.java.com.aula1.model;

public class EmprestimoConsignado implements CalcularEmprestimo {
    @Override
    public void calcular() {
        System.out.println("Calculando empréstimo consignado...");
    }

}
