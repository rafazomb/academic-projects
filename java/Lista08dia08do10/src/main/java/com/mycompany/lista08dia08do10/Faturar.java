/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista08dia08do10;

/**
 *
 * @author João Silva, Nathan e Rafael
 */
public class Faturar {
    private int numeroItem;
    private String descricaoItem;
    private int quantidadeComprada;
    private double precoUnitario;
 
    public Faturar(int numeroItem, String descricaoItem, int quantidadeComprada, double precoUnitario) {
        this.numeroItem = numeroItem;
        this.descricaoItem = descricaoItem;
        this.quantidadeComprada = quantidadeComprada;
        this.precoUnitario = precoUnitario;
    }
 
    public int getNumeroItem() {
        return numeroItem;
    }
 
    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }
 
    public String getDescricaoItem() {
        return descricaoItem;
    }
 
    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }
 
    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }
 
    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }
 
    public double getPrecoUnitario() {
        return precoUnitario;
    }
 
    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
 
    public double getFaturaTotal() {
        return quantidadeComprada * precoUnitario;
    }
 
    @Override
    public String toString() {
        return "Fatura: " +
                "Número do Item: " + numeroItem +
                ", Descrição: '" + descricaoItem + '\'' +
                ", Quantidade: " + quantidadeComprada +
                ", Preço Unitário: " + precoUnitario +
                ", Total: " + getFaturaTotal();
    }
}
