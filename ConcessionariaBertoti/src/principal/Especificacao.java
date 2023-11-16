/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author mto_l
 */
public class Especificacao {
    private String marca;
    private String modelo;
    private String corCarro;
    private String anoFab;

    public Especificacao(String marca, String modelo, String corCarro, String anoFab) {
        this.marca = marca;
        this.modelo = modelo;
        this.corCarro = corCarro;
        this.anoFab = anoFab;
    }
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Cor: " + corCarro + ", AnoFab: " + anoFab;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCorCarro() {
        return corCarro;
    }

    public void setCorCarro(String corCarro) {
        this.corCarro = corCarro;
    }
    
    public String getAnoFab(){
        return anoFab;
    }
    
    public void setAnoFab(String anoFab){
        this.anoFab = anoFab;
    }

    public boolean comparar(Especificacao especificacao){
        if(this.marca.equals(especificacao.marca)
                &&this.modelo.equals(especificacao.modelo)
                &&this.corCarro.equals(especificacao.corCarro)){
            return true;
        }else{
            return false;
        }    
    }
}
    

