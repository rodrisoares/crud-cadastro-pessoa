/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

public class Endereco {
    
   // (Rua, numero, complemento, cidade, estado e CEP
    
    private String rua;
    private String complemento;
    private String cidade;
    private String estado;
    private String cep;
    private Integer numero;

    public Endereco(){
    }
    
    public Endereco(String rua, String complemento, String cidade, String estado, String cep, Integer numero) {
        this.rua = rua;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.numero = numero;
        
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
    
    

    @Override
    public String toString() {
        return "" + cidade + "-" + estado + ","
                + "Rua: " + rua + " Numero: " + numero +  " Complemento: " + complemento;
    }
    
    
    
    
}
