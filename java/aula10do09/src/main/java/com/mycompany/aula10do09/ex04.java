/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.aula10do09;

import javax.swing.JOptionPane;
/**
 *4ª) Criar um programa que receba um grau e o converta para radianos através de um 
método.
Fórmula: radiano = grau * pi / 180
 * @author João Silva, Nathan e Rafael
 */
public class ex04 {
    public static double radi(double grau){
        double radi = grau * 3.14/180;
        return radi;
    }
 
    public static void main(String[] args) {
       double grau, rad;
       String num = JOptionPane.showInputDialog(null, "Digite o numero em graus");
       grau = Double.parseDouble(num);
       rad = radi(grau);
       JOptionPane.showMessageDialog(null, "O resultado é:\n"+rad, "Valor em radianos",1);
    }
}
