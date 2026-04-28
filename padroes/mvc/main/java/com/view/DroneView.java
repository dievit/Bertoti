package mvc.main.java.com.view;

import mvc.main.java.com.controller.AcaoController;
import mvc.main.java.com.controller.AdicionarComponenteController;
import mvc.main.java.com.controller.RemoverComponenteController;
import mvc.main.java.com.model.DroneModel;
import mvc.main.java.com.model.Observador;

import javax.swing.*;
import java.awt.*;

public class DroneView extends JFrame implements Observador {
    private DroneModel model;

    private JLabel labelPeso;
    private JLabel labelCusto;
    private DefaultListModel<String> listModel;
    private JComboBox<String> comboComponentes;

    private final String[] nomes  = {"Motor", "Sensor", "Bateria", "GPS", "ActionCam"};
    private final double[] pesos  = { 0.8,     0.2,      0.5,      0.1,   0.3 };
    private final double[] custos = { 150.0,   80.0,     120.0,    100.0, 200.0 };

    public DroneView(DroneModel model) {
        this.model = model;
        this.model.adicionarObservador(this);
        inicializarUI();
    }

    private void inicializarUI() {
        setTitle("Gerenciador de Drone — MVC");
        setSize(550, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        JPanel painelInfo = new JPanel(new GridLayout(3, 1));
        painelInfo.setBorder(BorderFactory.createTitledBorder("Drone: " + model.getNome()));
        labelPeso  = new JLabel("Peso Total: 0.00 kg");
        labelCusto = new JLabel("Custo Total: R$ 0.00");
        painelInfo.add(new JLabel(" "));
        painelInfo.add(labelPeso);
        painelInfo.add(labelCusto);

        listModel = new DefaultListModel<>();
        JList<String> listaComponentes = new JList<>(listModel);
        JPanel painelLista = new JPanel(new BorderLayout());
        painelLista.setBorder(BorderFactory.createTitledBorder("Componentes Instalados"));
        painelLista.add(new JScrollPane(listaComponentes), BorderLayout.CENTER);

        comboComponentes = new JComboBox<>(nomes);
        JButton btnAdicionar = new JButton("Adicionar");
        JButton btnRemover   = new JButton("Remover");

        btnAdicionar.addActionListener(e -> {
            int i = comboComponentes.getSelectedIndex();
            AcaoController acao = new AdicionarComponenteController(
                model, nomes[i], pesos[i], custos[i]
            );
            acao.executar();
        });

        btnRemover.addActionListener(e -> {
            int i = comboComponentes.getSelectedIndex();
            AcaoController acao = new RemoverComponenteController(
                model, nomes[i], pesos[i], custos[i]
            );
            acao.executar();
        });

        JPanel painelBotoes = new JPanel(new GridLayout(1, 3, 10, 0));
        painelBotoes.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        painelBotoes.add(comboComponentes);
        painelBotoes.add(btnAdicionar);
        painelBotoes.add(btnRemover);

        JPanel painelPrincipal = new JPanel(new BorderLayout(10, 10));
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        painelPrincipal.add(painelInfo,   BorderLayout.NORTH);
        painelPrincipal.add(painelLista,  BorderLayout.CENTER);
        painelPrincipal.add(painelBotoes, BorderLayout.SOUTH);

        add(painelPrincipal);
        setVisible(true);
    }

    @Override
    public void atualizar() {
        listModel.clear();
        for (DroneModel.Componente c : model.getComponentes()) {
            listModel.addElement(c.toString());
        }
        labelPeso.setText(String.format("Peso Total: %.2f kg", model.getPesoTotal()));
        labelCusto.setText(String.format("Custo Total: R$ %.2f", model.getCustoTotal()));
    }
}