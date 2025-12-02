package br.com.bertoti.buscacep;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class CepController {

    @Autowired
    private EnderecoRepository repository;

    @PostMapping("/consulta")
    public Endereco consultarCep(@RequestBody String cep) {
        String cepLimpo = cep.replaceAll("[^0-9]", "");
        String url = "https://viacep.com.br/ws/" + cepLimpo + "/json/";

        RestTemplate restTemplate = new RestTemplate();
        Endereco enderecoEncontrado = restTemplate.getForObject(url, Endereco.class);

        if (enderecoEncontrado != null && enderecoEncontrado.getCep() != null) {
            repository.save(enderecoEncontrado);
        }

        return enderecoEncontrado;
    }

    @GetMapping("/historico")
    public List<Endereco> listarHistorico() {
        return repository.findAll();
    }

    @GetMapping("/relatorio")
    public String gerarRelatorio() {
        try {
            List<Endereco> todoHistorico = repository.findAll();

            String pastaUsuario = System.getProperty("user.home");
            String caminhoArquivo = pastaUsuario + java.io.File.separator + "Downloads" + java.io.File.separator
                    + "relatorio_ceps.txt";

            BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo, false));

            writer.write("--- RELATÓRIO DE CEPS PESQUISADOS ---\n");
            writer.write("Gerado em: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"))
                    + "\n\n");

            for (Endereco item : todoHistorico) {
                String linha = String.format("CEP: %s | Rua: %s | Cidade: %s | UF: %s\n",
                        item.getCep(), item.getLogradouro(), item.getLocalidade(), item.getUf());
                writer.write(linha);
            }

            writer.close();
            return "Arquivo gerado com sucesso em: " + caminhoArquivo;

        } catch (IOException e) {
            e.printStackTrace();
            return "Erro ao gerar arquivo: " + e.getMessage();
        }
    }
}