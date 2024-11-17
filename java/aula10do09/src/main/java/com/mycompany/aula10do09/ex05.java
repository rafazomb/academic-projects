/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.aula10do09;

import javax.swing.JOptionPane;
/**
 *5ª) Criar um programa que mostre qual o maior valor entre dois números, utilizando um 
método do tipo void (que não retorna valores). 
 * @author João Silva, Nathan e Rafael
 */
public class ex05 {

    public static void valor(int val1, int val2){
         if (val1 > val2) {
            JOptionPane.showMessageDialog(null, "O resultado maior é:\n"+val1, "Valor maior",1); 
         } else {  
       JOptionPane.showMessageDialog(null, "O resultado maior é:\n"+val2, "Valor maior",1); 
         }
    }
 
    public static void main(String[] args) {
       int val1, val2;
       String num = JOptionPane.showInputDialog(null, "Digite um numero");
        val1 =Integer.parseInt(num);
        num = JOptionPane.showInputDialog(null, "Digite o segundo numero");
       val2 =Integer.parseInt(num);
       valor (val1, val2);
    }
}
