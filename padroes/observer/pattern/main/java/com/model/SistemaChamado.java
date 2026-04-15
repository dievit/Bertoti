package observer.pattern.main.java.com.model;

public class SistemaChamado implements Observador {

    @Override
    public void notificar(String mensagem) {
        System.out.println("[CHAMADO MANUTENÇÃO] Chamado aberto automaticamente: " + mensagem);
    }
}