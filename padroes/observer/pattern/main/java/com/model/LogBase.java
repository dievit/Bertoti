package observer.pattern.main.java.com.model;

public class LogBase implements Observador {

    @Override
    public void notificar(String mensagem) {
        System.out.println("[LOG BASE] " + mensagem);
    }
}