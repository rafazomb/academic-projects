/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.codigorobo;

/**
 *
 * @author rafaz
 */
public class CodigoRobo {
    public static void main(String[] args) {
        String nomeRobo = "Zomb";
        Robo roboZomb = new Robo(nomeRobo,"14/08/2024",10);
        System.out.println(roboZomb.getNome() + " criado no dia " + roboZomb.getDataFabricacao());
        System.out.println(roboZomb.getBateria());
    }
}
