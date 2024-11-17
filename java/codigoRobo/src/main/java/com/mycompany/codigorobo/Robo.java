/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.codigorobo;

/**
 *
 * @author rafaz
 */
public class Robo {

	private String nome;
	private String dataFabricacao;
	private int bateria;

	public void setNome(String nome) {
            this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setDataFabricacao(String dataFabricacao) {
            this.dataFabricacao = dataFabricacao;
	}

	public String getDataFabricacao() {
		return this.dataFabricacao;
	}

	public void setBateria(int bateria) {
            this.bateria = bateria;
	}

	public int getBateria() {
		return this.bateria;
	}

    public Robo(String nome, String dataFabricacao, int bateria) {
        this.nome = nome;
        this.dataFabricacao = dataFabricacao;
        this.bateria = bateria;
    }
}
