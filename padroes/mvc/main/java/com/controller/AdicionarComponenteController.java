package mvc.main.java.com.controller;

import mvc.main.java.com.model.DroneModel;

public class AdicionarComponenteController implements AcaoController {
    private DroneModel model;
    private String nome;
    private double peso;
    private double custo;

    public AdicionarComponenteController(DroneModel model, String nome, double peso, double custo) {
        this.model = model;
        this.nome = nome;
        this.peso = peso;
        this.custo = custo;
    }

    @Override
    public void executar() {
        model.adicionarComponente(nome, peso, custo);
    }
}