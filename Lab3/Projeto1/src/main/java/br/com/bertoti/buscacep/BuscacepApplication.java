package br.com.bertoti.buscacep; // Mantenha o nome do SEU pacote aqui

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import java.awt.Desktop;
import java.net.URI;

@SpringBootApplication
public class BuscacepApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuscacepApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void abrirNavegador() {
		System.out.println("Aplicação pronta! Tentando abrir o navegador...");

		try {
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
				Desktop.getDesktop().browse(new URI("http://localhost:8080"));
			} else {
				Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler http://localhost:8080");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}