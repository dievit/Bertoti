package br.com.bertoti.buscacep;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class CepController {

    @Autowired
    private EnderecoRepository repository;

    // 1. Método para buscar CEP na API externa e salvar no banco
    @GetMapping("/consulta/{cep}")
    public Endereco consultarCep(@PathVariable String cep) {
        // URL da API pública
        String url = "https://viacep.com.br/ws/" + cep + "/json/";

        // RestTemplate é quem faz a requisição HTTP
        RestTemplate restTemplate = new RestTemplate();
        Endereco enderecoEncontrado = restTemplate.getForObject(url, Endereco.class);

        // Se encontrou algo, salvamos no banco para ter histórico
        if (enderecoEncontrado != null && enderecoEncontrado.getCep() != null) {
            repository.save(enderecoEncontrado);
        }

        return enderecoEncontrado;
    }

    // 2. Método para listar todo o histórico salvo no banco
    @GetMapping("/historico")
    public List<Endereco> listarHistorico() {
        return repository.findAll();
    }
}