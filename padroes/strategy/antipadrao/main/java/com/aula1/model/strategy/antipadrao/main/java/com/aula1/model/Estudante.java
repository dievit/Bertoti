package com.aula1.model;

public class Estudante extends Cliente {
    public Estudante(String nome, String email) {
        super(nome, email);
    }

    public void exibirInfo() {
        System.out.println("Cliente estudante: " + getNome());
    }

}
