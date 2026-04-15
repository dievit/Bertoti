package observer.pattern.main.java.com.model;

public class AlertaPiloto implements Observador {
    private String nomePiloto;

    public AlertaPiloto(String nomePiloto) {
        this.nomePiloto = nomePiloto;
    }

    @Override
    public void notificar(String mensagem) {
        System.out.println("[ALERTA PILOTO - " + nomePiloto + "] " + mensagem);
    }
}