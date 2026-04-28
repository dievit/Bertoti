package mvc.main.java.com.controller;

import mvc.main.java.com.model.DroneModel;

public class RemoverComponenteController implements AcaoController {
    private DroneModel model;
    private String nome;

    public RemoverComponenteController(DroneModel model, String nome, double peso, double custo) {
        this.model = model;
        this.nome = nome;
    }

    @Override
    public void executar() {
        model.removerComponente(nome);
    }
}