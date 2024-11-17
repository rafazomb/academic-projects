/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.aula10do09;
import javax.swing.JOptionPane;

/**
 *6ª) Criar um programa que receba um número que corresponda a um mês do 1º trimestre e 
escreva o mês correspondente; caso o usuário digite o número fora do intervalo deverá 
aparecer inválido, mas utilizando um método do tipo void.
 * @author João Silva, Nathan e Rafael
 */
public class ex06 {
    public static void mes(int numero){
        switch (numero){
            case 1:
                JOptionPane.showMessageDialog(null,"O mês equivalente ao número é \nJaneiro", "EX06", 1);
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"O mês equivalente ao número é \nFevereiro", "EX06", 1);
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"O mês equivalente ao número é \nMarço", "EX06", 1);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Número invalido.", "EX06", 1);
                break;
        }
    } 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String val = JOptionPane.showInputDialog(null,"Digite um número de um mês do primeiro trimestre:","EX06",1);
        int meses = Integer.parseInt(val);
        mes(meses);
    }
    
}
