/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author mto_l
 */
public class Carro {
    private String placa;
    private Especificacao espec;

    public Carro(String placa, Especificacao espec) {
        this.placa = placa;
        this.espec = espec;
    }
    
    public String toString(){
        return "Placa: " + placa + ", Especificacao: " + espec;
    }
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Especificacao getEspec() {
        return espec;
    }

    public void setEspec(Especificacao espec) {
        this.espec = espec;
    }
    
}
