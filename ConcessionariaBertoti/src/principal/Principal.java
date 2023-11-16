/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import java.util.List;
import java.util.Scanner;
/**
 *
 * @author mto_l
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        //criando as especificacoes
        Especificacao espec1 = new Especificacao("GM","Onix","Prata","2023");
        Especificacao espec2 = new Especificacao("GM","Tracker","Preto","2023");
        Especificacao espec3 = new Especificacao("GM","Onix","Branco","2023");
        Especificacao espec4 = new Especificacao("GM","Tracker","Azul","2024");
        //criando os carros
        Carro carro1 =  new Carro("ADS-2S23", espec1);
        Carro carro2 = new Carro("DSM-2S23",espec2);
        Carro carro3 = new Carro("LOG-2S21",espec3);
        Carro carro4 = new Carro("MAN-1S20",espec4);
        
        //criando a concessionaria
        Concessionaria concessionaria = new Concessionaria();
        //cadastrando veículo
        concessionaria.cadastrarCarro(carro1);
        concessionaria.cadastrarCarro(carro2);
        concessionaria.cadastrarCarro(carro3);
        concessionaria.cadastrarCarro(carro4);
        
        //Buscando por especificacao
        System.out.println("Busca por pacote de especificacao: ");
        List<Carro> carrosEncontrados = concessionaria.buscarCarroPorEspecificacao(espec3);
        System.out.println("Carros encontrados por especificacao: ");
        for(Carro carro: carrosEncontrados){
            System.out.println("Placa: " + carro.getPlaca());
        }
        //Busca por placa
        System.out.println("Digite a placa do veiculo: ");
        String placaBusca = scanner.next();
        
        Carro carroEncontrado = concessionaria.buscarCarroPorPlaca(placaBusca);
        if(carroEncontrado != null){
            System.out.println("Carro encontrado pela placa: " + carroEncontrado);
        }else{
            System.out.println("Carro nao encontrado pela placa " + placaBusca);
        }
        
    }
    
}
